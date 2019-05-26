var symptomName = last_month_day();

$(function() {

	$("#el-dialog").addClass("hide");
	$(".close").click(function(event) {
		$("#el-dialog").addClass("hide");
	});

	var date = new Date();
	var numble = date.getDate();
	var today = getFormatMonth(new Date());
	$("#date1").html(today);
	$("#date2").html(today);
	$("#date3").html(today);
	$("#date4").html(today);

	lay('.demo-input').each(function() {
		laydate.render({
			type : 'month',
			elem : this,
			trigger : 'click',
			theme : '#95d7fb',
			calendar : true,
			showBottom : true,
			done : function() {

			}
		})
	});
	timerefush();
	var t1=window.setInterval(timerefush, 10000);
	
})




function openNewWin(url, title){
    window.open(url, title);
}


var daquDetail;
var daqu_status=0;

var shishidingdan;

function timerefush() {

	$.ajax({
				type : "POST",
				url : "/nc/bigDataHtml",
				dataType : "json",
				success : function(data) {
					daquDetail=data.orderClass;
					$("#lineChart").text("");
					$("#lineChart2").text("");
					$("#allOrderNums").text(data.allOrderNums);
					$("#oneMonthNums").text(data.oneMonthNums);
					$("#allOrderMoneys").text(data.allOrderMoneys);
					$("#oneMonthMoneys").text(data.oneMonthMoneys);
					$("#allCustomer").text(data.allCustomer);
					$("#oneMonthCustomer").text(data.oneMonthCustomer);
					$("#dangyuesale").text(data.month)

					var str = "<table style='font-size: 20px;color: #CAE1FF;border-collapse: separate;border-spacing: 0px 20px;margin-left: 20px;'>";
					str += "<thead><tr>";
					str += "<th width='60px'>序号</th>";
					str += "<th width='170px'>大区名称</th>";
					str += "<th width='150px'>销售额</th>";
					str += "</tr></thead>";
					str += "<tbody>";
					
					var z = data.orderClass.length ;
					if(data.orderClass.length>5){
						z = 5;
					}
					
					for (var i = 0; i < z; i++) {
						console.log(data.orderClass[i])
						str += "<tr>";
						str += "<td style='text-align:center;'>" + [ i + 1 ] + "</td>";
						str += "<td style='text-align:center;'><a href= \"#\" style='color:#CAE1FF;' onclick=\"daqu('"+data.orderClass[i].DAQUNAME+"')\"  >" + data.orderClass[i].DAQUNAME + "</a></td>";
						str += "<td style='text-align:center;'>" + data.orderClass[i].MONEY + "</td>";
						str += "</tr>";
					}
					str += " </tbody>";
					str += "</table>";
					$("#lineChart").append(str);
					
					//判断当前的大区信息是否为展开
					daqu_status=0;
					
					//实时订单 start
					var str1 = "<table style='font-size: 17px;color: #FFFFFF;border-collapse: separate;border-spacing: 0px 20px;margin-left: 20px;'>";
					str1 += "<thead><tr>";
					str1 += "<th width='60px'>序号</th>";
					str1 += "<th width='130px'>客户名称</th>";
					str1 += "<th width='100px'>订单编号</th>";
					str1 += "<th width='80px'>订单价格</th>";
					str1 += "</tr></thead>";
					str1 += "<tbody>";
					var shishidingdan = data.orderlimit;
					for (var i = 0; i < data.orderlimit.length; i++) {
						var sub_name = data.orderlimit[i].NAME;
						if(sub_name.length>=6){
							sub_name = sub_name.substring(0,6)
						}
						
						var vcode = data.orderlimit[i].VBILLCODE;
						if(vcode.length>=6){
							vcode = vcode.substring(0,6)
						}
						
						str1 += "<tr>";
						str1 += "<td style='text-align:center;'>" + [ i + 1 ] + "</td>";
						if(data.orderlimit[i].NAME.length>7){
							str1 += "<td  style='text-align:center;' id='shishi"+i+"' onMouseOver='chakanquanming(this)' value='"+data.orderlimit[i].NAME+"'>" + sub_name + "</td>";
						}else{
							str1 += "<td  style='text-align:center;' >" + sub_name + "</td>";
						}
						
						str1 += "<td style='text-align:center;'  id='code"+i+"' onMouseOver='chakanqvcode(this)'  value='"+data.orderlimit[i].VBILLCODE+"' >" + vcode + " &nbsp</td>";
						str1 += "<td style='text-align:center;'>" + data.orderlimit[i].NTOTALORIGMNY + "</td>";
						str1 += "</tr>";
					}
					str1 += " </tbody>";
					str1 += "</table>";
					$("#lineChart2").append(str1);
					//实时订单 end
					
					
					
					var monthSaleDate =  new Array();
					var monthSaleMoney = new Array();
					
					for(var i=data.monthSale.length ; i>0 ; i--){
						monthSaleMoney.push((data.monthSale[i-1].MONEY/1000000).toFixed(6));
						monthSaleDate.push(data.monthSale[i-1].DATES)
					}
					var pieChart1 = echarts.init(document
							.getElementById('histogramChart'));
					
					option1 = {
							tooltip: {
					            trigger: 'axis',
					        },
					        color:['#DC143C'],
						    xAxis: {
						        type: 'category',
						        data: monthSaleDate,
						        axisLabel: {
		                            show: true,
		                            textStyle: {
		                                color: '#fff'
		                            }
		                        }
						    },
						    yAxis: {
						    	data:monthSaleMoney,
						        type: 'value',
						        axisLabel : {
		                            formatter: '{value}',
		                            textStyle: {
		                                color: '#fff'
		                            }
		                        }
						    },
						    series: [{
						        data: monthSaleMoney,
						        type: 'line'
						    }]
						};

					pieChart1.setOption(option1);
					
			
				var shenyuxiaoliang  = 200000000 -	data.completeMoney ;
					
					var pieChart1 = echarts.init(document
							.getElementById('pieChart1'));
					pieChart1
							.setOption({

								color : [ "#F08080", "#7CFC00" ],

								legend : {
									y : '260',
									x : 'center',
									textStyle : {
										color : '#ffffff',

									},
									data : ['未完成' , '已完成' ],
								},
								tooltip : {
									trigger : 'item',
									formatter : "{a}<br/>{b}<br/>{c} ({d}%)"
								},
								calculable : false,
								series : [ {
									name : '全年业务量',
									type : 'pie',
									radius : [ '30%', '50%' ],
									center : [ '50%', '45%' ],
									itemStyle : {
										normal : {
											label : {
												show : false
											},
											labelLine : {
												show : false
											}
										},
										emphasis : {
											label : {
												show : true,
												position : 'center',
												textStyle : {
													fontSize : '20',
													fontWeight : 'bold'
												}
											}
										}
									},
									data : [ {
										value : data.completeMoney,
										name : '已完成'
									}, {
										value : shenyuxiaoliang,
										name : '未完成'
									}

									]
								} ]
							});
				
					
				}

			});

}

