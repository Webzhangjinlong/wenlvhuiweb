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
	<body style="width: 98%">
	<div style="margin-top: 10px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 匠人商品添加
		</font>
		<br>
		<hr style="background: red; height: 2px; margin-top: 0px">
	</div>
 		<div>
			<form class="form-horizontal" role="form"  action="/craftsman/productadd">

				<div>
					<input type="hidden" name="id" value="${product.id}">
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">商品名称:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text" name="productName" value="${product.productName}" placeholder="请输入商品名称">
					</div>
						<label class="col-sm-1 control-label">唯一标识码:</label>
						<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="skuId" value="${product.skuId}" placeholder="请输入商品唯一标识码">
					</div>
				</div>
				<div class="form-group" style="margin-top: 20px">
					<label class="col-sm-1 control-label">商品售价:</label>
					<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="price" value="${product.price}" placeholder="请输入商品原价">
					</div>
						<label class="col-sm-1 control-label">当前售价:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="priceDq" value="${product.priceDq}" placeholder="请输入商品当前售价">
						</div>
				</div>
				<div class="form-group" style="margin-top: 20px">
					<label class="col-sm-1 control-label">浏览量:</label>
					<div class="col-sm-2">
							<input class="form-control" id="browse" type="text"  name="browse" value="${product.browse}" placeholder="请输入商品浏览量">
					</div>
						<label class="col-sm-1 control-label">是否上架:</label>
						<div class="col-sm-2">
							<select class="form-control" name="status" value="${product.status}">

								<c:if test="${product.status == 1}">
									<option value="1" name="status">上架</option>
								</c:if>
								<c:if test="${product.status == 2}">
									<option value="2" name="status">下架</option>
								</c:if>

								<option value="0" name="status">--请选择--</option>
								<option value="1" name="status">上架</option>
								<option value="2" name="status">下架</option>
							</select>
						</div>
				</div>
				<div class="form-group" style="margin-top: 20px">
					<label class="col-sm-1 control-label">商品卖点:</label>
					<div class="col-sm-5">
						<input class="form-control" id="focusedInput" type="text"  name="productPoint" value="${product.productPoint}" placeholder="请输入商品卖点">
					</div>
				</div>
				<div style="margin-left: 20px; margin-top: 0px">
				<label class="control-label">商品介绍:</label><br>
				</div>
				<div style="margin-left: 20px; margin-top: 10px">
				    <div id="div1" class="toolbar"></div>
					    <div style="padding: 5px 0; color: #ccc"></div>
					    <div id="div2" class="text"> <!--可使用 min-height 实现编辑区域自动增加高度-->
		    		</div>
		    	</div>
				<div class="layui-upload"  style="float: right ; margin-top: -380px; margin-right: 400px">
					<button type="button" class="layui-btn" id="test1">请上传商品封面图</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1">
						<p id="demoText"></p>
					</div>
				</div>
		    	<div style="margin-top: 10px; margin-left: 525px;">
		    		<button class="layui-btn layui-btn-sm">确定添加/修改</button>
		    		<%--<button class="layui-btn layui-btn-sm layui-btn-danger">确定修改</button>--%>
		    	</div>
			</form>
			<div style="margin-left: 690px; margin-top: -30px">
 			</div>
 			<div style="margin-left: 443px; margin-top: -30px">
 			</div>
 		</div>
    <script type="text/javascript" src="/js/wangEditor.js"></script>
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