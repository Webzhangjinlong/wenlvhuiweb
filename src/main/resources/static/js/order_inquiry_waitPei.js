// 配置扩展方法路径
layui.config({
    base: './../frame/static/js/'   // 模块目录
}).extend({                         // 模块别名
    vip_nav: 'vip_nav'
    , vip_tab: 'vip_tab'
    , vip_table: 'vip_table'
});

// layui方法
layui.use(['laydate','table', 'form', 'layer', 'vip_table'], function () {

    // 操作对象
    var form = layui.form
        , table = layui.table
        , layer = layui.layer
        ,laydate = layui.laydate
        , vipTable = layui.vip_table
        , $ = layui.jquery;

    laydate.render({
        elem: '#startDate'
    });
    laydate.render({
        elem: '#endDate'
    });

    // 表格渲染
    var tableIns = table.render({
        //id:'fk_synch_order_id',
        elem: '#daifenpei'
        , height: vipTable.getFullHeight()-50
        , cols: [
            [
                {type: 'checkbox', fixed: 'left'}
                , {field: 'fk_synch_order_id', title: '订单号', width: 150 , unresize: true, sort: true,totalRowText: '合计'}
                , {field: 'pd_skuName', title: '产品', width: 200 , sort: true}
                , {field: 'pd_itemTotal', title: '数量', width: 60 , totalRow: true}
                , {field: 'productPrice', title: '价格', width: 80 , totalRow: true}
                , {field: 'ri_fullname', title: '收货人', width: 100 , sort: true}
                , {field: 'ri_full_address', title: '收获地址', width: 200 , sort: true}
                , {field: 'ri_telephone', title: '电话号码', width: 150 , sort: true}
                , {field: 'oi_source', title: '订单来源', width: 100 , sort: true}
                , {field: 'oi_order_start_time', title: '订单日期', width: 200 , sort: true}
                , {fixed: 'right', title: '操作', width: 120, align: 'center', toolbar: '#barOption'} //这里的toolbar值是模板元素的选择器
            ]
        ]
        , id: 'dataCheck'
        , url: '/order/mangerGetOrders?orderStatues=WAIT_SELLER_STOCK_OUT'
        , method: 'get'
        , page: true
        , limits: [10,50,100,300]
        , limit: 10 //默认采用30
        , loading: false
        ,totalRow:true
        , done: function (res, curr, count) {
            $("#page").val(res.page);
            $("#limit").val(res.limit);
            
        }
    });


    var $ = layui.$, active = {
        reload: function(){
            var demoReload = $('#demoReload option:selected').val();
            
            var userName = $('#userName').val();
            var city = $('#city').val();
            
            var endDate = $('#endDate').val();
            var startDate = $('#startDate').val();
            var productName = $('#productName').val();
            if(demoReload.trim().length>0) {
                if (demoReload != "京东" && demoReload != "敢爱" && demoReload != "微盟") {
                    layer.msg("输入的来源有误")
                    return;
                }
            }
            //执行重载
            table.reload('dataCheck', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                	userName: userName,
                	city : city,
                    laiyuan: demoReload
                    ,startDate:startDate
                    ,endDate: endDate
                    ,productName:productName
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });



    table.on('tool(test)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        if (layEvent === 'detail') { //查看
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
        }else if (layEvent === 'details') { //匹配配送人的基本信息

            var orderIds=data.fk_synch_order_id;
            var str="<form  action='/order/updateOrderSender?orderIds="+orderIds+"' onsubmit='return sub();'  id='form1' method='post'>" +
                "</br><table border='1' width='600px' style='border-collapse: collapse;margin: 0 auto;text-align: center;' ><tr><td style='border: 1px solid #cad9ea;color: #666;height: 30px;'></td><td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>编号</td><td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>配送商</td><td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>配送商编号</td></tr>";
            $.post('/order/getPeisong', function(datas){
                var length=datas.length;
                for(var i=0;i<length;i++){

                    str += "<tr style='background: #fff;'>" +
                        "<td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>" +
                        "<input type='radio'  name='check'  value='"+i+"'/>" +
                        "</td>";
                    str +=  "<td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>" +
                        datas[i]['id'] +
                        "</td>";

                    str +=  "<td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>" +
                        datas[i]['si_delivery_area'] +
                        "</td>";
                    str +=  "<td style='border: 1px solid #cad9ea;color: #666;height: 30px;'>" +
                        "<input value='" + datas[i]['fk_person_id'] + "'  type='text'    name='fk_person_id' />" +
                        "</td>";


                }
                str=str+"</table></br></br><button  onclick='sub()' type='button'  class='layui-btn layui-btn-normal' style='margin-left: 40%;'  align='center'>提交</button></form></br>"


                layer.open({
                    type: 1,
                    title:"配送商信息",
                    area: '650px',
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



});

function daochu(){
    var limit = $("#limit").val();
    var page = $("#page").val();
    
    var userName = $('#userName').val();
    var city = $('#city').val();
   
    var demoReload = $('#demoReload option:selected').val();
    var startDate = $('#startDate').val();
    var endDate = $('#endDate').val();
    var productName = $('#productName').val();
    var _url = "/order/export_order.json?orderStatues=WAIT_SELLER_STOCK_OUT&demoReload="+demoReload+"&startDate="+startDate+"&endDate="+endDate+"&page="+page+"&limit="+limit+"&productName="+productName+"&city="+city+"&userName="+userName;
    location.href = _url;
}