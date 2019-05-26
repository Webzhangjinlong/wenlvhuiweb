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
        , vipTable = layui.vip_table
        ,laydate = layui.laydate
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
        elem: '#mergeTable'
        ,totalRow:true
        , height: vipTable.getFullHeight()-120
        , id: 'dataCheck'
        , url: '/order/GetOrderProfit'
        , method: 'get'
        , page: true
        , limits: [10,50,100,300]
        , limit: 10 //默认采用30
        , loading: false
        ,footer:true
        , cols: [
            [
                {type: 'checkbox', fixed: 'left'}
                , {field: 'fk_synch_order_id', title: '订单号', width: 150 , unresize: true, sort: true, totalRowText: '合计'}
                , {field: 'pd_skuName', title: '产品名称', width: 310}
                , {field: 'pd_jdPrice', title: '产品价格', width: 100}
                , {field: 'moneys', title: '结算金额', width: 100, totalRow: true}
                , {field: 'pd_itemTotal', title: '产品数量', width: 100, totalRow: true}
                , {field: 'shipping_fee', title: '配送费（单件）', width: 140, totalRow: true}
                , {field: 'trainsfee', title: '配送费（总）', width: 120, totalRow: true}
                , {field: 'profits', title: '纯利润(订-配-结)', width: 100, sort: true, totalRow: true}

                //, {fixed: 'right', title: '操作', width: 200, align: 'center', toolbar: '#barOption'} //这里的toolbar值是模板元素的选择器
            ]
        ]

        , done: function (res, curr, count) {
        }
    });



    var $ = layui.$, active = {
        reload: function(){
        	var order_id = $('#order_id').val();
        	var product_id = $('#product_id').val();
            var startDate = $('#startDate').val();
            var endDate = $('#endDate').val();
          
            //执行重载
            table.reload('dataCheck', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                	order_id: order_id,
                	product_id: product_id,
                    startDate: startDate,
                    endDate:endDate
                }
            });
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });


});