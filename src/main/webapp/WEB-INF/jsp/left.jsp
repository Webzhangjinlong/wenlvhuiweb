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
  		<link rel="stylesheet" href="/layui/css/layui.css"  media="all">
  		<script src="/layui/layui.js"></script>
	</head>
	<body style="background: #393D49">
		<ul class="layui-nav layui-nav-tree">
		  <li class="layui-nav-item">
		    <a href="javascript:;">活动管理</a>
		    <dl class="layui-nav-child">
		      <dd><a href="/policyList" target="showframe">活动列表</a></dd>
		      <dd><a href="../../../resources/templates/tagAdd.html" target="showframe">添加活动</a></dd>
		    </dl>
		  </li>
		  <li class="layui-nav-item">
		    <a href="javascript:;">政策管理</a>
			    <dl class="layui-nav-child">
			      <dd><a href="">政策列表</a></dd>
			      <dd><a href="">添加政策</a></dd>
			    </dl>
		  </li>
		  <li class="layui-nav-item">
		  	<a href="javascript:;">商家管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="">商家列表</a></dd>
			      <dd><a href="">添加商家</a></dd>
			      <dd><a href="">修改商家</a></dd>
			    </dl>
		    </li>
		  <li class="layui-nav-item">
		  	<a href="javascript:;">艺人管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="">艺人列表</a></dd>
			      <dd><a href="">添加艺人</a></dd>
			      <dd><a href="">修改艺人</a></dd>
			    </dl>
		    </li>
		    <li class="layui-nav-item">
		  	<a href="javascript:;">餐馆管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="../../../resources/templates/hotelList.html" target="showframe">餐馆列表</a></dd>
			      <dd><a href="../../../resources/templates/hotelAdd.html" target="showframe">添加餐馆 (账号,密码)</a></dd>
			    </dl>
		    </li>
		</ul>
	</body>
	<script>
		layui.use('element', function(){
		  var element = layui.element;
		});
	</script>
</html>