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
        var shopsName = document.getElementById("shopsName").value;
        var shopsSlogan = document.getElementById("shopsSlogan").value;
        var city = document.getElementById("city").value;
        var area = document.getElementById("area").value;
        var addrDetail = document.getElementById("addrDetail").value;
        var longitude = document.getElementById("longitude").value;
        var latitude = document.getElementById("latitude").value;
        if(shopsName == null || shopsName == ""){
            alert("请输入匠人名称!");
            return false;
        }if(shopsSlogan == null || shopsSlogan == ""){
            alert("请输入匠人标语!");
            return false;
        }if(city == null || city == ""){
            alert("请输入匠人所在城市!");
            return false;
        }if(area == null || area == ""){
            alert("请输入匠人所在区/县!");
            return false;
        }if(addrDetail == null || addrDetail == ""){
            alert("请输入匠人详细地址!");
            return false;
        }if(longitude == null || longitude == ""){
            alert("请输入经度!");
            return false;
        }if(latitude == null || latitude == ""){
            alert("请输入纬度!");
            return false;
        }
        $("#shopsDetail").val(editor1.txt.html());
        $("#experience").val(editor2.txt.html());
        $("#form1").submit();
    }
</script>
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
                <input class="form-control" id="shopsName" type="text" name="shopsName" value="${show.shopsName}"
                       placeholder="请输入匠人名称">
            </div>
            <label class="col-sm-1 control-label">匠人标语:</label>
            <div class="col-sm-2">
                <input class="form-control" id="shopsSlogan" type="text" name="shopsSlogan" value="${show.shopsSlogan}"
                       placeholder="请输入匠人标语">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">市:</label>
            <div class="col-sm-2">
                <input class="form-control" id="city" type="text" name="city" value="${show.city}"
                       placeholder="市">
            </div>
            <label class="col-sm-1 control-label">区:</label>
            <div class="col-sm-2">
                <input class="form-control" id="area" type="text" name="area" value="${show.area}"
                       placeholder="区">
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
            <label class="col-sm-1 control-label">手机号:</label>
            <div class="col-sm-2">
                <input class="form-control" id="longitude" type="text" name="longitude" value=""
                       placeholder="请输入手机号">
            </div>
            <label class="col-sm-1 control-label">登陆密码:</label>
            <div class="col-sm-2">
                <input class="form-control" id="latitude" type="text" name="latitude" value=""
                       placeholder="请输入登陆密码">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label" style="margin-top: 30px;">品牌经历:</label>
            <div style="margin-left: 120px">
                <div id="experience1" class="toolbar"></div>
                <div style="padding: 5px 0; color: #ccc"></div>
                <div id="experience2" class="text">
                    <p>${show.experience}</p>
                </div>
                <input type="hidden" id="experience" name="experience">
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
        <div class="layui-upload" style="float: right ; margin-top: -550px; margin-right: 440px">
            <button type="button" class="layui-btn" id="test1">请上传店铺logo</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${show.imgUrl}">
                <input id="imgUrl" name="imgUrl" type="hidden" value="${show.imgUrl}"/>
                <p id="demoText"></p>
            </div>
        </div>
        <div class="layui-upload" style="float: right ; margin-top: -550px; margin-right: 250px">
            <button type="button" class="layui-btn" id="test2">请上传店铺背景图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo2" src="${show.province}">
                <input id="province" name="province" type="hidden" value="${show.province}"/>
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
        <button class="btn btn-primary btn-sm" id="aa" onclick="addProduct(${ show.id})">
            添加商品
            <script type="text/javascript">
                function addProduct(id) {
                    // if(id == null || id == ""){
                    //     alert("请添加完成匠人之后在添加匠人商品！")
                    //     document.getElementById("aa").disabled = true;
                    //     return false;
                    // }
                    window.location.href = "/craftsman/addPro?id=" + id;
                }
            </script>
        </button>
    </div>
    <table class="layui-table" lay-skin="line" style="margin-left: 20px; width: 80%">
        <thead>
        <tr>
            <th>商品名</th>
            <th>商品标价</th>
            <th>商品卖点</th>
            <th>当前售价</th>
            <th>是否上架</th>
            <th>创建时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="productList">
            <tr>
                <td>${productList.productName}</td>
                <td>${productList.price}</td>
                <td>${productList.productPoint}</td>
                <td>${productList.priceDq}</td>
                <td>
                    <c:if test="${productList.status == 1}">上架啦</c:if>
                    <c:if test="${productList.status == 2}">下架啦</c:if>
                </td>
                <td>${productList.createDate}</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="updateById(${ productList.id})">修改</button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ productList.id})">删除</button>
                </td>
            </tr>
        </c:forEach>
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
    function updateById(id) {
        window.location.href = "/craftsman/updatePro?id=" + id;
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