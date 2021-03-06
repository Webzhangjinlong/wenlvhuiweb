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
	<script>
		function chan() {
            var browse = document.getElementById("browse").value;
            if(browse == null || browse == ""){
                alert("请输入浏览量");
                return false;
            }
			$("#spacePolicyDetail").val(editor1.txt.html());
            $("#form1").submit();
        }
		
	</script>
	<body style="width: 98%">
	<div style="margin-top: 10px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 空间活动添加
		</font>
		<br>
		<hr style="background: red; height: 2px; margin-top: 0px">
	</div>
 		<div>
			<form class="form-horizontal" role="form"  action="/space/spacePolicyUpdate" id="form1">
				<div>
					<input type="hidden" name="Policyid" value="${ymSpacePolicy.id}">
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">浏览量（必填）:</label>
					<div class="col-sm-2">
						<input class="form-control" id="browse" type="text" name="Policybrowse" value="${ymSpacePolicy.browse}" placeholder="请输入浏览量">
					</div>
				</div>
				<div class="layui-upload" style="margin-left: 20px;margin-top: 20px">
					<button type="button" class="layui-btn layui-btn-normal" id="test8">选择活动视频</button>
					<input type="hidden" id="videoUrl" name="videoUrl" value="${ymSpacePolicy.videoUrl}" >
					<button type="button" class="layui-btn" id="test9">开始上传</button><br>
					<p id="p1" class="layui-btn layui-btn-warm layui-btn-radius" style="margin-top: 11px">${ymSpacePolicy.videoUrl}</p>
				</div>
				<div style="margin-left: 20px; margin-top: 0px">
				<label class="control-label">活动详情（必填）:</label><br>
				</div>
				<div style="margin-left: 20px; margin-top: 10px">
				    <div id="div1" class="toolbar"></div>
					    <div style="padding: 5px 0; color: #ccc"></div>
					    <div id="div2" class="text">
							<p>${ymSpacePolicy.spacePolicyDetail}</p>
		    		</div>
					<input type="hidden" id="spacePolicyDetail" name="spacePolicyDetail">
		    	</div>
				<div class="layui-upload"  style="float: right ; margin-top: -330px; margin-right: 600px">
					<button type="button" class="layui-btn" id="test1">请上传视频封面图</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1" src="${ymSpacePolicy.videoBackimg}">
						<input id="videoBackimg" name="videoBackimg" type="hidden" value="${ymSpacePolicy.videoBackimg}"/>
						<p id="demoText"></p>
					</div>
				</div>
		    	<div style="margin-top: 10px; margin-left: 650px;">
		    		<button class="layui-btn layui-btn-sm" onclick="chan()">确定添加/修改</button>
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
        editor1.create();
    </script>
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
                    $('#videoBackimg').val('' + res.data[0]);
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
            //选完文件后不自动上传
            upload.render({
                elem: '#test8'
                ,url: '/uploadflv/upload'
                ,accept: 'video'
                ,auto:false
                //,multiple: true
                ,bindAction: '#test9'
                ,done: function(res){
                    console.log(res.data[0])
                    if(res.code > 0){
                        return layer.msg('上传失败！')
                    }
                    $("#videoUrl").val('' + res.data[0]);
                    $("#p1").text('' + res.data[0])
                    return layer.msg('上传成功！')
                }
            });
        });
	</script>
</body>
</html>