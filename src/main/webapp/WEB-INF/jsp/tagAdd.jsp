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
  		<link rel="stylesheet" href="layui/css/layui.css"  media="all">
  		<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
		<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
		<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
  		<script src="layui/layui.js"></script>
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
 			<font style="color: #000; font-size: 12px; margin-top: 10px; margin-left: 20px">
 				★ 添加活动
 			</font>
 			<br>
 			<hr style="background: red; height: 2px; margin-top: -3px">
 		</div>
 		<div>
			<form class="form-horizontal" role="form" >
				<div class="form-group">
					<label class="col-sm-1 control-label">活动名称:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入活动名称">
					</div>
						<label class="col-sm-1 control-label">活动类别:</label>
						<div class="col-sm-2">
						<select class="form-control">
									<option>--请选择--</option>
											<option>惠民</option>
											<option>演出</option>
											<option>亲子</option>
											<option>赛事</option>
											<option>历史</option>
											<option>社区</option>
							</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">活动来源:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入活动来源">
					</div>
						<label class="col-sm-1 control-label">创建类型:</label>
						<div class="col-sm-2">
						<select class="form-control">
									<option>--请选择--</option>
											<option>转发</option>
											<option>自写</option>
							</select>
					</div>
				</div>
				<div class="form-group" style="margin-top: ">
					<label class="col-sm-1 control-label">参与人数:</label>
					<div class="col-sm-2">
						<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入参与人数">
					</div>
						<label class="col-sm-1 control-label">活动状态:</label>
						<div class="col-sm-2">
							<select class="form-control">
									<option>--请选择--</option>
											<option>未开启</option>
											<option>进行中</option>
											<option>结束</option>
							</select>
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">报名时间:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入报名时间">
						</div>
						<label class="col-sm-1 control-label">活动时间:</label>
						<div class="col-sm-2">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入活动时间">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">详细地址:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入详细地址">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">活动奖品:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入各奖项奖品">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">活动规则:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入活动规则">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">获奖规则:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入获奖规则">
						</div>
				</div>
				<div class="form-group">
						<label class="col-sm-1 control-label">活动宗旨:</label>
						<div class="col-sm-5">
							<input class="form-control" id="focusedInput" type="text"  value="" placeholder="请输入活动宗旨">
						</div>
				</div>
				<div style="margin-left: 22px;">
				<label class="control-label">活动内容详情:</label><br>
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
    <script type="text/javascript" src="js/wangEditor.min.js"></script>
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