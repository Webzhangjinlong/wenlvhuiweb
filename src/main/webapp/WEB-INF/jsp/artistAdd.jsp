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
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="/layui/layui.js"></script>
</head>
<style type="text/css">
    .toolbar {
        border: 1px solid #ccc;
        width: 730px;
    }

    .text {
        border: 1px solid #ccc;
        width: 730px;
        height: 100px;
    }

    .layui-upload-img {
        width: 132px;
        height: 92px;
        margin: 0 10px 10px 0;
    }
</style>
<body>
<script type="text/javascript">
   function chan() {
       var artistName = document.getElementById("artistName").value;
       if(artistName == "" || artistName == null){
           alert("请输入艺人名称!");
           return false;
       }
           $("#artistExperience").val(editor1.txt.html());
           $("#artistDetails").val(editor5.txt.html());
           $("#form1").submit();
   }
</script>
<div style="margin-top: 10px">
    <font style=" color: #000; font-size: 12px; margin-left: 10px">
        ★ 添加艺人
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <form class="form-horizontal" id="form1" role="form" action="/artist/saveupdate" method="post">

        <div>
            <input type="hidden" name="id" value="${addYmArtist.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">艺人名称:</label>
            <div class="col-sm-2">
                <input class="form-control" id="artistName" type="text" name="artistName" value="${addYmArtist.artistName}"
                       placeholder="请输入艺人名称">
            </div>
            <label class="col-sm-1 control-label">艺人类型:</label>
            <div class="col-sm-2">
                <input class="form-control" id="artistType" type="text" name="type" value="${addYmArtist.artistType}"
                       placeholder="请输入艺人类型">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">艺人电话:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagSource" type="text" name="phone" value="${addYmArtist.artistPhone}"
                       placeholder="请输入艺人电话">
            </div>
            <label class="col-sm-1 control-label">艺人状态:</label>
            <div class="col-sm-2">
                <select name="status" id="tagStatus" value="${addYmArtist.artistStatus}" class="form-control">

                    <c:if test="${addYmArtist.artistStatus == 1}">
                        <option value="1" name="status">认证成功</option>
                    </c:if>
                    <c:if test="${addYmArtist.artistStatus == 2}">
                        <option value="2" name="status">未认证</option>
                    </c:if>
                    <option value="0" name="status">--请选择--</option>
                    <option value="1" name="status">认证成功</option>
                    <option value="2" name="status">未认证</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">艺人账号:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="num" value="${addYmArtist.artistPhone}"
                       placeholder="请输入艺人账号">
            </div>

        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">艺人介绍:</label><br>

        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="yrjs" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="yrjs1" class="text">
                <p >${addYmArtist.artistDetails}</p>
            </div>
            <input type="hidden" id="artistDetails" name="artistDetails" value="${addYmArtist.artistDetails}">
        </div>
        <div class="layui-upload" style="float: right; margin-right: 400px; margin-top: -320px">
            <button type="button" class="layui-btn" id="test1">上传艺人封面图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${addYmArtist.backgroundUrl}">
            </div>
            <input id="backgroundUrl" name="backgroundUrl" type="hidden" value="${addYmArtist.backgroundUrl}"/>
            <p id="demoText"></p>
        </div>
        <div class="layui-upload" style="float: right; margin-right: 200px; margin-top: -320px">
            <button type="button" class="layui-btn" id="test2">上传艺人logo</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo2" src="${addYmArtist.artistLogourl}">
            </div>
            <input id="artistLogourl" name="artistLogourl" type="hidden" value="${addYmArtist.artistLogourl}"/>
            <p id="demoText1"></p>
        </div>
            <div class="layui-upload" style="float: right; margin-top: -760px; margin-right: 150px">
                <button type="button" class="layui-btn layui-btn-normal" id="test8">选择活动视频</button>
                <input class="layui-upload-file" type="file" accept="undefined" name="file">
                <button type="button" class="layui-btn" id="test9">开始上传</button>
            </div>
        <div style="margin-left: 22px;">
            <label class="control-label">艺人经历:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="div1" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="div2" class="text">
                <p>${addYmArtist.artistExperience}</p>
            </div>
            <input type="hidden" id="artistExperience" name="artistExperience" value="${addYmArtist.artistExperience}">
        </div>
        <div style="margin-top: 10px; margin-left: 650px;">
            <button type="button" id="button" onclick="chan()" class="layui-btn layui-btn-sm">确定添加/修改</button>
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
    var E = window.wangEditor;
    var editor5 = new E('#yrjs', '#yrjs1');
    editor5.customConfig.uploadImgServer = '/uploadflv/upload';
    editor5.customConfig.uploadFileName = 'file';
    editor5.customConfig.uploadImgMaxSize = 10 * 1024 * 1024;
    editor5.create();
</script>
<script type="text/javascript">
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
                $('#backgroundUrl').val('' + res.data[0]);
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
    layui.use('upload', function () {
        var $ = layui.jquery
            , upload = layui.upload;
        //普通图片上传
        var uploadInst1 = upload.render({
            elem: '#test2'
            , url: '/uploadflv/upload'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo2').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                console.log(res.data[0]);
                if (res.code > 0) {
                    return layer.msg('上传失败！')
                }
                $('#artistLogourl').val('' + res.data[0]);
                return layer.msg('上传成功！')
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText1');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst1.upload();
                });
            }
        });
    });
</script>
</html>