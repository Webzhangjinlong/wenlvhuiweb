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
 	<body onload="load();">
 		<div style="margin-top: 5px">
 			<font style="color: #000; font-size: 12px; margin-top: 10px; margin-left: 20px">
 				★ 匠人列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line">
 				<tr style="font-weight: bold;">
 					<td>编号</td>
 					<td>匠人名称</td>
 					<td>匠人标语</td>
 					<td>省</td>
 					<td>市</td>
 					<td>区</td>
 					<td>详细地址</td>
 					<td>经度</td>
 					<td>纬度</td>
 					<td>创建人</td>
 					<td>创建时间</td>
 					<td>操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>老张</td>
 					<td>出门不带钱吃喝全靠蹭</td>
 					<td>宁夏</td>
 					<td>银川</td>
 					<td>西夏</td>
 					<td>怡安小区</td>
 					<td>5646</td>
 					<td>231564</td>
 					<td>耿宝大大</td>
 					<td>2019-5-24</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="foodAdd()">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
			</table>
 		</div>
 	</body>
 	<script>
 		function foodAdd(){
 			window.location.href="hotelDetails.jsp";
 		}
 	</script>
</html>