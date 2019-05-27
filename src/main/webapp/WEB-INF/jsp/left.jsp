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
		      <dd><a href="/tag/list" target="showframe">活动列表</a></dd>
		      <dd><a href="/tag/add" target="showframe">添加活动</a></dd>
		    </dl>
		  </li>
		  <li class="layui-nav-item">
		    <a href="javascript:;">政策管理</a>
			    <dl class="layui-nav-child">
			      <dd><a href="/wenlv/list" target="showframe">政策列表</a></dd>
			      <dd><a href="/wenlv/addwenlv" target="showframe">添加政策</a></dd>
			    </dl>
		  </li>
		  <li class="layui-nav-item">
		  	<a href="javascript:;">匠人管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="craftsmanList.jsp" target="showframe">匠人列表</a></dd>
			      <dd><a href="craftsmanAdd.jsp" target="showframe">添加匠人</a></dd>
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
			      <dd><a href="hotelList.jsp" target="showframe">餐馆列表</a></dd>
			      <dd><a href="hotelAdd.jsp" target="showframe">添加餐馆</a></dd>
			    </dl>
		    </li>
		     <li class="layui-nav-item">
		  	<a href="javascript:;">学校管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="schoolList.jsp" target="showframe">学校列表</a></dd>
			      <dd><a href="schoolAdd.html" target="showframe">添加学校</a></dd>
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