
$(function(){



	$.ajax({
		type : "POST",
		url : "/nc/lishiyuefenjilu",
		dataType : "json",
		success : function(data) {	
			
			var str = "<table style='font-size: 18px;color: #FFFFFF;border-collapse: separate;border-spacing: 0px 20px;margin-left: 20px;'>";
			str += "<thead><tr>";
			str += "<th style=\"width: 100px;\">序号</th>";
			str += "<th style=\"width: 130px;\">月份</th>";
			str += "<th style=\"width: 140px;\">销售额(元)</th>";
			str += "</tr></thead>";
			str += "<tbody id='customer_body'>";
			
	
			for (var i = 0; i < data.yearSaleList.length; i++) {
				str += "<tr align=\"center\">";
				str += "<td>" + [ i + 1 ] + "</td>";
				str += "<td> <a href= \"#\" style='color:#CAE1FF;' onclick=\"dateSaleDetail('"+data.yearSaleList[i].DATES+"')\" >" + data.yearSaleList[i].DATES + "</a></td>";
				str += "<td>" + data.yearSaleList[i].MONEY + "</td>";
				str += "</tr>";
			}
			str += " </tbody>";
			str += "</table>";
			$("#histogramChart1").append(str);
			
			
			var lineChart1 = echarts.init(document
					.getElementById('lineChart1'));
			
			option = {
					
				    title : {
				        text: '',
				        subtext: '数据来源：NC系统',
				        textStyle :{
				        	color : '#fff'
				        }
				    },
				    color:['#ca8622', '#bda29a'],
				    tooltip : {
				        trigger: 'axis',
				        formatter: "{b}<br/>  {a0}:{c0}% <br/> {a1}:{c1}%"
				    },
				    legend: {
				        data:['同比','环比'],
				        textStyle : {
				        	color:'#fff'
				        }
				    },
				    toolbox: {
				        show : true,
				        feature : {
				            dataView : {show: true, readOnly: false},
				            magicType : {show: true, type: ['line', 'bar']},
				            restore : {show: true},
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    xAxis : [
				        {
				            type : 'category',
				            data : data.dates,
					        axisLabel : {
			                    formatter: '{value}',
			                    textStyle: {
			                        color: '#fff'
			                    }
			                }
				        }
				    ],
				    yAxis : [
				        {
				            type : 'value',
				            axisLabel : {
			                    formatter: '{value}%',
			                    textStyle: {
			                        color: '#fff'
			                    }
			                }
				        }
				    ],
				    series : [
				        {
				            name:'同比',
				            type:'bar',
				            data:data.tongbi,
				            markPoint : {
				                data : [
				                    {type : 'max', name: '最大值'},
				                    {type : 'min', name: '最小值'}
				                ]
				            },
				            markLine : {
				                data : [
				                    {type : 'average', name: '平均值'}
				                ]
				            }
				        },
				        {
				            name:'环比',
				            type:'bar',
				            data:[0,0,0,0,0,0],
				            markPoint : {
				                data : [
				                    {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183},
				                    {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
				                ]
				            },
				            markLine : {
				                data : [
				                    {type : 'average', name : '平均值'}
				                ]
				            }
				        }
				    ]
				};


			lineChart1.setOption(option);
			
			
			
			
		}
	})
	
	
	
	
	

})


function dateSaleDetail(obj){
	  layer.open({
		  type: 2,
		  area: ['1200px', '100%'],
		  fixed: false, //不固定
		  maxmin: true,
		  content: '/monthDetailByHtml?name='+obj
    });
}