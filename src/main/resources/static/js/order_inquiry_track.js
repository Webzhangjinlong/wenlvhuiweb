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
        , element = layui.element
        , $ = layui.jquery;

    laydate.render({
        elem: '#startDate'
    });
    laydate.render({
        elem: '#endDate'
    });

    // 表格渲染
    table.render({
        elem: '#dateTable'
        ,id:'testReload'
        ,url:'/order/mangerGetOrders'
        , height: vipTable.getFullHeight()-50
        ,title: '待分配订单'
        ,totalRow: true
        ,cols: [[
            {type: 'checkbox', fixed: 'left'}
            ,{field:'id', title:'ID', width:110, fixed: 'left', unresize: true, sort: true, totalRowText: '合计'}
            , {field: 'fk_synch_order_id', title: '订单号', width: 120 , sort: true}
            , {field: 'pd_skuName', title: '产品', width: 250  , sort: true}
            , {field: 'pd_itemTotal', title: '数量', width: 70 , totalRow: true , sort: true}
            , {field: 'productPrice', title: '价格', width: 80 , totalRow: true , sort: true}
            , {field: 'ri_fullname', title: '收货人', width: 80 , sort: true}
            , {field: 'ri_full_address', title: '收获地址', width:200 , sort: true}
            , {field: 'ri_telephone', title: '电话号码', width: 120 , sort: true}
            , {field: 'oi_source', title: '订单来源', width: 100 , sort: true}
            , {field: 'oi_order_start_time', title: '订单日期', width: 200 , sort: true}
        ]]
        ,page: true
        ,limits:[10,50,100,300,500,1000]
        ,done:function(res, curr, count){
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
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                	userName: userName,
                	city : city,
                    laiyuan: demoReload ,
                    startDate:startDate ,
                    endDate: endDate,
                    productName:productName
                }
            });
        }
    };


    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });




});
function daochu(){
    var limit = $("#limit").val();
    var page = $("#page").val();
    var demoReload = $('#demoReload option:selected').val();
    
    var userName = $('#userName').val();
    var city = $('#city').val();
    
    var startDate = $('#startDate').val();
    var endDate = $('#endDate').val();
    var productName = $('#productName').val();
    var _url = "/order/export_order.json?demoReload="+demoReload+"&startDate="+startDate+"&endDate="+endDate+"&page="+page+"&limit="+limit+"&productName="+productName+"&city="+city+"&userName="+userName;
    location.href = _url;
}