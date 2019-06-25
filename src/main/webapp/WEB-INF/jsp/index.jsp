<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎进入文旅惠后台管理系统</title>
	</head>
 		<frameset rows="15%,85%" cols="*">
		  	<frameset rows="100%" cols="*" frameborder="yes" border="1" framespacing="1">
		  		<frame id="top" name="top" src="/index/top" scrolling="no"/>
		  	</frameset>
		  	<frameset rows="*" cols="13%,87%">
		  		<frame id="left" name="left" src="/index/left" scrolling="no"/>
		  		<frame id="auto" name="auto" scrolling="auto" noresize="" border="0" name="showframe" src="/user/list"/>
		  		<frame name="showframe" scrolling="auto"/>
		  	</frameset>
  		</frameset>
</html>