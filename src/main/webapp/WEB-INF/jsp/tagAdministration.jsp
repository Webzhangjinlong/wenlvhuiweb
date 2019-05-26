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
  		<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	</head>
	<style type="text/css">
		td{
	  		text-align: center;
	  	}
	</style>
 	<body>
 		<div style="margin-top: 5px">
 			<font style="color: #000; font-size: 12px; margin-top: 10px">
 				★ 活动列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">

 			<table id="tab" class="layui-table" lay-skin="line">
 				<tr style="font-weight: bold;">
 					<td>序111号</td>
 					<td>标题</td>
 					<td>状111态</td>
 					<td>来11源</td>
 					<td>转发数</td>
 					<td>浏11览量</td>
 					<td>活动状态</td>
 					<td>活动种类</td>
 					<td>报名11时间</td>
 					<td>活动时间</td>
 					<td>活动地点</td>
 					<td>参与人数</td>
 					<td>操作</td>
 				</tr>
 				<c:forEach items="${policyList}" var="policyList"  >
		 				<tr style="font-weight: bold;">
		 					<td>1</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.title}</td>
		 					<td>${ policyList.textType}</td>
		 					<td>${ policyList.textType}</td>
		 					<td>${ policyList.textType}</td>
		 					<td>${ policyList.textType}</td>
		 					<c:if test="${policyList.status==1 }">
		 						<td>完成</td>
		 					</c:if>
		 					<c:if test="${policyList.status==2 }">
		 						<td>weiwancc </td>
		 					</c:if>
		 				</tr>
 				</c:forEach>
			</table>
 		</div>

	<script type="text/javascript">

       /*  $(function(){
            console.log("页面初始化");
            $.ajax({
                url: "policy/getpolicyList",
                type: "GET",
                dataType: "json",
                success: function(data){
                	console.log(">>>>>>>>>>>>>",data);
					/*这个方法里是ajax发送请求成功之后执行的代码*/
                    showData(data);//我们仅做数据展示
                },
                error: function(msg){
                    alert("ajax连接异常："+msg);
                }
            });
        });
 */

	</script>


 	</body>
</html>