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
	<style type="text/css">
		table{
			table-layout: fixed;
		}
		td{
			width:100%;
			word-break:keep-all;/* 不换行 */
			white-space:nowrap;/* 不换行 */
			overflow:hidden;/* 内容超出宽度时隐藏超出部分的内容 */
			text-overflow:ellipsis;
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
 			<table class="layui-table" lay-skin="line,row" style="text-align: center; overflow: hidden;">
 				<tr style="font-weight: bold;">
 					<td style="width: 5%">编号</td>
 					<td style="width: 5%">账号</td>
 					<td style="width: 5%">电话</td>
 					<td style="width: 8%">使用状态</td>
 					<td style="width: 8%">是否验证</td>
 					<td style="width: 8%">创建时间</td>
 					<td style="width: 8%">会员来源</td>
 					<td style="width: 5%">昵称</td>
 					<td style="width: 8%">真实姓名</td>
 					<td style="width: 5%">性别</td>
 					<td style="width: 8%">会员等级</td>
 					<td style="width: 5%">生日</td>
 					<td style="width: 6%">最后登陆</td>
 					<td style="width: 6%">会员类型</td>
 					<td style="width: 10%">操作</td>
 				</tr>
				<c:forEach items="${userList}" var="list">
 				<tr>
 					<td>${list.id}</td>
 					<td>${list.username}</td>
 					<td>${list.phone}</td>
 					<td>
						<c:if test="${list.status == 'Y'}">正常</c:if>
						<c:if test="${list.status == 'N'}">非正常</c:if>
					</td>
					<td>
						<c:if test="${list.isMobileCheck == 1}">是</c:if>
						<c:if test="${list.isMobileCheck == 0}">否</c:if>
					</td>
 					<td>${list.created}</td>
					<td>
						<c:if test="${list.sourceType == 1}">管理</c:if>
						<c:if test="${list.sourceType == 2}">网页</c:if>
						<c:if test="${list.sourceType == 3}">安卓</c:if>
						<c:if test="${list.sourceType == 4}">苹果</c:if>
						<c:if test="${list.sourceType == 5}">微信</c:if>
					</td>
 					<td>${list.nickName}</td>
 					<td>${list.name}</td>
					<td>
						<c:if test="${list.sex == 1}">男</c:if>
						<c:if test="${list.sex == 2}">女</c:if>
					</td>
 					<td>${list.userLevel}</td>
 					<td>${list.birthday}</td>
 					<td>${list.lastLoginTime}</td>
					<td>
						<c:if test="${list.userType == 9}">管理员</c:if>
						<c:if test="${list.userType == 1}">普通用户</c:if>
						<c:if test="${list.userType == 2}">艺人</c:if>
						<c:if test="${list.userType == 3}">商家</c:if>
						<c:if test="${list.userType == 4}">餐厅</c:if>
					</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="foodAdd()">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
				</c:forEach>
			</table>
			<div id="test1"style="margin-left: 900px">
	</div>
 		</div>
 	</body>
 	<script>
 		function foodAdd(){
 			window.location.href="hotelDetails.html";
 		}
 	</script>
 	<script>
layui.use('laypage', function(){
  var laypage = layui.laypage;
  
  //执行一个laypage实例
  laypage.render({
    elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
    ,count: 100 //数据总数，从服务端得到
  });
});
</script>
</html>