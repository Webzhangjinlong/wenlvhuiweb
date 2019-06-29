<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>欢迎进入文旅惠后台管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="/layui/layui.js"></script>
</head>
<style type="text/css">
    table {
        table-layout: fixed;
    }

    td {
        width: 100%;
        word-break: keep-all; /* 不换行 */
        white-space: nowrap; /* 不换行 */
        overflow: hidden; /* 内容超出宽度时隐藏超出部分的内容 */
        text-overflow: ellipsis;
    }

    td:hover {
        overflow: visible;
    }

    .box-wrap {
        text-align: center;
        overflow: hidden;
    }

    .box-wrap>div {
        width: 20%;
        height: 22%;
        padding-bottom: 1%;
        margin: 13px;
        border-radius: 10%;
        float: left;
    }

    .layui-upload-img {
        width: 120px;
        height: 100px;
        margin: 0 10px 10px 0;
    }
    p{
        font-weight: bold;
        font-size: 12px;
        color: #5e5e5e;
    }
    #shu{
        width: 0;
        height: 550px;
        border-left: 1px dashed #92B8B1;
        margin-left: 49%;
    }
</style>
<body style="width: 99%">
<div id="shu"></div>
<div style="margin-top: -550px">
<div>
    <p style="font-weight: bold; color: #0C0C0C; font-size: 13px; margin-top: 2px;margin-left: 5px">★ 轮播图管理</p>
    <p style="font-weight: bold; color: #0C0C0C; font-size: 13px; margin-top: -17px;margin-left: 51%">★ 主页功能按钮管理</p>
    <hr style="height: 2px; margin-left: 5px; background: #d9534f; margin-top: 5px">
</div>
<div class="layui-form" style="width: 45%; margin-left: 20px;">
    <table class="layui-table" style="margin-top: 20px">
        <colgroup>
            <col width="20%">
            <col width="60%">
            <col width="20%">
        </colgroup>
        <thead>
        <tr>
            <th>图片</th>
            <th>Url</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                <img src="/images/icon.jpg" width="35px" height="30px">
            </td>
            <td>www.baidu.com</td>
            <td>
                <button type="button" class="layui-btn layui-btn-xs layui-btn-normal" onclick="jump()">修改</button>
                <script type="text/javascript">
                    function jump() {
                        window.location.href="/advertising/indexImage"
                    }
                </script>
            </td>
        </tr>
        <tr>
            <td>
                <img src="/images/icon.jpg" width="35px" height="30px">
            </td>
            <td>www.baidu.com</td>
            <td>
                <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
            </td>
        </tr>
        <tr>
            <td>
                <img src="/images/icon.jpg" width="35px" height="30px">
            </td>
            <td>www.baidu.com</td>
            <td>
                <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
            </td>
        </tr>
        <tr>
            <td>
                <img src="/images/icon.jpg" width="35px" height="30px">
            </td>
            <td>www.baidu.com</td>
            <td>
                <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
            </td>
        </tr>
        <tr>
            <td>
                <img src="/images/icon.jpg" width="35px" height="30px">
            </td>
            <td>www.baidu.com</td>
            <td>
                <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<div style="float: right; width: 50%; margin-top: -26%">
    <div class="box-wrap">
        <div class="box">
            <div class="layui-upload">
                <p style="margin-left: -10px">文艺培训</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo0" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test0" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box">
            <div class="layui-upload">
                <p style="margin-left: -10px">文创非遗</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo1" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test1" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box">
            <div class="layui-upload">
                <p style="margin-left: -10px">地方美食</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo2" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test2" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box">
            <div class="layui-upload">
                <p style="margin-left: -10px">文旅路线</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo3" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test3" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box" style="margin-top: -10px">
            <div class="layui-upload">
                <p style="margin-left: -10px">文旅榜单</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo4" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test4" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box" style="margin-top: -10px">
            <div class="layui-upload">
                <p style="margin-left: -10px">文旅定制</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo5" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test5" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box" style="margin-top: -10px">
            <div class="layui-upload">
                <p style="margin-left: -10px">文旅政策</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo6" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test6" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
        <div class="box" style="margin-top: -10px">
            <div class="layui-upload">
                <p style="margin-left: -10px">好书推荐</p>
                <div class="layui-upload-list">
                    <img class="layui-upload-img" id="demo7" style="margin-top: -10px">
                </div>
                <button type="button" class="layui-btn layui-btn-xs" id="test7" style="margin-top: -18px">修改图片</button>
            </div>
        </div>
    </div>
</div>
<hr style="height: 1px;  margin-left: 5px; background: #92B8B1; margin-top: 0px">
<div>
    <p style="font-weight: bold; color: #0C0C0C; font-size: 13px; margin-top: 0px;margin-left: 5px">★ 推广管理</p>
    <p style="font-weight: bold; color: #0C0C0C; font-size: 13px; margin-top: 0px;margin-left: 51%; margin-top: -17px">★ 圈子头像管理</p>
    <hr style="height: 2px; margin-left: 5px; background: #d9534f; margin-top: 1px">
