<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎进入文旅惠后台管理系统</title>
	</head>
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  		<link rel="stylesheet" href="/layui/css/layui.css"  media="all">
  		<script src="/layui/layui.js"></script>
  		<style type="text/css">
  			
  			#title{
  				float: right;
  			}
			#top{
				float:right;
				margin-top: -25px;
				margin-left: 154px;
			}	
			#font_title{
				margin-left: 30px;
				font-size: 30px;
				color: #fff;
			}	
		</style>
	<body style="background: #393D49" >
		<div style="margin-top: 30px">
			<font id="font_title">
				欢迎进入文旅惠后台管理系统
			</font>
		</div>
		<div id="top">
			<ul class="layui-nav" lay-filter="">
			  <li class="layui-nav-item"><a href="/user/list" target="showframe">会员列表</a></li>
			  <li class="layui-nav-item"><a href="/user/userAdd" target="showframe">添加会员</a></li>
			  <li class="layui-nav-item"><a href="/scwj/demo"  target="showframe">大数据</a></li>
			  <li class="layui-nav-item"><a href="">社区</a></li>
			</ul>
	 	</div>
	</body>
	<script>
		layui.use('element', function(){
		  var element = layui.element;
		});
</script>
</html>