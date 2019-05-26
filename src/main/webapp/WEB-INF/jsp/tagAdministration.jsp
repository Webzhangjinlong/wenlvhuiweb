<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎进入文旅惠后台管理系统</title>
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  		<link rel="stylesheet" href="layui/css/layui.css"  media="all">
  		<script src="layui/layui.js"></script>
	</head>
	<style type="text/css">
		td{
	  		text-align: center;
	  	}
	</style>
 	<body>
 		<div style="margin-top: 5px">
 			<font style="color: #000; font-size: 12px; margin-top: 10px">
 				★ 活动列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line">
 				<tr style="font-weight: bold;">
 					<td>序号</td>
 					<td>标题</td>
 					<td>状态</td>
 					<td>来源</td>
 					<td>转发数</td>
 					<td>浏览量</td>
 					<td>活动状态</td>
 					<td>活动种类</td>
 					<td>报名时间</td>
 					<td>活动时间</td>
 					<td>活动地点</td>
 					<td>参与人数</td>
 					<td>操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>习近平臭流氓</td>
 					<td>转发</td>
 					<td>百度</td>
 					<td>10086</td>
 					<td>1008611</td>
 					<td id="state">&nbsp;</td>
 					<script>
 						var a = document.getElementById("state").value;
 						if(a == 1){
 							&nbsp="进行";
 						}else {
 							&nbsp="未进行";
 						}
 					</script>
 					<td>害民</td>
 					<td>8-1</td>
 					<td>8-2</td>
 					<td>宁夏银川</td>
 					<td>13亿</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="update();">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
			</table>
			<div id="test1"style="margin-left: 900px">
	</div>
 		</div>
 	</body>
 	<script type="text/javascript">
 		function update(){
 			window.location.href="tagAdd.html"
 		}
 	</script>
 	<script>
layui.use('laypage', function(){
  var laypage = layui.laypage;
  
  //执行一个laypage实例
  laypage.render({
    elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
    ,count: 100 //数据总数，从服务端得到
  });
});
</script>
</html>