$(function(){
	
    $("#daqu_id").click(function(){
    	
    	
	 		
  	  if(daqu_status==0){
  		$("#daqu_id").text("收起");
  		  
  		var size="";
  		  
  		if(daquDetail.length<=5){
  			size=330+"px";	
  		}else if(daquDetail.length>5&&daquDetail.length<=20){
  			size = daquDetail.length*60+"px";
  		}else{
  			size  = daquDetail.length*50+"px";;
  		}
  		$("#lineChart").text("");
 		
 		$("#lineChart11").css("height",size); 
  		

		var str = "<table style='font-size: 20px;color: #CAE1FF;border-collapse: separate;border-spacing: 0px 20px;margin-left: 20px;'>";
		str += "<thead><tr>";
		str += "<th width='60px'>序号</th>";
		str += "<th width='170px'>大区名称</th>";
		str += "<th width='150px'>销售额</th>";
		str += "</tr></thead>";
		str += "<tbody>";
		for (var i = 0; i < daquDetail.length; i++) {
			str += "<tr>";
			str += "<td  style='text-align:center;'>" + [ i + 1 ] + "</td>";
			str += "<td  style='text-align:center;'><a href= \"#\" style='color:#CAE1FF;' onclick=\"daqu('"+daquDetail[i].DAQUNAME+"')\"   >" + daquDetail[i].DAQUNAME + "</a></td>";
			str += "<td  style='text-align:center;'>" + daquDetail[i].MONEY + "</td>";
			str += "</tr>";
		}
		str += " </tbody>";
		str += "</table>";
		$("#lineChart").append(str);

		
		
		daqu_status=1;
			
  	  }else if(daqu_status==1){
 			
  		  
 			$("#lineChart").text("");
 			$("#lineChart11").css("height","330px"); 
 			$("#daqu_id").text("查看全部");
 			
 			var str = "<table style='font-size: 20px;color: #CAE1FF;border-collapse: separate;border-spacing: 0px 20px;margin-left: 20px;'>";
 			str += "<thead><tr>";
 			str += "<th width='60px'>序号</th>";
 			str += "<th width='170px'>大区名称</th>";
 			str += "<th width='150px'>销售额</th>";
 			str += "</tr></thead>";
 			str += "<tbody>";
				
 			for (var i = 0; i < 5; i++) {
 				str += "<tr>";
 				str += "<td  style='text-align:center;'>" + [ i + 1 ] + "</td>";
 				str += "<td  style='text-align:center;'><a href= \"#\" style='color:#CAE1FF;' onclick=\"daqu('"+daquDetail[i].DAQUNAME+"')\"   >" + daquDetail[i].DAQUNAME + "</a></td>";
 				str += "<td  style='text-align:center;'>" + daquDetail[i].MONEY + "</td>";
 				str += "</tr>";
 			}
				str += " </tbody>";
				str += "</table>";
				$("#lineChart").append(str);
				product_status=0;
 		}
		}) 
	
		
		
		

		
		// 地图
		var mapChart = echarts.init(document
				.getElementById('mapChart'));
		mapChart.setOption({
			bmap : {
				center : [ 106.319199, 38.561248 ],
				zoom : 12,
				roam : true,

			},
			tooltip : {
				trigger : 'item',
				formatter : function(params, ticket, callback) {
					return params.value[2]
				}
			},
			series : [ {
				type : 'scatter',
				coordinateSystem : 'bmap',
				data : [ [ 106.239, 38.493, '银川市' ],
						[ 106.319146, 38.561431, '金河科技股份有限公司' ],
			
				]
			} ]
		});
		mapChart.on('click', function(params) {
			$("#el-dialog").removeClass('hide');
			$("#reportTitle").html(params.value[2]);
		});

		var bmap = mapChart.getModel().getComponent('bmap')
				.getBMap()
		bmap.addControl(new BMap.MapTypeControl({
			mapTypes : [ BMAP_NORMAL_MAP, BMAP_SATELLITE_MAP ]
		}));
		bmap.setMapStyle({
			style : 'midnight'
		})
		
		
		
})

function daqu(obj){
	  layer.open({
		  type: 2,
		  skin: 'demo-class',
		  area: ['1200px', '100%'],
		  fixed: false, //不固定
		  maxmin: true,
		  moveOut:true,
		  content: '/daqudetail?name='+obj
      });
}

function chakanquanming(tags){
	var ids  =  $(tags).attr("id");
	var num = ids.substring(6,7)*1;
	var shishi =  $(tags).attr("value");
	layer.tips(shishi, "#"+ids, {
		  tips: [4, '#8A2BE2']
		});
	
	
}

function chakanqvcode(tags){
	var ids  =  $(tags).attr("id");
	var num = ids.substring(4,5)*1;
	var code =  $(tags).attr("value");
	layer.tips(code, "#"+ids, {
		  tips: [4, '#8A2BE2']
		});
}
