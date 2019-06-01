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
		    width: 130px;
		    height: 92px;
		    margin: 0 10px 10px 0;
}
    </style>
	<body>
	<div style="margin-top: 10px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 添加学校
		</font>
		<br>
		<hr style="background: red; height: 2px">
	</div>
 		<div>
			<form class="form-horizontal" role="form" action="/school/saveupdate">

				<div>
					<input type="hidden" name="id" value="${addSchool.id}">
				</div>

				<div class="form-group">
					<label class="col-sm-1 control-label">学校名称:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text" name="name" value="${addSchool.name}" value="" placeholder="请输入学校名称">
					</div>
						<label class="col-sm-1 control-label">学校类别:</label>
						<div class="col-sm-2">
							<select class="form-control" name="schoolType" value="${addSchool.schoolType}">
											<option value="0" name="schoolType">--请选择--</option>
											<option value="0" name="schoolType">唱歌</option>
											<option value="0" name="schoolType">跳舞</option>
											<option value="0" name="schoolType">刺绣</option>
							</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">市:</label>
					<div class="col-sm-2">
						<input class="form-control" name="city" value="${addSchool.city}" id="focusedInput" type="text"  value="${addSchool.city}" placeholder="请输入市">
					</div>
					<label class="col-sm-1 control-label">区:</label>
					<div class="col-sm-2">
						<input class="form-control" name="area" value="${addSchool.area}" id="focusedInput" type="text"  value="${addSchool.area}" placeholder="请输入区">
					</div>
				</div>
				<div class="form-group"style="margin-top: 32px">
						<label class="col-sm-1 control-label">联系电话:</label>
						<div class="col-sm-2">
							<input class="form-control" name="phone" value="${addSchool.phone}" id="focusedInput" type="text"  value="${addSchool.phone}" placeholder="请输入联系电话">
						</div>
				</div>
				<div class="form-group"style="margin-top: 32px">
						<label class="col-sm-1 control-label">详细地址:</label>
						<div class="col-sm-5">
							<input class="form-control" name="addrDetail" value="${addSchool.addrDetail}" id="focusedInput" type="text"  value="${addSchool.addrDetail}" placeholder="请输入详细地址">
						</div>
				</div>
				<div class="form-group" style="margin-top: 30px">
					<label class="col-sm-1 control-label">学校账号:</label>
					<div class="col-sm-2">
						<input class="form-control"  id="focusedInput" type="text"  value="" placeholder="">
					</div>
						<label class="col-sm-1 control-label">学校密码:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  value="" placeholder="">
					</div>
				</div>
				<div>
				<div class="layui-upload" style="float: right; margin-right: 400px; margin-top: -250px">
					<button type="button" class="layui-btn" id="test1">上传学校logo图：</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1">
						<div id="div3">
						</div>
					</div>
					<input id="image" name="image" type="hidden" />
					<p id="demoText"></p>
				</div>
					<div class="layui-upload" style="float: right; margin-right: 200px; margin-top: -250px">
						<button type="button" class="layui-btn" id="test4">上传学校背景图：</button>
						<div class="layui-upload-list">
							<img class="layui-upload-img" id="demo4">
							<div id="div4">
							</div>
						</div>
						<input id="image1" name="image" type="hidden" />
						<p id="demoText3"></p>
					</div>
		    	<div style="margin-top: 10px; margin-left: 550px;">
		    		<button class="layui-btn layui-btn-sm">确定添加/修改</button>
		    	</div>
				</div>
			</form>
 		</div>
	<!-- 学校图片列表 -->
	<div>
		<div>
		<div style="margin-left: 20px">
			<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#schoolImage">
				添加图片
			</button>
		</div>
		<table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden; width: 80%">
			<tr style="font-weight: bold;">
				<td>名称</td>
				<td>状态</td>
				<td>描述</td>
				<td>操作</td>
			</tr>
			<tr>
				<td>学生照片</td>
				<td>图片</td>
				<td>学生上学期间的照片</td>
				<td>
					<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#schoolImage">修改/详情
					</button>
					<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="">删除</button>
				</td>
			</tr>
		</table>
	</div>
		<div>
			<div style="margin-left: 20px">
				<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#schoolVideo">
					添加视频
				</button>
			</div>
			<table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden; width: 80%">
				<tr style="font-weight: bold;">
					<td>名称</td>
					<td>状态</td>
					<td>描述</td>
					<td>操作</td>
				</tr>
				<tr>
					<td>学生视频</td>
					<td>视频</td>
					<td>学生上学期间的视频</td>
					<td>
						<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#schoolVideo">修改/详情
						</button>
						<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="">删除</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<!-- 添加学校图片模态框 -->
	<div class="modal fade" id="schoolImage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="myModalLabel">
						学校图片添加
					</h4>
				</div>
				<div class="modal-body">
					<form id="modelImage" action="/school/saveupdate">
						<div class="layui-form-item" style="margin-left: 20px;">
							<label class="layui-form-label" style="width: 100px">图片名称</label>
							<div class="layui-input-inline">
								<input type="password" name="password" required lay-verify="required" placeholder="请输入图片描述！" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item" style="margin-left: 20px;">
							<label class="layui-form-label" style="width: 100px">图片状态</label>
							<div class="layui-input-inline">
								<select name="status" id="tagStatus" value="" class="form-control">
									<option value="1" name="status">图片</option>
								</select>
							</div>
						</div>
						<div class="layui-form-item" style="margin-left: 20px;">
							<label class="layui-form-label" style="width: 100px">图片描述</label>
							<div class="layui-input-inline">
								<input type="password" name="password" required lay-verify="required" placeholder="请输入图片描述！" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-upload" style="margin-left: 48px">
							<button type="button" class="layui-btn" id="test2">上传图片：</button>
							<div class="layui-upload-list" >
								<img class="layui-upload-img" id="demo2">
								<p id="demoText1"></p>
							</div>
						</div>
					</form>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" class="btn btn-primary">
						提交更改
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	</div>
	<!-- 添加学校视频模态框 -->
	<div class="modal fade" id="schoolVideo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="myModalLabel1">
						学校视频添加
					</h4>
				</div>
				<div class="modal-body">
					<form id="modelVideo" action="/school/saveupdate">
						<div class="layui-form-item" style="margin-left: 20px;">
							<label class="layui-form-label" style="width: 100px">视频名称</label>
							<div class="layui-input-inline">
								<input type="password" name="password" required lay-verify="required" placeholder="请输入视频描述！" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-form-item" style="margin-left: 20px;">
							<label class="layui-form-label" style="width: 100px">视频状态</label>
							<div class="layui-input-inline">
								<select name="status" id="" value="" class="form-control">
									<option value="1" name="status">视频</option>
								</select>
							</div>
						</div>
						<div class="layui-form-item" style="margin-left: 20px;">
							<label class="layui-form-label" style="width: 100px">视频描述</label>
							<div class="layui-input-inline">
								<input type="password" name="password" required lay-verify="required" placeholder="请输入视频描述！" autocomplete="off" class="layui-input">
							</div>
						</div>
						<div class="layui-upload" style="margin-left: 48px">
							<button type="button" class="layui-btn" id="test3">上传视频封面图：</button>
							<div class="layui-upload-list" >
								<img class="layui-upload-img" id="demo3">
								<p id="demoText2"></p>
							</div>
						</div>
						<div class="layui-upload" style="margin-left: 20px;">
							<button type="button" class="layui-btn layui-btn-normal" id="test8">选择学校视频</button>
							<input type="hidden" id="videourl" name="videourl" value="" >
							<button type="button" class="layui-btn" id="test9">开始上传</button><br>
							<p id="p1" class="layui-btn layui-btn-warm layui-btn-radius" style="margin-top: 11px"></p>
						</div>
					</form>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary">
							提交更改
						</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
	</div>
 </body>
	<script type="text/javascript" src="/js/wangEditor.js"></script>
		<script type="text/javascript">
            var E = window.wangEditor;
            var editor1 = new E('#divTitle', '#divContene');
            editor1.customConfig.uploadImgServer = '/upload';
            editor1.create();
		</script>
		<script>
        layui.use('upload', function() {
            var $ = layui.jquery
                , upload = layui.upload;
            //普通图片上传
            var uploadInst = upload.render({
                elem: '#test1'
                ,url: '/upload/'
                ,before: function(obj){
                    //预读本地文件示例，不支持ie8
                    obj.preview(function(index, file, result){
                        $('#demo1').attr('src', result); //图片链接（base64）
                    });
                }
                ,done: function(res){
                    //如果上传失败
                    if(res.code > 0){
                        return layer.msg('上传失败');
                    }
                    //上传成功
                }
                ,error: function(){
                    //演示失败状态，并实现重传
                    var demoText = $('#demoText');
                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                    demoText.find('.demo-reload').on('click', function(){
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
                ,url: '/upload/'
                ,before: function(obj){
                    //预读本地文件示例，不支持ie8
                    obj.preview(function(index, file, result){
                        $('#demo2').attr('src', result); //图片链接（base64）
                    });
                }
                ,done: function(res){
                    //如果上传失败
                    if(res.code > 0){
                        return layer.msg('上传失败');
                    }
                    //上传成功
                }
                ,error: function(){
                    //演示失败状态，并实现重传
                    var demoText = $('#demoText1');
                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                    demoText.find('.demo-reload').on('click', function(){
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
                elem: '#test3'
                ,url: '/upload/'
                ,before: function(obj){
                    //预读本地文件示例，不支持ie8
                    obj.preview(function(index, file, result){
                        $('#demo3').attr('src', result); //图片链接（base64）
                    });
                }
                ,done: function(res){
                    //如果上传失败
                    if(res.code > 0){
                        return layer.msg('上传失败');
                    }
                    //上传成功
                }
                ,error: function(){
                    //演示失败状态，并实现重传
                    var demoText = $('#demoText2');
                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                    demoText.find('.demo-reload').on('click', function(){
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
                    $("#videourl").val('' + res.data[0]);
                    $("#p1").text('' + res.data[0])
                    return layer.msg('上传成功！')
                }
            });
        });
	</script>
</html>