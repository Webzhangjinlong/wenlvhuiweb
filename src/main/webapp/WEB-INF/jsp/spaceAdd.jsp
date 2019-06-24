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
    .layui-table img {
        max-width: 100px;
        height: 50px;
    }
</style>
<body>
<script type="text/javascript">
    function chan() {
        var spaceName = document.getElementById("spaceName").value;
        var spaceTitle = document.getElementById("spaceTitle").value;
        var spaceMeasure = document.getElementById("spaceMeasure").value;
        var openDate = document.getElementById("openDate").value;
        var addr = document.getElementById("addr").value;
        var tel = document.getElementById("tel").value;
        var browse = document.getElementById("browse").value;
        var longitude = document.getElementById("longitude").value;
        var latitude = document.getElementById("latitude").value;
        if(spaceName == null || spaceName == ""){
            alert("请输入空间名称");
            return false;
        }if(spaceTitle == null || spaceTitle == "") {
            alert("请输入空间标题");
            return false;
        }if(spaceMeasure == null || spaceMeasure == "") {
            alert("请输入空间面积");
            return false;
        }if(openDate == null || openDate == "") {
            alert("请输入开放时间");
            return false;
        }if(addr == null || addr == "") {
            alert("请输入详细地址");
            return false;
        }if(tel == null || tel == "") {
            alert("请输入联系电话");
            return false;
        }if(browse == null || browse == "") {
            alert("请输入浏览量");
            return false;
        }if(longitude == null || longitude == "") {
            alert("请输入经度");
            return false;
        }if(latitude == null || latitude == "") {
            alert("请输入纬度");
            return false;
        }
        $("#dateil").val(editor1.txt.html());
        $("#form1").submit();
    }
</script>
<div style="margin-top: 10px">
    <font style="color: #000; font-size: 12px; margin-left: 10px">
        ★ 添加空间 </font> <br>
    <hr style="background: red; height: 2px; margin-top: 5px">
