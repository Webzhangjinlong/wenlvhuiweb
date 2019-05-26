// 配置扩展方法路径
layui.config({
    base: './../frame/static/js/'   // 模块目录
}).extend({                         // 模块别名
    vip_nav: 'vip_nav'
    , vip_tab: 'vip_tab'
    , vip_table: 'vip_table'
});

// layui方法
layui.use(['table', 'form', 'layer', 'vip_table'], function () {

    // 操作对象
    var form = layui.form
        , table = layui.table
        , layer = layui.layer
        , vipTable = layui.vip_table
        , $ = layui.jquery;

    // 表格渲染
    var tableIns = table.render({
        // id:'id',
        elem: '#dateTable'
        , height: vipTable.getFullHeight()-120
        , cols: [
            [
                {type: 'checkbox', fixed: 'left'}
                , {field: 'id', title: '序号', width: 120}
                , {field: 'role_name', title: '角色名', width: 250}
                , {field: 'role_pid', title: '上级id', width: 190}
                , {field: 'create_user', title: '创建人', width: 180}
                , {field: 'create_time', title: '创建时间', width: 180, sort: true}
                , {fixed: 'right', title: '操作', width: 450, align: 'center', toolbar: '#barOption'} //这里的toolbar值是模板元素的选择器
            ]
        ]
        , id: 'dataCheck'
        , url: '/system/findAllRole'
        , method: 'get'
        , page: true
        , limits:[10,50,100,300]
        , limit: 10
        , loading: false
        , done: function (res, curr, count) {

            
        }
    });


    var $ = layui.$, active = {
        reload: function(){
            var check_text = $('#check_text').val();
            //执行重载
            table.reload('dataCheck', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                	roleName: check_text
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

    var edit_role = null;
    var update = null;
    //监听工具条
    table.on('tool(delivery_charge)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        if (layEvent === 'detail') { //查看
            $('#detail').removeClass("layui-hide");
            $('#role_name_find').html(data.role_name);//商品名称
            $('#role_pid_find').html(data.role_pid);//商品编码

            var show = layer.open({
                type: 1,
                title: '角色信息',
                offset: 'auto',
                // shadeClose: true,
                area: ['500px', '300px'],
                content: $('#detail'), //这里content是一个普通的String
                btn: ['关闭']
                , yes: function (index, layero) {
                    $('#detail').addClass("layui-hide");
                    layer.close(show);
                }, cancel: function () {
                    //右上角关闭回调
                    $('#detail').addClass("layui-hide");
                    //return false 开启该代码可禁止点击该按钮关闭
                },
                btnAlign: 'c'
            });
            // alert(data.commodity_name);
        } else if (layEvent === 'del') { //删除
            layer.confirm('确认删除该角色？', function (index) {
                // obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
                var params = {"id": data.id};
                var deleteIndex = layer.load(1, {shade: [0.1, '#fff']});
                $.ajax({
                    url: '/system/del_role',
                    data: JSON.stringify(params),
                    method: "POST",
                    contentType: "application/json;charset=utf-8",
                    // dataType: "json",
                    success: function (msg) {
                        if (msg.result == '2000') {
                            layer.close(deleteIndex);
                            tableIns.reload();//刷新
                            layer.msg('删除成功');
                        }
                    },
                    error: function (error) {
                        layer.close(deleteIndex);
                        console.info(error);
                    }
                });

            });
        } else if (layEvent === 'edit') { //编辑
            $('#update')[0].reset();//清空
            $('#update').removeClass('layui-hide');//去掉隐藏
            $('#id_update').val(data.id);//id
            $('#role_name_edit').val(data.role_name);//商品名称
            $('#role_pid_edit').val(data.role_pid);//商品编码
            update = layer.open({
                type: 1,
                title: '修改角色',
                offset: 'auto',
                area: ['500px', '430px'],
                content: $('#update'),
                btn: ['关闭'],
                yes: function (index, layero) {
                    $('#update').addClass("layui-hide");//再次隐藏
                    layer.close(update);
                },
                cancel: function () {
                    layer.close(update);
                    //右上角关闭回调
                    $('#update').addClass("layui-hide");
                    //return false 开启该代码可禁止点击该按钮关闭
                }
                // btnAlign: 'c'
            });

            //同步更新缓存对应的值
            obj.update({
                username: '123'
                , title: 'xxx'
            });
        }else if (layEvent === 'edit_menu') { //编辑
        	edit_role =  layer.open({
            	  type: 2,
            	  title: '角色可查看菜单',
            	  area: ['700px', '450px'],
            	  fixed: false, //不固定
            	  maxmin: true,
            	  content: '/system/menu_detail?role_id='+data.id
            	});
        }
        else if (layEvent === 'edit_authority') { //编辑
        	edit_role =  layer.open({
            	  type: 2,
            	  title: '角色可查看菜单',
            	  area: ['700px', '450px'],
            	  fixed: false, //不固定
            	  maxmin: true,
            	  content: '/system/authority_detail?role_id='+data.id
            	});
        }
    });

 
    //新增
    var add = null;
    $('#btn-add').on('click', function () {
        $('#add')[0].reset();//清空
        $('#add').removeClass('layui-hide');//去掉隐藏

        add = layer.open({
            type: 1,
            title: '新增角色',
            offset: 'auto',
            area: ['500px', '300px'],
            content: $('#add'),
            btn: ['关闭'],
            yes: function (index, layero) {
                $('#add').addClass("layui-hide");//再次隐藏
                layer.close(add);
            },
            cancel: function () {
                layer.close(add);
                //右上角关闭回调
                $('#add').addClass("layui-hide");
                //return false 开启该代码可禁止点击该按钮关闭
            }
            // btnAlign: 'c'
        });
    });

    //批量删除
    $('#btn-delete-all').on('click', function () {

        var checkStatus = table.checkStatus('dataCheck');
        var data = checkStatus.data;
        if (data.length == 0) {
            layer.alert('请选择要删除的行', {
                'icon': 2
            })
        } else {
            layer.confirm('真的删除行么', function (index) {
                // obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
                var idList = '';
                for (var i = 0; i < data.length; i++) {
                    idList = idList + (data[i].id) + ','
                }
                var params = {"id": idList.substr(0, idList.length - 1)};
                var deleteIndex = layer.load(1, {shade: [0.1, '#fff']});
                $.ajax({
                    url: '/deleteDeliveryCharge',
                    data: JSON.stringify(params),
                    method: "POST",
                    contentType: "application/json;charset=utf-8",
                    // dataType: "json",
                    success: function (msg) {
                        if (msg.result == '2000') {
                            layer.close(deleteIndex);
                            tableIns.reload();//刷新
                            layer.msg('删除成功');
                        }
                    },
                    error: function (error) {
                        layer.close(deleteIndex);
                        console.info(error);
                    }
                });

            });
        }

    });

    //监听添加提交
    form.on('submit(insertDeliveryCharge)', function (data) {
        var datas = JSON.stringify(data.field);
        var action = data.form.action;

        var index = layer.load(1, {shade: [0.1, '#fff']});
        layer.close(add);
        $.ajax({
            url: action,
            data: datas,
            method: "POST",
            contentType: "application/json;charset=utf-8",
            // dataType: "json",
            success: function (msg) {
                $('#add').addClass("layui-hide");//再次隐藏
                layer.close(index);
                if (msg.result == '2000') {
                    if (msg.data == 1) {
                        tableIns.reload();//刷新
                        layer.msg('添加成功');
                    } else {
                        layer.alert('数据插入错误，请联系管理员.', {
                            title: '数据插入错误'
                        })
                    }
                }

            },
            error: function (error) {
                $('#add').addClass("layui-hide");//再次隐藏
                layer.close(index);
                console.info(error);
            }

        });
        return false;
    });

    //监听修改提交
    form.on('submit(updateDeliveryCharge)', function (data) {
        var datas = JSON.stringify(data.field);
        var action = data.form.action;
        var index = layer.load(1, {shade: [0.1, '#fff']});
        layer.close(update);
        $.ajax({
            url: action,
            data: datas,
            method: "POST",
            contentType: "application/json;charset=utf-8",
            // dataType: "json",
            success: function (msg) {
                layer.close(index);
                $('#update').addClass("layui-hide");//再次隐藏
                if (msg.result == '2000') {
                    tableIns.reload();//刷新
                    layer.msg('修改成功');
                }

            },
            error: function (error) {
                $('#update').addClass("layui-hide");//再次隐藏
                layer.close(index);
                console.info(error);
            }

        });
        return false;
    });

    function OFFRole(){
    	  layer.close(edit_role);
    }


});