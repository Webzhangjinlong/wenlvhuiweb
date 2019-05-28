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
		td{
	  		text-align: center;
	  	}
	</style>
 	<body>
 		<div style="margin-top: 5px;">
 			<font style=" color: #000; font-size: 12px; margin-left: 20px">
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
				<c:forEach items="${tagList}" var="tag"  >
				<tr style="font-weight: bold;">
					<td>${ tag.id}</td>
					<td>${ tag.title}</td>
					<td>
						<c:if test="${tag.status==1 }">转发</c:if>
						<c:if test="${tag.status==2 }">自写</c:if>
					</td>
					<td>${ tag.source}</td>
				</tr>
				</c:forEach>
				<c:forEach items="${wenlvlist}" var="wenlv">
 				<tr>
 					<td>${wenlv.id}</td>
 					<td>${wenlv.titleType}</td>
 					<td>${wenlv.title}</td>
 					<td>${wenlv.status}</td>
 					<td>${wenlv.source}</td>
 					<td>${wenlv.relay}</td>
 					<td>${wenlv.browse}</td>
 					<td>${wenlv.createUser}</td>
 					<td>${wenlv.textType}</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ wenlv.id})">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ wenlv.id})">删除</button>
 					</td>

 				</tr>
				</c:forEach>
			</table>
			<div id="test1"style="margin-left: 900px"></div>
 		</div>
 	</body>

 	<script type="text/javascript">
 		function updateById(id){
 			window.location.href="/wenlv/update?id="+id;
 		}

        function deleteById(id){
            window.location.href="/wenlv/delete?id="+id;
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