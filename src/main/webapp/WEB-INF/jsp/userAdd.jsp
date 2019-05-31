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
           $("#cotent").val(editor1.txt.html());
           $("#prize").val(editor2.txt.html());
           $("#policyRule").val(editor3.txt.html());
           $("#awardRules").val(editor4.txt.html());
           $("#policyPurpose").val(editor5.txt.html());
           $("#form1").submit();
   }
</script>
<div style="margin-top: 10px">
    <font style=" color: #000; font-size: 12px; margin-left: 10px">
        ★ 添加用户
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <form class="form-horizontal" id="form1" role="form" action="/tag/tagAddById" method="post">
        <div>
            <input type="hidden" name="id" value="${user.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">用户名:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入活用户名">
            </div>
            <label class="col-sm-1 control-label">密码:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入密码">
            </div>
            </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">注册手机号:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入注册手机号">
            </div>
            <label class="col-sm-1 control-label">使用状态:</label>
            <div class="col-sm-2">
                <select name="giveDefault" id="tagDefault" value="" class="form-control">
                    <option value="0" name="giveDefault">--请选择--</option>
                    <option value="1" name="giveDefault">正常</option>
                    <option value="2" name="giveDefault">非正常</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">用户类型:</label>
            <div class="col-sm-2">
                <select name="giveDefault" id="tagDefault" value="" class="form-control">
                    <option value="0" name="giveDefault">--请选择--</option>
                    <option value="1" name="giveDefault">艺人</option>
                    <option value="2" name="giveDefault">商家</option>
                    <option value="3" name="giveDefault">餐馆</option>
                    <option value="4" name="giveDefault">admin</option>
                </select>
            </div>
            <label class="col-sm-1 control-label">是否验证:</label>
            <div class="col-sm-2">
                <select name="giveDefault" id="tagDefault" value="" class="form-control">
                    <option value="0" name="giveDefault">--请选择--</option>
                    <option value="1" name="giveDefault">是</option>
                    <option value="2" name="giveDefault">否</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">昵称:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入用户昵称">
            </div>
            <label class="col-sm-1 control-label">真实姓名:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入真实姓名">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">性别:</label>
            <div class="col-sm-2">
                <select name="giveDefault" id="tagDefault" value="" class="form-control">
                    <option value="0" name="giveDefault">--请选择--</option>
                    <option value="1" name="giveDefault">男</option>
                    <option value="2" name="giveDefault">女</option>
                </select>
            </div>
            <label class="col-sm-1 control-label">会员等级:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">生日:</label>
            <div class="col-sm-5">
                <input class="form-control" id="tagName" type="text" name="title" value=""
                       placeholder="请输入会员生日">
            </div>
        </div>
        <div class="layui-upload" style="float: right; margin-right: 400px; margin-top: -300px">
            <button type="button" class="layui-btn" id="test1">上传用户头像</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="">
            </div>
            <input id="image" name="image" type="hidden"/>
            <p id="demoText"></p>
        </div>
        <div style="margin-top: 10px; margin-left: 550px;">
            <button type="button" id="button" onclick="chan()" class="layui-btn layui-btn-sm">确定添加/修改</button>
        </div>
    </form>
</div>
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