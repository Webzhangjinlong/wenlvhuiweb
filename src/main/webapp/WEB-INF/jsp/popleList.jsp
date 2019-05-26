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
 			<font style="color: #000; font-size: 12px; margin-top: 10px">
 				★ 会员列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line">
 				<tr style="font-weight: bold;">
 					<td>编号</td>
 					<td>账号</td>
 					<td>电话</td>
 					<td>使用状态</td>
 					<td>是否验证</td>
 					<td>创建时间</td>
 					<td>会员来源</td>
 					<td>昵称</td>
 					<td>真实姓名</td>
 					<td>性别</td>
 					<td>会员等级</td>
 					<td>生日</td>
 					<td>最后登陆</td>
 					<td>会员类型</td>
 					<td>操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>geng940901</td>
 					<td>1388888888</td>
 					<td>正常</td>
 					<td>是</td>
 					<td>2019-01-03</td>
 					<td>PC</td>
 					<td>爱过</td>
 					<td>小花</td>
 					<td>女</td>
 					<td>1</td>
 					<td>0902</td>
 					<td>一天前</td>
 					<td>艺人</td>
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