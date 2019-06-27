<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ZH-cn">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>欢迎进入文旅惠后台管理系统</title>
  <link rel="stylesheet" href="/layui/css/layui.css">
  <link rel="stylesheet" href="/css/login.css">
</head>

<body>
  <div class="kit-login">
    <div class="kit-login-bg"></div>
    <div class="kit-login-wapper">
      <h2 style="color: #000000" class="kit-login-slogan">欢迎使用 <br> 文旅惠后台管理系统</h2>
        <form action="/user/login">
            账号：<input type="username" name="username"><br>
            密码：<input type="password" name="password"><br>
            <input class="layui-btn layui-btn-xs" style="margin-left: 150px; margin-top: 10px" type="submit" value="确定登陆">
        </form>
    </div>
  </div>

  <script src="/layui/layui.js"></script>
</body>

</html>