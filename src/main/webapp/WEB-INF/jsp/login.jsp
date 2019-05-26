<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎进入文旅惠后台管理系统</title>
	</head>
	<style type="text/css">
		.form{
			margin-top: 10%;
			margin-left: 40%;
		}
	</style>
	<script type="text/javascript">
	</script>
	<body>
		<div class="form">

			<form method="post" name="myForm"   action="/user/login">
				账号：<input type="text" name="username" id="username"><br>
				密码：<input type="password" name="password" id="password"><br>
				<input type="submit" value="登陆">
			</form>
		</div>
		<script type="text/javascript">


		</script>
	</body>
</html>