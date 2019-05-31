<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>欢迎进入文旅惠餐馆管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <link rel="stylesheet"
          href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<style type="text/css">
    .toolbar {
        border: 1px solid #ccc;
        width: 700px;
        margin-left: 120px;
    }

    .text {
        border: 1px solid #ccc;
        width: 700px;
        height: 100px;
    }

    .layui-upload-img {
        width: 132px;
        height: 92px;
        margin: 0 10px 10px 0;
    }
</style>
<body>
<div style="margin-top: 10px">
    <font style="color: #000; font-size: 12px; margin-left: 10px">
        ★ 添加匠人 </font> <br>
    <hr style="background: red; height: 2px; margin-top: 5px">
</div>
<div>
    <form class="form-horizontal" role="form" id="form1" action="/craftsman/addList">

        <div>
            <input type="hidden" name="id" value="${show.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">匠人名称:</label>
            <div class="col-sm-2">
                <input class="form-control" id="focusedInput" type="text" name="shopsName" value="${show.shopsName}"
                       placeholder="请输入匠人名称">
            </div>
            <label class="col-sm-1 control-label">创建人:</label>
            <div class="col-sm-2">
                <input class="form-control" id="focusedInput" type="text" name="createUser" value="${show.createUser}"
                       placeholder="请输入创建人">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">匠人标语:</label>
            <div class="col-sm-5">
                <input class="form-control" id="focusedInput" type="text" name="shopsSlogan" value="${show.shopsSlogan}"
                       placeholder="请输入匠人标语">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">市:</label>
            <div class="col-sm-2">
                <input class="form-control" id="focusedInput" type="text" name="city" value="${show.city}"
                       placeholder="市">
            </div>
            <label class="col-sm-1 control-label">区:</label>
            <div class="col-sm-2">
                <input class="form-control" id="focusedInput" type="text" name="area" value="${show.area}"
                       placeholder="区">
            </div>

			</div>
			<div class="form-group">
				<label class="col-sm-1 control-label">详细地址:</label>
				<div class="col-sm-5">
					<input class="form-control" id="focusedInput" type="text" name="addrDetail" value="${show.addrDetail}"
						placeholder="请输入详细地址">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-1 control-label">经度:</label>
				<div class="col-sm-2">
					<input class="form-control" id="focusedInput" type="text" name="longitude" value="${show.longitude}"
						placeholder="请输入经度">
				</div>
				<label class="col-sm-1 control-label">纬度:</label>
				<div class="col-sm-2">
					<input class="form-control" id="focusedInput" type="text" name="latitude" value="${show.latitude}"
						placeholder="纬度">
				</div>
				<div class="col-sm-2">
					<a href="https://lbs.amap.com/console/show/picker"
						class="form-control">♡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点我查看经纬度</a>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-1 control-label" style="margin-top: 30px;">匠人介绍:</label>
				<div style="margin-left: 120px">
					<div id="div1" class="toolbar"></div>
					<div style="padding: 5px 0; color: #ccc"></div>
					<div id="div2" class="text">
						<p>${show.shopsDetail}</p>
					</div>
					<input type="hidden" id="shopsDetail" name="shopsDetail">
				</div>
			</div>
			<div class="layui-upload" style="margin-left: 20px">
				<button type="button" class="layui-btn layui-btn-normal"
					id="testList">请上传商品封面</button>
				<div class="layui-upload-list" style="width: 800px">
					<table class="layui-table">
						<thead>
							<tr>
								<th>文件名</th>
								<th>大小</th>
								<th>状态</th>
								<th>描述</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody id="demoList"></tbody>
					</table>
				</div>
				<button type="button" class="layui-btn" id="testListAction">开始上传</button>
			</div>
			<div class="layui-upload" style="margin-left: 20px; margin-top: 20px">
				<button type="button" class="layui-btn layui-btn-normal"
					id="testList1">请选择需要上传的图片及视频</button>
				<div class="layui-upload-list" style="width: 800px">
					<table class="layui-table">
						<thead>
							<tr>
								<th>文件名</th>
								<th>大小</th>
								<th>状态</th>
								<th>描述</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody id="demoList1"></tbody>
					</table>
				</div>
				<button type="button" class="layui-btn" id="testListAction1">开始上传</button>
			</div>
			<div class="layui-upload"  style="margin-left: 800px; margin-top: -650px">
				<button type="button" class="layui-btn" id="test1">请上传店铺logo</button>
				<div class="layui-upload-list">
					<img class="layui-upload-img" id="demo1">
					<p id="demoText"></p>
				</div>
			</div>
			<div style="margin-left: 650px; margin-top: 620px">
		    		<button class="layui-btn layui-btn-sm" onclick="chan()">确定添加</button>
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
		function chan() {
            $("#shopsDetail").val(editor1.txt.html());
            $("#form1").submit();
        }
	</script>
	<script src="/layui/layui.js"></script>
	<script >
		layui
				.use(
						'upload',
						function() {
							var $ = layui.jquery, upload = layui.upload;
							var demoListView = $('#demoList'), uploadListIns = upload
									.render({
										elem : '#testList',
										url : '/upload/',
										accept : 'file',
										multiple : true,
										auto : false,
										bindAction : '#testListAction',
										choose : function(obj) {
											var files = this.files = obj
													.pushFile(); //将每次选择的文件追加到文件队列
											//读取本地文件
											obj
													.preview(function(index,
															file, result) {
														var tr = $([
																'<tr id="upload-'+ index +'">',
																'<td>'
																		+ file.name
																		+ '</td>',
																'<td>'
																		+ (file.size / 1014)
																				.toFixed(1)
																		+ 'kb</td>',
																'<td>等待上传</td>',
																'<td><input type="text"></td>',
																'<td>',
																'<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>',
																'<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete">删除</button>',
																'</td>',
																'</tr>' ]
																.join(''));
=======
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">详细地址:</label>
            <div class="col-sm-5">
                <input class="form-control" id="focusedInput" type="text" name="addrDetail" value="${show.addrDetail}"
                       placeholder="请输入详细地址">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">经度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="focusedInput" type="text" name="longitude" value="${show.longitude}"
                       placeholder="请输入经度">
            </div>
            <label class="col-sm-1 control-label">纬度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="focusedInput" type="text" name="latitude" value="${show.latitude}"
                       placeholder="纬度">
            </div>
            <div class="col-sm-2">
                <a href="https://lbs.amap.com/console/show/picker"
                   class="form-control">♡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点我查看经纬度</a>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label" style="margin-top: 30px;">匠人介绍:</label>
            <div style="margin-left: 120px">
                <div id="div1" class="toolbar"></div>
                <div style="padding: 5px 0; color: #ccc"></div>
                <div id="div2" class="text">
                    <p>${show.shopsDetail}</p>
                </div>
                <input type="hidden" id="shopsDetail" name="shopsDetail">
            </div>
        </div>
        <div class="layui-upload" style="margin-left: 20px">
            <button type="button" class="layui-btn layui-btn-normal"
                    id="testList">请上传商品封面
            </button>
            <div class="layui-upload-list" style="width: 800px">
                <table class="layui-table">
                    <thead>
                    <tr>
                        <th>文件名</th>
                        <th>大小</th>
                        <th>状态</th>
                        <th>描述</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody id="demoList"></tbody>
                </table>
            </div>
            <button type="button" class="layui-btn" id="testListAction">开始上传</button>
        </div>
        <div class="layui-upload" style="margin-left: 20px; margin-top: 20px">
            <button type="button" class="layui-btn layui-btn-normal"
                    id="testList1">请选择需要上传的图片及视频
            </button>
            <div class="layui-upload-list" style="width: 800px">
                <table class="layui-table">
                    <thead>
                    <tr>
                        <th>文件名</th>
                        <th>大小</th>
                        <th>状态</th>
                        <th>描述</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody id="demoList1"></tbody>
                </table>
            </div>
            <button type="button" class="layui-btn" id="testListAction1">开始上传</button>
        </div>
        <div class="layui-upload" style="float: right; margin-right: 300px; margin-top: -650px">
            <button type="button" class="layui-btn" id="test1">上传活动封面图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${show.imgUrl}">
            </div>
            <input id="image" name="image" type="hidden"/>
            <p id="demoText"></p>
        </div>
        <div style="margin-left: 750px;">
            <button class="layui-btn layui-btn-sm" onclick="chan()">确定添加</button>
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
>>>>>>> origin/master

</script>
<script type="text/javascript">
    function chan() {
        $("#shopsDetail").val(editor1.txt.html());
        $("#form1").submit();
    }
</script>
<script src="/layui/layui.js"></script>
<script>
    layui
        .use(
            'upload',
            function () {
                var $ = layui.jquery, upload = layui.upload;
                var demoListView = $('#demoList'), uploadListIns = upload
                    .render({
                        elem: '#testList',
                        url: '/upload/',
                        accept: 'file',
                        multiple: true,
                        auto: false,
                        bindAction: '#testListAction',
                        choose: function (obj) {
                            var files = this.files = obj
                                .pushFile(); //将每次选择的文件追加到文件队列
                            //读取本地文件
                            obj
                                .preview(function (index,
                                                   file, result) {
                                    var tr = $([
                                        '<tr id="upload-' + index + '">',
                                        '<td>'
                                        + file.name
                                        + '</td>',
                                        '<td>'
                                        + (file.size / 1014)
                                            .toFixed(1)
                                        + 'kb</td>',
                                        '<td>等待上传</td>',
                                        '<td><input type="text"></td>',
                                        '<td>',
                                        '<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>',
                                        '<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete">删除</button>',
                                        '</td>',
                                        '</tr>']
                                        .join(''));

                                    //单个重传
                                    tr
                                        .find(
                                            '.demo-reload')
                                        .on(
                                            'click',
                                            function () {
                                                obj
                                                    .upload(
                                                        index,
                                                        file);
                                            });

                                    //删除
                                    tr
                                        .find(
                                            '.demo-delete')
                                        .on(
                                            'click',
                                            function () {
                                                delete files[index]; //删除对应的文件
                                                tr
                                                    .remove();
                                                uploadListIns.config.elem
                                                    .next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
                                            });

                                    demoListView.append(tr);
                                });
                        },
                        done: function (res, index, upload) {
                            if (res.code == 0) { //上传成功
                                var tr = demoListView
                                    .find('tr#upload-'
                                        + index), tds = tr
                                    .children();
                                tds
                                    .eq(2)
                                    .html(
                                        '<span style="color: #5FB878;">上传成功</span>');
                                tds.eq(3).html(''); //清空操作
                                return delete this.files[index]; //删除文件队列已经上传成功的文件
                            }
                            this.error(index, upload);
                        },
                        error: function (index, upload) {
                            var tr = demoListView
                                .find('tr#upload-' + index), tds = tr
                                .children();
                            tds
                                .eq(2)
                                .html(
                                    '<span style="color: #FF5722;">上传失败</span>');
                            tds.eq(3).find('.demo-reload')
                                .removeClass('layui-hide'); //显示重传
                        }
                    });
            });
</script>
<script>
    layui
        .use(
            'upload',
            function () {
                var $ = layui.jquery, upload = layui.upload;
                var demoListView = $('#demoList1'), uploadListIns = upload
                    .render({
                        elem: '#testList1',
                        url: '/upload/',
                        accept: 'file',
                        multiple: true,
                        auto: false,
                        bindAction: '#testListAction1',
                        choose: function (obj) {
                            var files = this.files = obj
                                .pushFile(); //将每次选择的文件追加到文件队列
                            //读取本地文件
                            obj
                                .preview(function (index,
                                                   file, result) {
                                    var tr = $([
                                        '<tr id="upload-' + index + '">',
                                        '<td>'
                                        + file.name
                                        + '</td>',
                                        '<td>'
                                        + (file.size / 1014)
                                            .toFixed(1)
                                        + 'kb</td>',
                                        '<td>等待上传</td>',
                                        '<td><input type="text"></td>',
                                        '<td>',
                                        '<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>',
                                        '<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete">删除</button>',
                                        '</td>',
                                        '</tr>']
                                        .join(''));

                                    //单个重传
                                    tr
                                        .find(
                                            '.demo-reload')
                                        .on(
                                            'click',
                                            function () {
                                                obj
                                                    .upload(
                                                        index,
                                                        file);
                                            });

                                    //删除
                                    tr
                                        .find(
                                            '.demo-delete')
                                        .on(
                                            'click',
                                            function () {
                                                delete files[index]; //删除对应的文件
                                                tr
                                                    .remove();
                                                uploadListIns.config.elem
                                                    .next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
                                            });

                                    demoListView.append(tr);
                                });
                        },
                        done: function (res, index, upload) {
                            if (res.code == 0) { //上传成功
                                var tr = demoListView
                                    .find('tr#upload-'
                                        + index), tds = tr
                                    .children();
                                tds
                                    .eq(2)
                                    .html(
                                        '<span style="color: #5FB878;">上传成功</span>');
                                tds.eq(3).html(''); //清空操作
                                return delete this.files[index]; //删除文件队列已经上传成功的文件
                            }
                            this.error(index, upload);
                        },
                        error: function (index, upload) {
                            var tr = demoListView
                                .find('tr#upload-' + index), tds = tr
                                .children();
                            tds
                                .eq(2)
                                .html(
                                    '<span style="color: #FF5722;">上传失败</span>');
                            tds.eq(3).find('.demo-reload')
                                .removeClass('layui-hide'); //显示重传
                        }
                    });
            });
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
</body>
</html>