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
    <script src="/layui/layui.js"></script>
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
<script type="text/javascript">
    function chan() {
        $("#form1").submit();
    }
</script>
<div style="margin-top: 10px">
    <font style="color: #000; font-size: 12px; margin-left: 10px">
        ★ 添加空间 </font> <br>
    <hr style="background: red; height: 2px; margin-top: 5px">
</div>
<div>
    <form class="form-horizontal" role="form" id="form1" action="/craftsman/addList">

        <div>
            <input type="hidden" name="id" value="${space.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">空间名:</label>
            <div class="col-sm-2">
                <input class="form-control" id="shopsName" type="text" name="shopsName" value=""
                       placeholder="请输入空间名">
            </div>
            <label class="col-sm-1 control-label">标题:</label>
            <div class="col-sm-2">
                <input class="form-control" id="shopsSlogan" type="text" name="shopsSlogan" value="${show.shopsSlogan}"
                       placeholder="请输入标题">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">场馆面积:</label>
            <div class="col-sm-2">
                <input class="form-control" id="city" type="text" name="city" value="${show.city}"
                       placeholder="场馆面积">
            </div>
            <label class="col-sm-1 control-label">开放时间:</label>
            <div class="col-sm-2">
                <input class="form-control" id="area" type="text" name="area" value="${show.area}"
                       placeholder="开放时间">
            </div>

        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">详细地址:</label>
            <div class="col-sm-5">
                <input class="form-control" id="addrDetail" type="text" name="addrDetail" value="${show.addrDetail}"
                       placeholder="请输入详细地址">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">联系电话:</label>
            <div class="col-sm-2">
                <input class="form-control" id="addrDetail" type="text" name="addrDetail" value="${show.addrDetail}"
                       placeholder="请输入联系电话">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">经度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="longitude" type="text" name="longitude" value="${show.longitude}"
                       placeholder="请输入经度">
            </div>
            <label class="col-sm-1 control-label">纬度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="latitude" type="text" name="latitude" value="${show.latitude}"
                       placeholder="纬度">
            </div>
            <div class="col-sm-2">
                <a href="https://lbs.amap.com/console/show/picker"
                   class="form-control">♡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点我查看经纬度</a>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label" style="margin-top: 30px;">空间内容:</label>
            <div style="margin-left: 120px">
                <div id="div1" class="toolbar"></div>
                <div style="padding: 5px 0; color: #ccc"></div>
                <div id="div2" class="text">
                    <p></p>
                </div>
                <input type="hidden" id="shopsDetail" name="shopsDetail">
            </div>
        </div>
        <div class="layui-upload" style="float: right ; margin-top: -400px; margin-right: 440px">
            <button type="button" class="layui-btn" id="test1">请上传空间头型</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="">
                <input id="imgUrl" name="imgUrl" type="hidden" value=""/>
                <p id="demoText"></p>
            </div>
        </div>
        <div class="layui-upload" style="float: right ; margin-top: -400px; margin-right: 250px">
            <button type="button" class="layui-btn" id="test2">请上传空间背景</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo2" src="">
                <input id="province" name="province" type="hidden" value=""/>
                <p id="demoText1"></p>
            </div>
        </div>
        <div style=" margin-left: 700px;">
            <button type="button" id="button" class="layui-btn layui-btn-sm" onclick="chan()">确定添加/修改</button>
        </div>
    </form>
</div>
<div>
    <div style="margin-left: 20px">
        <button class="btn btn-primary btn-sm" onclick="addDetail()">
            添加场馆
        </button>
    </div>
    <table class="layui-table" lay-skin="line" style="margin-left: 20px; width: 80%">
        <thead>
        <tr>
            <th>场馆名称</th>
            <th>场馆图片</th>
            <th>容纳人数</th>
            <th>场馆面积</th>
            <th>联系电话</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>老张的内裤工厂</td>
                <td><img src="" alt="11"></td>
                <td>265人</td>
                <td>124平米</td>
                <td>13895956234</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="updateDetail()">修改</button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ productList.id})">删除</button>
                </td>
            </tr>
        </tbody>
    </table>
    <div style="margin-left: 20px">
        <button class="btn btn-primary btn-sm" onclick="addPolicy()">
            添加活动
        </button>
    </div>
    <table class="layui-table" lay-skin="line" style="margin-left: 20px; width: 80%">
        <thead>
        <tr>
            <th>活动图片</th>
            <th>浏览量</th>
            <th>创建时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><img src="" alt="11"></td>
            <td>56</th>
            <td>2013-02-03</td>
            <td>
                <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="updatePolicy()">修改</button>
                <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById()">删除</button>
            </td>
        </tr>
        </tbody>
    </table>
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
    var editor2 = new E('#experience1', '#experience2');
    editor2.create();
</script>
<script type="text/javascript">
    function deleteById(id) {
        alert("您已成功删除！");
        window.location.href = "/craftsman/deletePro?id=" + id;
    }
</script>

<script>
    function addDetail() {
        window.location.href = "/space/detailAdd";
    }

</script>

<script>
    function addPolicy() {
        window.location.href = "/space/policyAdd";
    }

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
                $('#imgUrl').val('' + res.data[0]);
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
        var uploadInst = upload.render({
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
                $('#province').val('' + res.data[0]);
                return layer.msg('上传成功！')
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText1');
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