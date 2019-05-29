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
	<script>
        function check() {
           document.getElementById('')
        }
	</script>
	<body>
	<div style="margin-top: 5px">
		<font style="color: #000; font-size: 12px; margin-left: 10px">
 				★ 添加活动
 			</font>
 			<br>
		<hr style="background: red; height: 2px; margin-top: 5px">
 		</div>
 		<div>
			<form class="form-horizontal" id="form1" role="form" action="/tag/tagAddById" method="post">
				<div>
					<input type="hidden" name="id" value="${tagupdate.id}">
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">活动名称:</label>
					<div class="col-sm-2">
						<input class="form-control" id="tagName" type="text"  name="title" value="${tagupdate.title}" placeholder="请输入活动名称">
					</div>
						<label class="col-sm-1 control-label">活动类别:</label>
						<div class="col-sm-2">
						<select id="tagType" name="textType" value="${tagupdate.textType}" class="form-control">
							<c:if test="${tagupdate.textType == 1}">
								<option name="textType" value="1">惠民</option>
							</c:if>
							<c:if test="${tagupdate.textType == 2}">
								<option name="textType" value="1">演出</option>
							</c:if>
							<c:if test="${tagupdate.textType == 3}">
								<option name="textType" value="3">亲子</option>
							</c:if>
							<c:if test="${tagupdate.textType == 4}">
								<option name="textType" value="1">赛事</option>
							</c:if>
							<c:if test="${tagupdate.textType == 5}">
								<option name="textType" value="5">历史</option>
							</c:if>
							<c:if test="${tagupdate.textType == 6}">
								<option name="textType" value="1">社区</option>
							</c:if>
											<option value="0" name="textType">--请选择--</option>
											<option value="1" name="textType">惠民</option>
											<option value="2" name="textType">演出</option>
											<option value="3" name="textType">亲子</option>
											<option value="4" name="textType">赛事</option>
											<option value="5" name="textType">历史</option>
											<option value="6" name="textType">社区</option>
							</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">活动来源:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text" name="source" value="${tagupdate.source}" placeholder="请输入活动来源">
					</div>
						<label class="col-sm-1 control-label">创建类型:</label>
						<div class="col-sm-2">
						<select name="status" value="${tagupdate.status}" class="form-control">
							<c:if test="${tagupdate.status == 1}">
								<option value="1" name="status">转发</option>
							</c:if>
							<c:if test="${tagupdate.status == 2}">
								<option value="2" name="status">自写</option>
							</c:if>
											<option value="0" name="status">--请选择--</option>
											<option value="1" name="status">转发</option>
											<option value="2" name="status">自写</option>
							</select>
					</div>
				</div>
				<div class="form-group" >
					<label class="col-sm-1 control-label">参与人数:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" name="peopleNum" type="text"  value="${ tagupdate.peopleNum}" placeholder="请输入参与人数">
					</div>
						<label class="col-sm-1 control-label">活动状态:</label>
						<div class="col-sm-2">
							<select name="giveDefault" value="${tagupdate.giveDefault}" class="form-control">
								<c:if test="${tagupdate.giveDefault == 1}">
									<option value="1" name="giveDefault">进行中</option>
								</c:if>
								<c:if test="${tagupdate.giveDefault == 2}">
									<option value="2" name="giveDefault">已结束</option>
								</c:if>
								<c:if test="${tagupdate.giveDefault == 3}">
									<option value="3" name="giveDefault">未开始</option>
								</c:if>
											<option value="0" name="giveDefault">--请选择--</option>
											<option value="1" name="giveDefault">进行中</option>
											<option value="2" name="giveDefault">已结束</option>
											<option value="3" name="giveDefault">未开始</option>
							</select>
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">报名时间:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text" name="signDate" value="${tagupdate.signDate}" placeholder="年-月-日">
						</div>
						<label class="col-sm-1 control-label">活动时间:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text" name="policyDate" value="${tagupdate.policyDate}" placeholder="年-月-日">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">详细地址:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text" name="policyAddr" value="${tagupdate.policyAddr}" placeholder="请输入详细地址">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">活动奖品:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text" name="prize" value="${tagupdate.prize}" placeholder="请输入各奖项奖品">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">活动规则:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text" name="policyRule" value="${tagupdate.policyRule}" placeholder="请输入活动规则">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">获奖规则:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text" name="awardRules" value="${tagupdate.awardRules}" placeholder="请输入获奖规则">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">活动宗旨:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text" name="policyPurpose" value="${tagupdate.policyPurpose}" placeholder="请输入活动宗旨">
						</div>
				</div>
				<div class="layui-upload" style="margin-left: 20px">
					<button type="button" class="layui-btn" id="test1">上传活动封面图</button>
					<div class="layui-upload-list">
						<img class="layui-upload-img" id="demo1" src="${tagupdate.image}" style="width: 10%; height: 15%">
						<div id="div3">
						</div>
					</div>
					<input id="image" name="image" type="hidden" />
					<p id="demoText"></p>
				</div>
				<div style="margin-left: 22px;">
					<label class="control-label">活动内容详情:</label><br>
				</div>
				<div style="margin-left: 22px; margin-top: 10px">
					<div id="div1" class="toolbar"></div>
					<div style="padding: 5px 0; color: #ccc"></div>
					<div id="div2"   class="text">
						<p>${tagupdate.cotent}</p>
					</div>
				</div>
		    	<div style="margin-top: 10px; margin-left: 650px;">
		    		<button type="button" onclick="chan()" class="layui-btn layui-btn-sm">确定添加/修改</button>
		    	</div>
		    	<input type="hidden" id="cotent"  name="cotent">
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
        function chan(){
       		$("#cotent").val(editor1.txt.html());
       		$("#form1").submit();
        }
       
    </script>
</body>
<script>
		function addOk() {
			alert("修改完成");
			window.location.href="/tag/list"  //你不应该点添加的嘛
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
                      if(res.code>0){
						return layer.msg('上传失败！')
					  }
                      $('#image').val('/'+res.url);
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