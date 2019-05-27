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
 		<div style="margin-top: 5px">
 			<font style="color: #000; font-size: 12px; margin-top: 10px">
 				★ 活动列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line" border="2">
 				<tr style="font-weight: bold;">
 					<td>序号</td>
 					<td>标题</td>
 					<td>状态</td>
 					<td>来源</td>
 					<td>转发数</td>
 					<td>浏览量</td>
 					<td>活动状态</td>
 					<td>内容</td>
 					<td>创建时间</td>
 					<td>文章类型</td>
 					<td>操作</td>
 				</tr>

				<c:forEach items="${tagList}" var="tag"  >
					<tr style="font-weight: bold;">
						<td>${ tag.id}</td>
						<td>${ tag.title}</td>
						<td>
							<c:if test="${tag.status==1 }">完成</c:if>
							<c:if test="${tag.status==2 }">未完成</c:if>
						</td>
						<td>${ tag.source}</td>
						<td>${ tag.relay}</td>
						<td>${ tag.browse}</td>
						<td>${ tag.giveDefault}</td>
						<td>${ tag.cotent}</td>
						<td>${ tag.createDate}</td>
						<td>${ tag.textType}</td>
						<td>
							<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ tag.id})">修改</button>
							<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ tag.id})">删除</button>
						</td>


					</tr>
				</c:forEach>

			</table>
			<div id="test1"style="margin-left: 900px">
	</div>
 		</div>
 	</body>
 	<script type="text/javascript">
 		function deleteById(id){
 		    alert("您已成功删除！");
            window.location.href="/tag/delete?id="+id;
        }
 	</script>
	<
	<script>
		function updateById(id) {
		    alert("666")
			window.location.href="/tag/update?id="+id;
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