</div>
<div>
    <div>
        <form class="layui-form" action="">
            <div class="layui-inline">
                <label class="layui-form-label">选择内容</label>
                <div class="layui-input-inline">
                    <select name="modules" lay-verify="required" lay-search="">
                        <option value="">请选择修改内容</option>
                        <option value="1">文艺培训</option>
                        <option value="2">文创非遗</option>
                        <option value="3">地方美食</option>
                        <option value="4">文旅路线</option>
                        <option value="5">文旅定制</option>
                        <option value="6">文旅政策</option>
                        <option value="7">好书推荐</option>
                    </select>
                </div>
            </div>
            <div class="layui-upload" style="margin-top: 30px">
                <button type="button" class="layui-btn layui-btn-xs layui-btn-warm" id="test8" style="margin-top: 10px; margin-left: 40px">选择修改图片</button>
                <div class="layui-upload-list" style="margin-left: 140px; margin-top: -30px">
                    <img class="layui-upload-img" id="demo8" style="margin-top: -30px">
                </div>
            </div>
            <div>
                <button type="submit" class="layui-btn layui-btn-sm" style="margin-left: 280px; margin-top: -50px">确定</button>
            </div>
        </form>
        <div class="layui-upload" style="margin-left: 400px; margin-top: -160px ">
            <p style="margin-left: 30px">最新活动</p>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo11" style="margin-top: -10px">
            </div>
            <button type="button" class="layui-btn layui-btn-xs" id="test11" style="margin-top: -18px;margin-left: 20px">修改图片</button>
        </div>
    </div>
    <div style="float: right; margin-top: -140px">
        <div class="layui-upload" style="margin-right: 300px">
            <p style="margin-left: 30px">我的圈子</p>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo9" style="margin-top: -10px">
            </div>
            <button type="button" class="layui-btn layui-btn-xs" id="test9" style="margin-top: -18px; margin-left: 30px">修改图片</button>
        </div>
    </div>
    <div style="float: right; margin-top: -140px">
        <div class="layui-upload" style="margin-right: 150px">
            <p style="margin-left: 30px">我的关注</p>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo10" style="margin-top: -10px">
            </div>
            <button type="button" class="layui-btn layui-btn-xs" id="test10" style="margin-top: -18px; margin-left: 30px">修改图片</button>
        </div>
    </div>
</div>
    <hr style="height: 1px;  margin-left: 5px; background: #92B8B1; margin-top: 22px">
    <div>
        <p style="font-weight: bold; color: #0C0C0C; font-size: 13px; margin-top: 0px;margin-left: 5px">★ 文艺培训标签管理</p>
        <hr style="height: 2px; margin-left: 5px; background: #d9534f; margin-top: 1px">
    </div>
    <div>
        <div class="layui-form" style="margin-left: 20px">
            <table class="layui-table">
                <thead>
                <tr>
                    <th>图片</th>
                    <th>类型</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>小提琴</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal" onclick="jump1()">添加</button>
                        <script type="text/javascript">
                            function jump1() {
                                window.location.href="/advertising/schoolImage"
                            }
                        </script>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>旱冰</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">添加</button>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>唱歌</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">添加</button>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>跳舞</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">添加</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <hr style="height: 1px;  margin-left: 5px; background: #92B8B1; margin-top: 22px">
    <div>
        <p style="font-weight: bold; color: #0C0C0C; font-size: 13px; margin-top: 0px;margin-left: 5px">★ 文旅路线标签管理</p>
        <hr style="height: 2px; margin-left: 5px; background: #d9534f; margin-top: 1px">
    </div>
    <div>
        <div class="layui-form" style="margin-left: 20px">
            <table class="layui-table">
                <thead>
                <tr>
                    <th>图片</th>
                    <th>名称</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>周末嗨游</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>农家嗨乐</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>人气嗨爆</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="/images/icon.jpg" width="35px" height="30px">
                    </td>
                    <td>野驴路线</td>
                    <td>1989-10-14</td>
                    <td>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-danger">删除</button>
                        <button type="button" class="layui-btn layui-btn-xs layui-btn-normal">修改</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
<script>
    layui.use('upload', function() {
        var $ = layui.jquery
            , upload = layui.upload;

        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test0'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo0').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText0');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test1'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
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
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test2'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo2').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText2');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test3'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo3').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText3');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test4'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo4').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText4');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test5'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo5').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText5');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test6'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo6').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText6');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test7'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo7').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText7');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test8'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo8').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText8');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test9'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo9').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText9');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test10'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo10').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText10');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test11'
            , url: '/upload/'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo11').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (res) {
                //如果上传失败
                if (res.code > 0) {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText11');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
    });
</script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;
    });
</script>
</html>