<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎进入文旅惠餐馆管理系统</title>
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  		<link rel="stylesheet" href="/layui/css/layui.css"  media="all">
  		<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
		<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
  		<script src="/layui/layui.js"></script>
	</head>
	<style type="text/css">
        .toolbar {
            border: 1px solid #ccc;
            width:730px;
        }
        .text {
            border: 1px solid #ccc;
            width:730px;
            height: 200px;
        }
    </style>
	<body>
	<div style="margin-top: 5px">
 			<font style="color: #000; font-size: 12px; margin-top: 10px">
 				★ 添加餐馆
 			</font>
 			<br>
 			<hr style="background: red; height: 2px">
 		</div>
 		<div>
			<form class="form-horizontal" role="form" action="/hotel/preUpdate">
				<div>
					<input type="hidden" name="id" value="${hotel.id}">
				</div>

				<div class="form-group">
					<label class="col-sm-1 control-label">餐馆名称:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="restaurantName" value="${hotel.restaurantName}" placeholder="请输入餐馆名称">
					</div>
						<label class="col-sm-1 control-label">餐馆类别:</label>
						<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="restaurantType" value="${hotel.restaurantType}" placeholder="请输入餐馆类别">
					</div>
						<div style="margin-left: 750px; margin-top: 20px">
							<button type="button" class="layui-btn" id="test1">
							  <i class="layui-icon">&#xe67c;</i>餐馆图片:
							</button>
								<img src="/img/icon.jpg" class="img-circle" style="margin-left: 25px;width: 60px; height: 60px">
						</div>
				</div>
				<div class="form-group" style="margin-top: -30px">
					<label class="col-sm-1 control-label">平均消费:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="averageConsumption" value="${hotel.averageConsumption}" placeholder="请输入平均消费">
					</div>
						<label class="col-sm-1 control-label">推荐指数:</label>
						<div class="col-sm-2">
							<select class="form-control" name="starClass" value="${hotel.starClass}">

								<c:if test="${hotel.starClass == 1}">
									<option name="starClass" value="1">★</option>
								</c:if>
								<c:if test="${hotel.starClass == 2}">
									<option name="starClass" value="1">★★</option>
								</c:if>
								<c:if test="${hotel.starClass == 3}">
									<option name="starClass" value="1">★★★</option>
								</c:if>
								<c:if test="${hotel.starClass == 4}">
									<option name="starClass" value="1">★★★★</option>
								</c:if>
								<c:if test="${hotel.starClass == 5}">
									<option name="starClass" value="1">★★★★★</option>
								</c:if>
									<option value="0" name="starClass">--请选择--</option>
											<option value="1" name="starClass">★</option>
											<option value="2" name="starClass">★★</option>
											<option value="3" name="starClass">★★★</option>
											<option value="4" name="starClass">★★★★</option>
											<option value="5" name="starClass">★★★★★</option>
							</select>
						</div>
				</div>
				<div class="form-group"style="margin-top: 32px">
						<label class="col-sm-1 control-label">市:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="city" value="${hotel.city}" placeholder="请输入市">
						</div>
						<label class="col-sm-1 control-label">区:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="area" value="${hotel.area}" placeholder="请输入区">
						</div>
				</div>
				<div class="form-group"style="margin-top: 32px">
						<label class="col-sm-1 control-label">详细地址:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text" name="addrDetail" value="${hotel.addrDetail}" placeholder="请输入详细地址">
						</div>
				</div>
				<div class="form-group" style="margin-top: 30px">
					<label class="col-sm-1 control-label">经度:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="longitude" value="${hotel.longitude}" placeholder="请输入经度">
					</div>
						<label class="col-sm-1 control-label">纬度:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="latitude" value="${hotel.latitude}" placeholder="请输入纬度">
					</div>
					<div style="margin-top: 8px">
						<a href="https://lbs.amap.com/console/show/picker">查看经纬度</a>
						</div>
				</div>
				<div class="form-group" style="margin-top: 30px">
					<label class="col-sm-1 control-label">餐馆账号:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name=" " value="${hotel.restaurantName}" placeholder="">
					</div>
						<label class="col-sm-1 control-label">餐馆密码:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="restaurantName" value="${hotel.restaurantName}" placeholder="">
					</div>
				</div>
				<div style="margin-left: 22px;">
				<label class="control-label">餐馆详情:</label><br>
				</div>
				<div style="margin-left: 22px; margin-top: 10px">
				    <div id="div1" class="toolbar"></div>
					    <div style="padding: 5px 0; color: #ccc"></div>
					    <div id="div2" class="text"> <!--可使用 min-height 实现编辑区域自动增加高度-->
		    		</div>
		    	</div>
		    	<div style="margin-top: 10px; margin-left: 600px;">
		    		
		    		<button class="layui-btn layui-btn-sm">确定添加</button>
		    		<button class="layui-btn layui-btn-sm layui-btn-danger">确定修改</button>
		    	</div>
			</form>
			<div style="margin-left: 690px; margin-top: -30px">
 			</div>
 			<div style="margin-left: 443px; margin-top: -30px">
 			</div>
 		</div>
    <script type="text/javascript" src="/js/wangEditor.min.js"></script>
    <script type="text/javascript">
        var E = window.wangEditor;
        var editor1 = new E('#div1', '#div2'); 
        editor1.customConfig.uploadImgServer = '/upload';
        editor1.create();
    </script>
    <script>
		layui.use('upload', function(){
		  var upload = layui.upload;
		   
		  //执行实例
		  var uploadInst = upload.render({
		    elem: '#test1' //绑定元素
		    ,url: '/upload/' //上传接口
		    ,done: function(res){
		      //上传完毕回调
		    }
		    ,error: function(){
		      //请求异常回调
		    }
		  });
		});
</script>
</body>
</html>