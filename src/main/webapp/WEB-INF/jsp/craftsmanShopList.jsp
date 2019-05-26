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
    text-align: center;
    }
  </style>
	</style>
 	<body>
 		<div style="margin-top: 10px">
 			<font style="color: #000; font-size: 12px; margin-left: 10px">
 				★ 匠人商品列表
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div id="tab1">
 			<table class="layui-table" lay-skin="line，row">
 				<tr style="font-weight: bold;">
 					<td style="width: 5%">商铺编号</td>
 					<td style="width: 5%">商品名</td>
 					<td style="width: 13%">商品唯一标识码</td>
 					<td style="width: 15%">商品卖点</td>
 					<td style="width: 8%">商品标价</td>
 					<td style="width: 8%">当前售价</td>
 					<td style="width: 8%">商品种类</td>
 					<td style="width: 8%">是否上架</td>
 					<td style="width: 10%">创建时间</td>
 					<td style="width: 10%">创建人</td>
 					<td style="width: 10%">操作</td>
 				</tr>
 				<tr>
 					<td>1</td>
 					<td>兔兔肉</td>
 					<td>02352548923</td>
 					<td>兔兔辣么可爱肯定很好吃</td>
 					<td>50元/克</td>
 					<td>30元/克</td>
 					<td>肉肉</td>
 					<td>是</td>
 					<td>2019-05-21</td>
 					<td>耿宝大大</td>
 					<td>
 						<button class="layui-btn layui-btn-sm layui-btn-warm" onclick="craftsmanShopAdd()">修改</button>
 						<button class="layui-btn layui-btn-sm layui-btn-danger">删除</button>
 					</td>
 				</tr>
			</table>
			<div id="test1"style="margin-left: 1100px">
	</div>
 		</div>
 	</body>
 	<script>
 		function craftsmanShopAdd(){
 			window.location.href="craftsmanShopAdd.html";
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