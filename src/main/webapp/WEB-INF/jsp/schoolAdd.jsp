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
		.layui-table img {
			max-width: 100px;
			max-height: 50px;
		}
    </style>
	<script type="text/javascript">
		function chan() {
            $("#details").val(editor1.txt.html());
            $("#form1").submit();
        }
	</script>
	<body style="width: 98%">
	<div style="margin-top: 10px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
			★ 添加学校
		</font>
		<br>
		<hr style="background: red; height: 2px">
	</div>
 		<div>
			<form class="form-horizontal" role="form" id="form1" action="/school/saveupdate">

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
											<c:if test="${addSchool.schoolType == 16}">
												<option value="16" name="schoolType">唱歌</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 17}">
												<option value="16" name="schoolType">书法</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 18}">
												<option value="16" name="schoolType">刺绣</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 19}">
												<option value="16" name="schoolType">健身</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 20}">
												<option value="16" name="schoolType">摄影</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 21}">
												<option value="16" name="schoolType">乒乓球</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 22}">
												<option value="16" name="schoolType">舞蹈</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 23}">
												<option value="16" name="schoolType">剪纸</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 24}">
												<option value="16" name="schoolType">乐器</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 25}">
												<option value="16" name="schoolType">绘画</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 26}">
												<option value="16" name="schoolType">武术</option>
											</c:if>
											<c:if test="${addSchool.schoolType == 27}">
												<option value="16" name="schoolType">游泳</option>
											</c:if>
											<option value="0" name="schoolType">--请选择--</option>
											<option value="16" name="schoolType">唱歌</option>
											<option value="17" name="schoolType">书法</option>
											<option value="18" name="schoolType">刺绣</option>
											<option value="19" name="schoolType">健身</option>
											<option value="20" name="schoolType">摄影</option>
											<option value="21" name="schoolType">乒乓球</option>
											<option value="22" name="schoolType">舞蹈</option>
											<option value="23" name="schoolType">剪纸</option>
											<option value="24" name="schoolType">乐器</option>
											<option value="25" name="schoolType">绘画</option>
											<option value="26" name="schoolType">武术</option>
											<option value="27" name="schoolType">游泳</option>
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
				<div class="form-group">
						<label class="col-sm-1 control-label">手机号:</label>
						<div class="col-sm-2">
							<input class="form-control" name="phone" value="${addSchool.phone}" id="focusedInput" type="text" placeholder="请输入联系电话">
						</div>
						<label class="col-sm-1 control-label">登陆密码:</label>
						<div class="col-sm-2">
							<input class="form-control" name="phone" value="" id="focusedInput" type="text" placeholder="请输入登陆密码">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">详细地址:</label>
						<div class="col-sm-2">
							<input class="form-control" name="addrDetail" value="${addSchool.addrDetail}" id="addrDetail" type="text" placeholder="请输入详细地址">
						</div>
						<label class="col-sm-1 control-label">查看金额:</label>
						<div class="col-sm-2">
							<input class="form-control" name="addrDetail" value="" id="addrDetail" type="text" placeholder="请输入查看金额">
						</div>
				</div>
				<div>
				<div class="layui-upload" style="float: right; margin-right: 400px; margin-top: -190px">
					<button type="button" class="layui-btn" id="test1">上传学校logo图：</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1" src="${addSchool.logourl}">
					</div>
					<input id="logourl" name="logourl" type="hidden" value="${addSchool.logourl}" />
					<p id="demoText"></p>
				</div>
					<div class="layui-upload" style="float: right; margin-right: 200px; margin-top: -190px">
						<button type="button" class="layui-btn" id="test4">上传学校背景图：</button>
						<div class="layui-upload-list">
							<img class="layui-upload-img" id="demo4" src="${byImgTypeAndPidAndImageType.imgUrl}">
						</div>
						<input id="backImg" name="backImg" type="hidden" />
						<p id="demoText3"></p>
					</div>
                    <div class="form-group">
                            <label class="col-sm-1 control-label">学校详情:</label>
						<div style="margin-left: 30px; margin-top: 40px">
							<div id="div1" class="toolbar"></div>
							<div style="padding: 5px 0; color: #ccc"></div>
							<div id="div2" class="text">
								<p>${addSchool.details}</p>
							</div>
							<input type="hidden" id="details" name="details">
						</div>
						<script type="text/javascript" src="/js/wangEditor.js"></script>
						<script type="text/javascript">
                            var E = window.wangEditor;
                            var editor1 = new E('#div1', '#div2');
                            editor1.create();
						</script>
                    </div>
		    	<div style="margin-top: 10px; margin-left: 550px;">
		    		<button class="layui-btn layui-btn-sm" onclick="chan()">确定添加/修改</button>
		    	</div>
				</div>
			</form>
 		</div>
	<!-- 学校图片列表 -->
	<div>
		<div>
		<div style="margin-left: 20px">
			<button class="btn btn-primary btn-sm" id="aa" onclick="imageAdd(${addSchool.id})">
				添加图片
				<script type="text/javascript">
					function imageAdd(id) {
						if(id == null || id == ""){
						    alert("请添加完成学校之后在添加图片！")
							document.getElementById("aa").disabled = true;
						}
						window.location.href="/school/schoolImage"
                    }

				</script>
			</button>
		</div>
		<table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden; width: 80%">
			<tr style="font-weight: bold;">
				<td width="25">名称</td>
				<td width="25">状态</td>
				<td width="25">图片</td>
				<td width="25">描述</td>
				<td width="25">操作</td>
			</tr>

			<c:forEach items="${ymImages}" var="ymImages">
			<tr>
				<td>${ymImages.imgName}</td>
				<td>
					<c:if test="${ymImages.imageType == 1}">图片</c:if>
					<c:if test="${ymImages.imageType == 2}">视频</c:if>
				</td>
				<td><img src="${ymImages.imgUrl}"></td>
				<td>${ymImages.detalis}</td>
				<td>
					<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteImgById(${ ymImages.id})">删除</button>
				</td>

			</tr>
			</c:forEach>
		</table>
	</div>
		<div>
			<div style="margin-left: 20px">
				<button class="btn btn-primary btn-sm" id="bb" onclick="videoAdd(${addSchool.id})">
					添加视频
					<script type="text/javascript">
                        function videoAdd(id) {
                            if(id == null || id == ""){
                                alert("请添加完成学校之后在添加视频！")
                                document.getElementById("bb").disabled = true;
                            }
                            window.location.href="/school/schoolVideo"
                        }

					</script>
				</button>
			</div>
			<table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden; width: 80%">
				<tr style="font-weight: bold;">
					<td width="25">名称</td>
					<td width="25">状态</td>
					<td width="25">图片</td>
					<td width="25">描述</td>
					<td width="25">操作</td>
				</tr>

				<c:forEach items="${ymvideo}" var="ymvideo">
				<tr>
					<td>${ymvideo.imgName}</td>
					<td>
						<c:if test="${ymvideo.imageType == 1}">图片</c:if>
						<c:if test="${ymvideo.imageType == 2}">视频</c:if>
					</td>
					<td style="width: 25px; height: 25px"><img src="${ymvideo.imgUrl}"></td>
					<td>${ymvideo.detalis}</td>
					<td>
						<%--<button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#schoolVideo">修改/详情--%>
						<%--</button>--%>
						<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteVideoById(${ ymvideo.id})">删除</button>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
 </body>

	<script type="text/javascript">
        function deleteVideoById(id){
			window.location.href="/school/deleteVideo?id="+id;
		}

        function deleteImgById(id){
            window.location.href="/school/deleteImg?id="+id;
        }
	</script>
		<script>
        layui.use('upload', function() {
            var $ = layui.jquery
                , upload = layui.upload;
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
                    $('#logourl').val('' + res.data[0]);
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
	<script>
        layui.use('upload', function() {
            var $ = layui.jquery
                , upload = layui.upload;
            //普通图片上传
            var uploadInst = upload.render({
                elem: '#test4'
                ,url: '/uploadflv/upload'
                ,before: function(obj){
                    //预读本地文件示例，不支持ie8
                    obj.preview(function(index, file, result){
                        $('#demo4').attr('src', result); //图片链接（base64）
                    });
                }
                ,done: function(res){
                    //如果上传失败
                    if(res.code > 0){
                        return layer.msg('上传失败');
                    }
                    $('#backImg').val(''+ res.data[0]);
                    //上传成功
                }
                ,error: function(){
                    //演示失败状态，并实现重传
                    var demoText = $('#demoText4');
                    demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                    demoText.find('.demo-reload').on('click', function(){
                        uploadInst.upload();
                    });
                }
            });
        });
	</script>
</html>