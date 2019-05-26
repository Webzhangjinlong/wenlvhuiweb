<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 				★ 餐馆列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line">
 				<tr style="font-weight: bold;">
 					<td>序号</td>
 					<td>种类</td>
 					<td>标签</td>
 					<td>平均消费</td>
 					<td>市</td>
 					<td>区</td>
 					<td>详细地址</td>
 					<td>星级</td>
 					<td>经度</td>
 					<td>纬度</td>
 					<td>操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>小吃</td>
 					<td>特色</td>
 					<td>26元</td>
 					<td>银川</td>
 					<td>西夏</td>
 					<td>浙江商城24号</td>
 					<td>5</td>
 					<td>16254</td>
 					<td>65652</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="upDate()">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
			</table>
 		</div>
 	</body>
 	<script>
 		function upDate(){
 			window.location.href="hotelAdd.jsp";
 		}
 	</script>
</html>