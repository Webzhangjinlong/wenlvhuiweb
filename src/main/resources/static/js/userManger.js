// 配置扩展方法路径
layui.config({
    base: './../frame/static/js/'   // 模块目录
}).extend({                         // 模块别名
    vip_nav: 'vip_nav'
    , vip_tab: 'vip_tab'
    , vip_table: 'vip_table'
});
// layui方法
layui.use(['table', 'form', 'layer', 'vip_table', 'laydate'], function () {

    // 操作对象
    var form = layui.form
        , table = layui.table
        , layer = layui.layer
        , vipTable = layui.vip_table
        , $ = layui.jquery
        ,laydate = layui.laydate;


    laydate.render({
        elem: '#pm_birthday'
      });
    
    
    // 表格渲染
    var tableIns = table.render({
        //id:'fk_synch_order_id',
        elem: '#mergeTable'
        , height: vipTable.getFullHeight()-120
        , cols: [
            [
            /**
             *   /**
             * a.userId,
             a.totalMoney,
             a.cDate,
             a.orderId,
             a.oi_fee,b.si_delivery_area
             */
                {type: 'checkbox', fixed: 'left'}
            , {field: 'id', title: '编号', width: 150}
            , {field: 'pm_name', title: '用户名', width: 120}
            , {field: 'pm_username', title: '登录名', width: 120}
            , {field: 'pm_birthday', title: '出生年月', width: 120}
            , {field: 'pm_phone_number', title: '电话', width: 120}
            , {field: 'pm_unit', title: '角色名称', width: 120}
            , {field: 'cDate', title: '加入时间', width: 120}
            , {field: 'is_examine', title: '是否审核通过', width: 100}
            , {fixed: 'right', title: '操作', width: 150, align: 'center', toolbar: '#barOption'}
      ]
        ]
        , id: 'mergeTable'
        , url: '/getUserManger'
        , method: 'get'
        , page: true
        , limits: [10,50,100,300]
        , limit: 10
        , loading: false
        ,totalRow:true
        , done: function (res, curr, count) {
        }
    });


    //监听行工具事件
    table.on('tool(delivery_fee)', function(obj){
        var data = obj.data;
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        if (layEvent === 'details') { //查看

        	layer.open({
          	  type: 2,
          	  title: '赋予用户角色',
          	  area: ['600px', '300px'],
          	  fixed: false, //不固定
          	  maxmin: true,
          	  content: '/system/user_role_allot?user_id='+data.id
          	});
        	
        }else if (layEvent === 'shenhe') { //财务审核


            layer.confirm('是否允许该用户通过审核？', function (index) {
                layer.close(index);
                //向服务端发送删除指令
                var params = {"id": data.id};
                var deleteIndex = layer.load(1, {shade: [0.1, '#fff']});
                console.log(data);
                console.log(params);
                $.ajax({
                    url: '/updateUserExamine?id='+data.id,
                    method: "POST",
                    contentType: "application/json;charset=utf-8",
                    // dataType: "json",
                    success: function (msg) {
                        if (msg.code == 0) {
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
        }
    });


    
    var add = null;
    $('#btn-add').on('click', function () {
        $('#add')[0].reset();//清空
        $('#add').removeClass('layui-hide');//去掉隐藏

        add = layer.open({
            type: 1,
            title: '新增用户信息',
            offset: 'auto',
            area: ['500px', '440px'],
            content: $('#add'),
            btn: ['关闭'],
            yes: function (index, layero){
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



    //监听添加提交
    form.on('submit(addUser)', function (datas1) {
    	//判断登录帐号是否被创建
   
    	var pm_password_two = $("#pm_password_two").val();
    	var pm_password = $("#pm_password").val();
    	if(pm_password_two==pm_password){
	    	
	        var datas = JSON.stringify(datas1.field);
	        var action = datas1.form.action;
	
	        var index = layer.load(1, {shade: [0.1, '#fff']});
	        
	        $.ajax({
	            url: action,
	            data: datas,
	            method: "POST",
	            contentType: "application/json;charset=utf-8",
	            // dataType: "json",
	            success: function (msg) {
	              
	              console.log(msg)
	                if (msg.code == '1') {
	                	layer.close(add);
	                	
	                    tableIns.reload();//刷新
	                    layer.msg('添加成功');
	                    $('#add').addClass("layui-hide");//再次隐藏
	                }else if(msg.code == '2'){
	                    layer.alert('数据插入错误，请联系管理员.', {
	                        title: '数据插入错误'
	                    })
	                }else if(msg.code == '3'){
	                    layer.alert(msg.msg, {
	                        title: '创建失败'
	                    })
	                }
	              layer.close(index);
	
	            },
	            error: function (error) {
	                $('#add').addClass("layui-hide");//再次隐藏
	                layer.close(index);
	                console.info(error);
	            }
	
	        });
	        return false;
    	}else{
    		layer.msg('两次密码不一致');
    		return false;
    	}
    });
    

    var $ = layui.$, active = {
        reload: function(){
            var check_text = $('#check_text').val();
            //执行重载
            table.reload('mergeTable', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    orderStatues: check_text
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

});