</div>
<div>
    <form class="form-horizontal" role="form" id="form1" action="/space/SpaceDetailsUpdate">

        <div>
            <input type="hidden" name="id" value="${addYmSpace.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">空间名:</label>
            <div class="col-sm-2">
                <input class="form-control" id="spaceName" type="text" name="spaceName" value="${addYmSpace.spaceName}"
                       placeholder="请输入空间名">
            </div>
            <label class="col-sm-1 control-label">标题:</label>
            <div class="col-sm-2">
                <input class="form-control" id="spaceTitle" type="text" name="spaceTitle" value="${addYmSpace.spaceTitle}"
                       placeholder="请输入标题">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">场馆面积:</label>
            <div class="col-sm-2">
                <input class="form-control" id="spaceMeasure" type="text" name="spaceMeasure" value="${addYmSpace.spaceMeasure}"
                       placeholder="场馆面积">
            </div>
            <label class="col-sm-1 control-label">开放时间:</label>
            <div class="col-sm-2">
                <input class="form-control" id="openDate" type="text" name="openDate" value="${addYmSpace.openDate}"
                       placeholder="开放时间">
            </div>

        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">详细地址:</label>
            <div class="col-sm-5">
                <input class="form-control" id="addr" type="text" name="addr" value="${addYmSpace.addr}"
                       placeholder="请输入详细地址">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">联系电话:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tel" type="text" name="tel" value="${addYmSpace.tel}"
                       placeholder="请输入联系电话">
            </div>
            <label class="col-sm-1 control-label">浏览量:</label>
            <div class="col-sm-2">
                <input class="form-control" id="browse" type="text" name="browse" value="${addYmSpace.browse}"
                       placeholder="请输入浏览量">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">经度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="longitude" type="text" name="longitude" value="${addYmSpace.longitude}"
                       placeholder="请输入经度">
            </div>
            <label class="col-sm-1 control-label">纬度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="latitude" type="text" name="latitude" value="${addYmSpace.latitude}"
                       placeholder="纬度">
            </div>
            <div class="col-sm-2">
                <a href="https://lbs.amap.com/console/show/picker"
                   class="form-control">♡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点我查看经纬度</a>
            </div>
        </div>
        <div>
            <label class="col-sm-1 control-label">空间密码:</label>
            <div class="col-sm-2">
                <input class="form-control" id="password" type="text" name="password" value="${byTypeIdspace.password}"
                       placeholder="纬度">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label" style="margin-top: 30px;">空间内容（必填）:</label>
            <div style="margin-left: 120px">
                <div id="div1" class="toolbar"></div>
                <div style="padding: 5px 0; color: #ccc"></div>
                <div id="div2" class="text">
                    <p>${addYmSpace.dateil}</p>
                </div>
                <input type="hidden" id="dateil" name="dateil">
            </div>
        </div>
        <div class="layui-upload" style="float: right ; margin-top: -400px; margin-right: 440px">
            <button type="button" class="layui-btn" id="test1">请上传空间头像</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${addYmSpace.backupField1}">
                <input id="backupField1" name="backupField1" type="hidden" value="${addYmSpace.backupField1}"/>
                <p id="demoText"></p>
            </div>
        </div>
        <div class="layui-upload" style="float: right ; margin-top: -400px; margin-right: 250px">
            <button type="button" class="layui-btn" id="test2">请上传空间背景</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo2" src="${addYmSpace.backImg}">
                <input id="backImg" name="backImg" type="hidden" value="${addYmSpace.backImg}"/>
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
        <button class="btn btn-primary btn-sm" onclick="addDetail(${addYmSpace.id})">
            添加场馆
            <script type="text/javascript">
                function addDetail(id) {
                    if(id == null || id == ""){
                        alert("请添加完成空间之后在添加场馆！")
                        document.getElementById("aa").disabled = true;
                        return false;
                    }
                    window.location.href = "/space/spaceDetailAdd";
                }
            </script>
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
        <c:forEach items="${spaceDetailList}" var="spaceDetailList">
            <tr>
                <td>${spaceDetailList.name}</td>
                <td><img src="${spaceDetailList.image}"></td>
                <td>${spaceDetailList.population}</td>
                <td>${spaceDetailList.spaceMeasure}</td>
                <td>${spaceDetailList.tel}</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="updateDetailsById(${ spaceDetailList.id})">修改</button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteDetailsById(${ spaceDetailList.id})">删除</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="margin-left: 20px">
        <button class="btn btn-primary btn-sm" onclick="addPolicy(${addYmSpace.id})">
            添加活动
            <script type="text/javascript">
                function addPolicy(id) {
                    if(id == null || id == ""){
                        alert("请添加完成空间之后在添加场馆！")
                        document.getElementById("aa").disabled = true;
                        return false;
                    }
                    window.location.href = "/space/spacePolicyAdd";
                }
            </script>
        </button>
    </div>
    <table class="layui-table" lay-skin="line" style="margin-left: 20px; width: 80%">
        <thead>
        <tr>
            <th>活动图片</th>
            <th>浏览量</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${SpacePolicyList}" var="SpacePolicyList">
        <tr>
            <td><img src="${SpacePolicyList.videoBackimg}"></td>
            <td>${SpacePolicyList.browse}</td>
            <td>
                <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="updatePolicyById(${ SpacePolicyList.id})">修改</button>
                <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deletePolicyById(${ SpacePolicyList.id})">删除</button>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script type="text/javascript">
    function updateDetailsById(id){
        window.location.href="/space/spaceDetailDetails?id="+id;
    }
    function deleteDetailsById(id){
        window.location.href="/space/spaceDetailDelete?id="+id;
    }

</script>

<script type="text/javascript">
    function updatePolicyById(id){
        window.location.href="/space/spacePolicyDetails?id="+id;
    }
    function deletePolicyById(id){
        window.location.href="/space/spacePolicyDelete?id="+id;
    }

</script>

<script type="text/javascript" src="/js/wangEditor.js"></script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor1 = new E('#div1', '#div2');
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
                $('#backupField1').val('' + res.data[0]);
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
                $('#backImg').val('' + res.data[0]);
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