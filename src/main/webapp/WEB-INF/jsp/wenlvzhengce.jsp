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
 		<div style="margin-top: 5px;">
 			<font style="color: #000; font-size: 12px; margin-left: 20px"">
 				★ 政策列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line">
 				<tr style="font-weight: bold;">
 					<td>序号</td>
 					<td>类型</td>
 					<td>标题</td>
 					<td>状态</td>
 					<td>来源</td>
 					<td>转发数</td>
 					<td>浏览量</td>
 					<td>创建人</td>
 					<td>文章分类</td>
 					<td>操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>水利</td>
 					<td>扫黑除恶</td>
 					<td>转发</td>
 					<td>百度</td>
 					<td>556</td>
 					<td>5254</td>
 					<td>耿宝大大</td>
 					<td>政策解读</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="update();">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
			</table>
 		</div>
 	</body>
 	<script type="text/javascript">
 		function update(){
 			window.location.href="zhengceAdd.jsp"
 		}
 	</script>
</html>