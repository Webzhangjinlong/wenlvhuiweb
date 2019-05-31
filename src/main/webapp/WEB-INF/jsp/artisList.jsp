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
		td:hover{
			overflow: visible;
		}
	</style>
 	<body>
	<div style="margin-top: 10px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 艺人列表
		</font>
		<br>
		<hr style="background: red; height: 2px">
	</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden;">
 				<tr style="font-weight: bold;">
 					<td>姓名</td>
 					<td>类型</td>
 					<td>电话</td>
 					<td>状态</td>
 					<td>操作</td>
 				</tr>

				<c:forEach items="${artistList}" var="artist"  >
					<tr style="font-weight: bold;">
						<td>${artist.artistName}</td>
						<td>
							<c:if test="${artist.artistType == 10}">乐器</c:if>
							<c:if test="${artist.artistType == 11}">绘画</c:if>
							<c:if test="${artist.artistType == 12}">烹饪</c:if>
							<c:if test="${artist.artistType == 13}">旅行</c:if>
							<c:if test="${artist.artistType == 14}">摄影</c:if>
							<c:if test="${artist.artistType == 15}">手工</c:if>
							<c:if test="${artist.artistType == 16}">唱歌</c:if>
							<c:if test="${artist.artistType == 17}">书法</c:if>
							<c:if test="${artist.artistType == 18}">刺绣</c:if>
							<c:if test="${artist.artistType == 19}">健身</c:if>
							<c:if test="${artist.artistType == 21}">乒乓球</c:if>
							<c:if test="${artist.artistType == 22}">舞蹈</c:if>
							<c:if test="${artist.artistType == 23}">剪纸</c:if>
							<c:if test="${artist.artistType == 26}">武术</c:if>
							<c:if test="${artist.artistType == 27}">游泳</c:if>
							<c:if test="${artist.artistType == 28}">广场舞</c:if>
							<c:if test="${artist.artistType == 29}">街舞</c:if>
							<c:if test="${artist.artistType == 30}">口技</c:if>
						</td>
						<td>${artist.artistPhone}</td>
						<td>
							<c:if test="${artist.artistStatus == 1}">认证成功</c:if>
							<c:if test="${artist.artistStatus == 0}">未认证</c:if>
						</td>
						<td>
							<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ artist.id})">修改/详情</button>
							<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ artist.id})">删除</button>
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
            window.location.href="/artist/delete?id="+id;
        }
 	</script>

	<script>
		function updateById(id) {
			window.location.href="/artist/update?id="+id;
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