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
        //id:'fk_synch_order_id',
        elem: '#mergeTable'
        , height: vipTable.getFullHeight()-120
        , cols: [
            [
                {type: 'checkbox', fixed: 'left'}
            , {field: 'si_delivery_area', title: '用户', width: 150 , unresize: true, sort: true, totalRowText: '合计'}
            , {field: 'totalMoney', title: '提现金额', width: 130}
            , {field: 'cDate', title: '体现日期', width: 160}
            , {field: 'orderId', title: '订单编号', width: 500}
            , {field: 'name', title: '收款人', width: 120}
            , {field: 'count', title: '银行账号', width: 220}
            , {field: 'phone', title: '电话号码', width: 150}
            , {fixed: 'right', title: '操作', width: 200, align: 'center', toolbar: '#barOption'} //这里的toolbar值是模板元素的选择器
        ]
        ]
        , id: 'dataCheck'
        , url: '/GetMoney'
         , where: {'oi_fee': 2}
        , method: 'get'
        , page: true
        ,limits:[10,50,100,300]
        , limit: 10 //默认采用30
        , loading: false
        ,totalRow:true
        , done: function (res, curr, count) {

        }
    });

    /**
     *  name layuiRowspan
     * @param fieldName  要合并列的field属性值
     * @param index 要合并列的索引值 从1开始(如果要合并第一列，则index = 1;)
     * @desc 此方法适用于合并列冻结的单元格
     */
    function layuiRowspan(fieldName,index){
        // 左侧列为冻结的情况
        //  var tbodyNode = document.getElementsByClassName("layui-table-fixed-l")[index-1];
        // 左侧导航栏不冻结的情况
        var fixedNode = document.getElementsByClassName("layui-table-body")[index - 1];
        var child = tbodyNode.getElementsByTagName("td");
        var childFilterArr = [];
        // 获取data-field属性为fieldName的td
        for(var i = 0; i < child.length; i++){
            if(child[i].getAttribute("data-field") == fieldName){
                childFilterArr.push(child[i]);
            }
        }
        // 获取td的个数和种类
        var childFilterTextObj = {};
        for(var i = 0; i < childFilterArr.length; i++){
            var childText = childFilterArr[i].textContent;
            if(childFilterTextObj[childText] == undefined){
                childFilterTextObj[childText] = 1;
            }else{
                var num = childFilterTextObj[childText];
                childFilterTextObj[childText] = num*1 + 1;
            }
        }
        // 给获取到的td设置合并单元格属性
        for(var key in childFilterTextObj){
            var tdNum = childFilterTextObj[key];
            var canRowspan = true;
            for(var i = 0; i < childFilterArr.length; i++){
                if(childFilterArr[i].getAttribute("data-content") == key){
                    if(canRowspan){
                        childFilterArr[i].setAttribute("rowspan",tdNum);
                        canRowspan = false;
                    }else{
                        childFilterArr[i].style.display = "none";
                    }
                }
            }
        }
    }










    var update = null;
    //监听工具条
    table.on('tool(delivery_fee)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        if (layEvent === 'detail') { //查看
            alert(11111)
            $('#detail').removeClass("layui-hide");
            $('#commodity_name_show').html(data.commodity_name);//商品名称
            $('#commodity_code_show').html(data.commodity_code);//商品编码
            $('#specification_model_show').html(data.specification_model);//规格型号
            $('#measuring_unit_show').html(data.measuring_unit);//计量单位名称
            $('#shipping_fee_show').html(data.shipping_fee);//配送费

            var show = layer.open({
                type: 1,
                title: '商品信息及配送费',
                offset: 'auto',
                // shadeClose: true,
                area: ['500px', '400px'],
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
        }else if (layEvent === 'details') { //查看

            var orderIds=data.orderId;
var str="<table border='1' width='600px'><tr><td>订单号</td><td></td><td>产品</td><td>单件运费</td><td>数量</td><td>运费</td></tr>";
                $.post('/order/GetMoneys', {"orderId":orderIds}, function(datas){
                    var length=datas.length;
                    for(var i=0;i<length;i++){
                        str+="<tr><td>"+datas[i]['fk_synch_order_id']+"<td/>";

                        str+="<td>"+datas[i]['pd_skuName']+"</td>";
                        str+="<td>"+datas[i]['shipping_fee']+"</td>";
                        str+="<td>"+datas[i]['pd_itemTotal']+"</td>";
                        str+="<td>"+datas[i]['totalFee']+"</td></tr>";

                    }
                    str=str+"</table>"


                    layer.open({
                    type: 1,
                    title:"提现明细",
                        area: ['650px', '400px'],
                    content: str //注意，如果str是object，那么需要字符拼接。
                });
            });
        }  else if (layEvent === 'del') { //删除
            layer.confirm('真的删除行么', function (index) {
                // obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
                var params = {"id": data.id};
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
        }else if (layEvent === 'shenhe') { //财务审核

            layer.confirm('真的要审核吗', function (index) {
                // obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
                //向服务端发送删除指令
                var params = {"fk_synch_order_id": data.orderId};
                var deleteIndex = layer.load(1, {shade: [0.1, '#fff']});
                $.ajax({
                    url: '/updateCaiwuShenhe',
                    data: JSON.stringify(params),
                    method: "POST",
                    contentType: "application/json;charset=utf-8",
                    // dataType: "json",
                    success: function (msg) {
                        if (msg.result == '2000') {
                            layer.close(deleteIndex);
                            tableIns.reload();//刷新
                            layer.msg('审核成功');
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
            console.info(data);
            $('#id_update').val(data.id);//id
            $('#commodity_name_update').val(data.commodity_name);//商品名称
            $('#commodity_code_update').val(data.commodity_code);//商品编码
            $('#specification_model_update').val(data.specification_model);//规格型号
            $('#measuring_unit_update').val(data.measuring_unit);//计量单位名称
            $('#shipping_fee_update').val(data.shipping_fee);//配送费

            update = layer.open({
                type: 1,
                title: '新增商品配送费',
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
        }
    });

    //新增
    var add = null;
    $('#btn-add').on('click', function () {
        $('#add')[0].reset();//清空
        $('#add').removeClass('layui-hide');//去掉隐藏

        add = layer.open({
            type: 1,
            title: '新增商品配送费',
            offset: 'auto',
            area: ['500px', '440px'],
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

    // //批量删除
    // $('#btn-delete-all').on('click', function () {
    //
    //     var checkStatus = table.checkStatus('dataCheck');
    //     var data = checkStatus.data;
    //     if (data.length == 0) {
    //         layer.alert('请选择要删除的行', {
    //             'icon': 2
    //         })
    //     } else {
    //         layer.confirm('真的删除行么', function (index) {
    //             // obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
    //             layer.close(index);
    //             //向服务端发送删除指令
    //             var idList = '';
    //             for (var i = 0; i < data.length; i++) {
    //                 idList = idList + (data[i].id) + ','
    //             }
    //             var params = {"id": idList.substr(0, idList.length - 1)};
    //             var deleteIndex = layer.load(1, {shade: [0.1, '#fff']});
    //             $.ajax({
    //                 url: '/deleteDeliveryCharge',
    //                 data: JSON.stringify(params),
    //                 method: "POST",
    //                 contentType: "application/json;charset=utf-8",
    //                 // dataType: "json",
    //                 success: function (msg) {
    //                     if (msg.result == '2000') {
    //                         layer.close(deleteIndex);
    //                         tableIns.reload();//刷新
    //                         layer.msg('删除成功');
    //                     }
    //                 },
    //                 error: function (error) {
    //                     layer.close(deleteIndex);
    //                     console.info(error);
    //                 }
    //             });
    //
    //         });
    //     }
    //
    // });
    //
    // //监听添加提交
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


    var $ = layui.$, active = {
        reload: function(){
            var check_text = $('#check_text').val();
            //执行重载
            table.reload('dataCheck', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    check_text: check_text
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });


});