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
				<a href="javascript:;">主页管理</a>
				<dl class="layui-nav-child">
					<dd><a href="/wenlv/list" target="showframe">文旅政策管理</a></dd>
					<dd><a href="/artist/artistList" target="showframe">文旅定制管理</a></dd>
					<dd><a href="/book/list" target="showframe">好书推荐管理</a></dd>
					<dd><a href="/school/list" target="showframe">文艺培训管理</a></dd>
					<dd><a href="/craftsman/list" target="showframe">文创非遗管理</a></dd>
					<dd><a href="/hotel/list" target="showframe">地方美食管理</a></dd>
					<dd><a href="/WenBrigade/YmWenBrigadeList" target="showframe">文旅路线管理</a></dd>
				</dl>
			</li>
		  <li class="layui-nav-item">
		    <a href="javascript:;">空间管理</a>
		    <dl class="layui-nav-child">
		      <dd><a href="/space/list" target="showframe">空间列表</a></dd>
		      <dd><a href="/space/add" target="showframe">添加空间</a></dd>
		    </dl>
		  </li>
		  <li class="layui-nav-item">
		    <a href="javascript:;">活动管理</a>
			    <dl class="layui-nav-child">
			      <dd><a href="/tag/list" target="showframe">活动列表</a></dd>
			      <dd><a href="/tag/tagAdd" target="showframe">添加活动</a></dd>
			    </dl>
		  </li>
		  <li class="layui-nav-item">
		  	<a href="javascript:;">圈子管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="/circle/list" target="showframe">圈子列表</a></dd>
			    </dl>
		    </li>
		  <li class="layui-nav-item">
		  	<a href="javascript:;">系统管理</a>
			  	<dl class="layui-nav-child">
			      <dd><a href="/advertising/manager" target="showframe">广告管理</a></dd>
			      <dd><a href=""  target="showframe">数据管理</a></dd>
			      <dd><a href="/user/list"  target="showframe">会员管理</a></dd>
			      <dd><a href=""  target="showframe">订单管理</a></dd>
			      <dd><a href=""  target="showframe">支付管理</a></dd>
			      <dd><a onclick="removeLogint()">退出登陆</a></dd>
					<script type="text/javascript">
                        function removeLogint(){
                            var result = confirm("确定要退出吗？");
                            if(result){
                                location.href="/user/remove";
                                var frame = window.parent.frames["auto"];
                                console.log(frame)
                            }
                        }
					</script>
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