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
            height: 100px;
        }
		.layui-upload-img {
			width: 132px;
			height: 92px;
			margin: 0 10px 10px 0;
		}
    </style>
	<script type="text/javascript">
		function chan() {
			$("#restaurantDetail").val(editor1.txt.html());
			$("#form1").submit();
        }
	</script>
	<body style="width: 98%">
	<div style="margin-top: 10px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 添加餐馆 </font> <br>
		<hr style="background: red; height: 2px; margin-top: 5px">
	</div>
 		<div>
			<form class="form-horizontal" role="form" id="form1" action="/hotel/preUpdate">
				<div>
					<input type="hidden" name="id" value="${hotel.id}">
				</div>

				<div class="form-group">
					<label class="col-sm-1 control-label">餐馆名称:</label>
					<div class="col-sm-2">
						<input class="form-control" id="restaurantName" type="text"  name="restaurantName" value="${hotel.restaurantName}" placeholder="请输入餐馆名称">
					</div>
						<label class="col-sm-1 control-label">餐馆类别:</label>
						<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="restaurantType" value="${hotel.restaurantType}" placeholder="请输入餐馆类别">
					</div>
				</div>
				<div class="form-group">
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
				<div class="form-group">
						<label class="col-sm-1 control-label">市:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="city" value="${hotel.city}" placeholder="请输入市">
						</div>
						<label class="col-sm-1 control-label">区:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="area" value="${hotel.area}" placeholder="请输入区">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">详细地址:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text" name="addrDetail" value="${hotel.addrDetail}" placeholder="请输入详细地址">
						</div>
						<label class="col-sm-1 control-label">店铺标签:</label>
						<div class="col-sm-2">
							<select class="form-control" id="restaurantTag" name="restaurantTag" value="${hotel.restaurantTag}">
								<c:if test="${hotel.restaurantTag == 1}">
									<option value="1" name="restaurantTag">必吃</option>
								</c:if>
								<c:if test="${hotel.restaurantTag == 2}">
									<option value="2" name="restaurantTag">特色</option>
								</c:if>
								<option value="0" name="restaurantTag">--请选择--</option>
								<option value="1" name="restaurantTag">必吃</option>
								<option value="2" name="restaurantTag">特色</option>
							</select>
						</div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">经度:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="longitude" value="${hotel.longitude}" placeholder="请输入经度">
					</div>
						<label class="col-sm-1 control-label">纬度:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="latitude" value="${hotel.latitude}" placeholder="请输入纬度">
					</div>
					<div class="col-sm-2">
						<a href="https://lbs.amap.com/console/show/picker"
						   class="form-control">♡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点我查看经纬度</a>
						</div>
				</div>
				<div class="layui-upload" style="float: right; margin-right: 500px; margin-top: -240px">
					<button type="button" class="layui-btn" id="test1">上传餐馆背景图</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1" src="${hotel.restaurantImg}">
						<input id="restaurantImg" name="restaurantImg" value="${hotel.restaurantImg}" type="hidden"/>
						<p id="demoText"></p>
					</div>
				</div>
				<div class="layui-upload" style="float: right; margin-right: 300px; margin-top: -240px">
					<button type="button" class="layui-btn" id="test2">上传餐馆图片</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo2" src="${hotel.restaurantBackimage}">
						<input id="restaurantBackimage" name="restaurantBackimage" value="${hotel.restaurantBackimage}" type="hidden"/>
						<p id="demoText1"></p>
					</div>
				</div>
				<div style="margin-left: 22px;">
				<label class="control-label">餐馆详情:</label><br>
				</div>
				<div style="margin-left: 22px; margin-top: 10px">
				    <div id="div1" class="toolbar"></div>
					    <div style="padding: 5px 0; color: #ccc"></div>
					    <div id="div2" class="text">
							<p>${hotel.restaurantDetail}</p>
		    		</div>
					<input type="hidden" id="restaurantDetail" name="restaurantDetail">
		    	</div>
		    	<div style="margin-top: 10px; margin-left: 650px;">
		    		
		    		<button class="layui-btn layui-btn-sm" onclick="chan()">确定添加/修改</button>
		    	</div>
			</form>
			<div>
			<div style="margin-left: 20px">
				<button class="btn btn-primary btn-sm" id="aa" onclick="addFood(${hotel.id})" >
					添加菜品
					<script type="text/javascript">
                        function addFood(id) {
                            if(id == null || id == ""){
                                alert("请添加完成学校之后在添加图片！")
                                document.getElementById("aa").disabled = true;
                                return false;
                            }
                            window.location.href = "/hotel/addFood?id=" + id;
                        }
					</script>
				</button>
			</div>
			<table class="layui-table" lay-skin="line"  style="margin-left: 20px; width: 80%">
				<thead>
				<tr>
					<th>菜品名称</th>
					<th>菜品类别</th>
					<th>菜品价格</th>
					<th>操作</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${foodList}" var="foodList">
				<tr>
					<td>${foodList.foodName}</td>
					<td>
						<c:if test="${foodList.foodType == 1}">不得不吃</c:if>
						<c:if test="${foodList.foodType == 2}">不容错过</c:if>
					</td>
					<td>${foodList.foodPrice}</td>
					<td>
						<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="updateById(${ foodList.id})">修改</button>
						<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ foodList.id})">删除</button>
					</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
			</div>
		</div>
    <script type="text/javascript" src="/js/wangEditor.js"></script>
    <script type="text/javascript">
        var E = window.wangEditor;
        var editor1 = new E('#div1', '#div2'); 
        editor1.create();
    </script>

	<script type="text/javascript">
        function deleteById(id) {
            alert("您已成功删除！");
            window.location.href = "/hotel/deleteFood?id=" + id;
        }
	</script>
	<script>
        function updateById(id) {
            window.location.href = "/hotel/updateFood?id=" + id;
        }

	</script>


	<script type="text/javascript">
		function foodUpdate() {
			window.location.href="/hotel/foodUpdate"
        }
	</script>
	<script>
        layui.use('upload', function() {
            var $ = layui.jquery
                , upload = layui.upload;

            //普通图片上传
            var uploadInst = upload.render({
                elem: '#test1'
                , url: '/uploadflv/upload'
                , before: function (obj) {
                    //预读本地文件示例，不支持ie8
                    obj.preview(function (index, file, result) {
                        $('#demo1').attr('src', result); //图片链接（base64）
                    });
                }
                , done: function (res) {
                    //如果上传失败
                    if (res.code > 0) {
                        return layer.msg('上传失败');
                    }
                    $("#restaurantImg").val(''+ res.data[0]);
                    //上传成功
                }
                , error: function () {
                    //演示失败状态，并实现重传
                    var demoText = $('#demoText');
                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                    demoText.find('.demo-reload').on('click', function () {
                        uploadInst.upload();
                    });
                }
            });
        });
	</script>
	<script>
        layui.use('upload', function() {
            var $ = layui.jquery
                , upload = layui.upload;

            //普通图片上传
            var uploadInst = upload.render({
                elem: '#test2'
                , url: '/uploadflv/upload'
                , before: function (obj) {
                    //预读本地文件示例，不支持ie8
                    obj.preview(function (index, file, result) {
                        $('#demo2').attr('src', result); //图片链接（base64）
                    });
                }
                , done: function (res) {
                    //如果上传失败
                    if (res.code > 0) {
                        return layer.msg('上传失败');
                    }
                    $("#restaurantBackimage").val(''+ res.data[0]);
                    //上传成功
                }
                , error: function () {
                    //演示失败状态，并实现重传
                    var demoText = $('#demoText1');
                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                    demoText.find('.demo-reload').on('click', function () {
                        uploadInst.upload();
                    });
                }
            });
        });
	</script>
</body>
</html>