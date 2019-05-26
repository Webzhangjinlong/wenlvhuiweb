<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css"  media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div style="margin-top: 10px">
 			<font style="color: #000; font-size: 12px; margin-left: 10px">
 				★ 学校列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 <div style="margin-top: 20px;">
	<table class="layui-table" lay-skin="line,row" style="text-align: center;">
 				<tr style="font-weight: bold;">
 					<td style="width: 5%">编号</td>
 					<td style="width: 10%">机构名称</td>
 					<td style="width: 10%">机构类型</td>
 					<td style="width: 10%">联系电话</td>
 					<td style="width: 5%">省</td>
 					<td style="width: 5%">市</td>
 					<td style="width: 5%">区</td>
 					<td style="width: 15%">详细地址</td>
 					<td style="width: 15%">创建时间</td>
 					<td style="width: 10%">操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>Blue shit</td>
 					<td>挖机</td>
 					<td>1389595959</td>
 					<td>宁夏</td>
 					<td>银川</td>
 					<td>金凤区</td>
 					<td>左拐右拐</td>
 					<td>2016-05-21</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="foodAdd()">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
			</table>
	<div id="test1"style="margin-left: 900px">
	</div>
 </div>     
<script src="layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
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
</body>
</html>