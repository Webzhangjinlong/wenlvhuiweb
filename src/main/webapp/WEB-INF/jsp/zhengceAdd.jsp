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
		.layui-upload-img {
			width: 132px;
			height: 92px;
			margin: 0 10px 10px 0;
		}
    </style>
	<body>
	<div style="margin-top: 5px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 添加政策
		</font>
		<br>
		<hr style="background: red; height: 2px; margin-top: 5px">
	</div>
 		<div>
			<form class="form-horizontal" role="form" action="/wenlv/addSure" id="form1">
				<div>
					<input type="hidden" name="id" value="${wenlv.id}">
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">政策标题:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  name="title" value="${wenlv.title}" placeholder="请输入政策标题">
					</div>
						<label class="col-sm-1 control-label">政策类型:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  name="titleType" value="${wenlv.titleType}" placeholder="请输入政策类型">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">政策来源:</label>
					<div class="col-sm-5">
						<input class="form-control" name="source" value="${wenlv.source}" id="focusedInput" type="text"  placeholder="请输入政策来源">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">创建时间:</label>
					<div class="col-sm-5">
						<input class="form-control" name="source" value="${wenlv.createDate}" id="focusedInput" type="text"  placeholder="" disabled>
					</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">文章类型:</label>
						<div class="col-sm-2">
						<select class="form-control" name="textType" value="${wenlv.textType}">

							<c:if test="${wenlv.textType == 1}">
								<option name="textType" value="1">咨询动态</option>
							</c:if>
							<c:if test="${wenlv.textType == 2}">
								<option name="textType" value="2">政策解读</option>
							</c:if>
							<c:if test="${wenlv.textType == 3}">
								<option name="textType" value="3">项目公告</option>
							</c:if>

											<option value="0" name="textType">--请选择--</option>
											<option value="1" name="textType">咨询动态</option>
											<option value="2" name="textType">政策解读</option>
											<option value="3" name="textType">项目公告</option>
							</select>
						</div>
					<label class="col-sm-1 control-label">创建类型:</label>
					<div class="col-sm-2">
						<select class="form-control" name="status" value="${wenlv.status}">
							<c:if test="${wenlv.status == 1}">
								<option name="status" value="1">转发</option>
							</c:if>
							<c:if test="${wenlv.status == 2}">
								<option name="status" value="2">自写</option>
							</c:if>
							<option value="0" name="status">--请选择--</option>
							<option value="1" name="status">转发</option>
							<option value="2" name="status">自写</option>
						</select>
					</div>
				</div>
				<div class="layui-upload" style="float: right; margin-right: 500px; margin-top: -150px">
					<button type="button" class="layui-btn" id="test1">上传政策封面图</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1" src="${wenlv.image}">
					</div>
					<input id="image" name="image" type="hidden"/>
					<p id="demoText"></p>
				</div>
				<div style="margin-left: 22px;">
				<label class="control-label">政策内容详情:</label><br>
				</div>
				<div style="margin-left: 22px; margin-top: 10px">
				    <div id="div1" class="toolbar"></div>
					    <div style="padding: 5px 0; color: #ccc"></div>
					    <div id="div2" class="text">
		    				<p>${wenlv.cotent}</p>
						</div>
					<input type="hidden" id="cotent" name="cotent">
		    	</div>
		    	<div style="margin-top: 10px; margin-left: 650px;">
		    		<button class="layui-btn layui-btn-sm" onclick="chan()" >确定添加/修改</button>
		    	</div>
			</form>
 		</div>
    <script type="text/javascript" src="/js/wangEditor.js"></script>
	<script type="text/javascript">
        var E = window.wangEditor;
        var editor1 = new E('#div1', '#div2');
        editor1.customConfig.uploadImgServer = '/uploadflv/upload';
        editor1.customConfig.uploadFileName = 'file';
        editor1.customConfig.uploadImgMaxSize = 10 * 1024 * 1024;
        editor1.create();
	</script>
	<script type="text/javascript">
        function chan() {
            $("#cotent").val(editor1.txt.html());
            $("#form1").submit();
        }
	</script>
</body>
	<script>
        layui.use('upload', function () {
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
                    console.log(res.data[0]);
                    if (res.code > 0) {
                        return layer.msg('上传失败！')
                    }
                    $('#image').val('' + res.data[0]);
                    return layer.msg('上传成功！')
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
</html>