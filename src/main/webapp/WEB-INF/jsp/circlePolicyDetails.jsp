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
    table {
        table-layout: fixed;
    }

    th {
        width: 100%;
        word-break: keep-all; /* 不换行 */
        white-space: nowrap; /* 不换行 */
        overflow: hidden; /* 内容超出宽度时隐藏超出部分的内容 */
        text-overflow: ellipsis;
    }

    th:hover {
        overflow: visible;
    }
</style>
<body>
<div style="margin-top: 10px">
    <font style="color: #000; font-size: 14px; margin-left: 10px; font-weight: bold">
        ★ 圈子动态详情
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <div>
        <input type="hidden" name="id" value="">
    </div>
    <div style="margin-left: 22px;">
        <label class="control-label">动态详情</label><br>
    </div>
    <div style="margin-left: 22px; margin-top: 10px">
        <div id="yrjs" class="toolbar"></div>
        <div style="padding: 5px 0; color: #ccc"></div>
        <div id="yrjs1" class="text">
            <p>${byIdPolicy.policyDetail}</p>
        </div>
        <input type="hidden" id="policyDetail" name="policyDetail">
    </div>
    <div style="margin-top: 10px; margin-left: 650px;">
        <button type="button" id="button1" onclick="backCircle(${ byIdPolicy.id})" class="layui-btn layui-btn-sm">返回</button>
        <button type="button" id="button2" onclick="deleteCircle(${ byIdPolicy.id})" class="layui-btn layui-btn-sm">删除</button>
    </div>
    <script type="text/javascript">
        function backCircle(id) {
            window.location.href = "/circle/back?id="+id;
        }

        function deleteCircle(id) {
            window.location.href = "/circle/deletePolicy?id="+id;
        }
    </script>
</div>
<div>
    <div style="margin-left: 20px">
        <p>圈子图片列表</p>
    </div>
    <table class="layui-table" lay-skin="line" style="margin-left: 20px; width: 55%">
        <thead>
        <tr>
            <th>图片</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${byImgType}" var="byImgType">
        <tr>
            <th><img src="${byImgType.imgUrl}" alt="123" style="width: 35px; height: 30px"></th>
            <th>
                <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteImage(${ byImgType.id})">删除</button>
            </th>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <script type="text/javascript" src="/js/wangEditor.js"></script>

    <script type="text/javascript">
        function deleteImage(id){
            window.location.href="/circle/deleteImg?id="+id;
        }
    </script>
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
</div>
</body>
</html>