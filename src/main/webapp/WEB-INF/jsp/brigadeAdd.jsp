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
        ★ 添加活动
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <form class="form-horizontal" id="form1" role="form" action="/WenBrigade/WenBrigadeUpdate" method="post">
        <div>
            <input type="hidden" name="id" value="${ymWenBrigade.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">路线名称:</label>
            <div class="col-sm-2">
                <input class="form-control" id="name" type="text" name="name" value="${ymWenBrigade.name}"
                       placeholder="请输入路线名称">
            </div>
            <label class="col-sm-1 control-label">路线类型:</label>
            <div class="col-sm-2">
                <select id="type" name="type" value="${ymWenBrigade.type}" class="form-control">

                    <c:if test="${ymWenBrigade.type == 1}">
                        <option value="1" name="type">周末嗨游</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.type == 2}">
                        <option value="2" name="type">农家嗨乐</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.type == 3}">
                        <option value="3" name="type">人气嗨爆</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.type == 4}">
                        <option value="4" name="type">野驴路线</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.type == 5}">
                        <option value="5" name="type">研学游</option>
                    </c:if>

                    <option value="0" name="type">--请选择--</option>
                    <option value="1" name="type">周末嗨游</option>
                    <option value="2" name="type">农家嗨乐</option>
                    <option value="3" name="type">人气嗨爆</option>
                    <option value="4" name="type">野驴路线</option>
                    <option value="5" name="type">研学游</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">儿童票价:</label>
            <div class="col-sm-2">
                <input class="form-control" id="children" type="text" name="children" value="${ymWenBrigade.children}"
                       placeholder="请输入儿童票价">
            </div>
            <label class="col-sm-1 control-label">成人票价:</label>
            <div class="col-sm-2">
                <input class="form-control" id="adult" type="text" name="adult" value="${ymWenBrigade.adult}"
                       placeholder="请输入成人票价">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">套餐票价:</label>
            <div class="col-sm-2">
                <input class="form-control" id="setMeal" name="setMeal" type="text"
                       value="${ymWenBrigade.setMeal}" placeholder="请输入套票价">
            </div>
            <label class="col-sm-1 control-label">浏览数:</label>
            <div class="col-sm-2">
                <input class="form-control" id="browse" name="browse" type="text"
                       value="${ymWenBrigade.browse}" placeholder="请输入浏览数">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">推荐指数:</label>
            <div class="col-sm-2">
                <select  class="form-control" id="recommend" name="recommend" value="${ymWenBrigade.recommend}">

                    <c:if test="${ymWenBrigade.recommend == 1}">
                        <option value="1" name="recommend">★</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.recommend == 2}">
                        <option value="2" name="recommend">★★</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.recommend == 3}">
                        <option value="3" name="recommend">★★★</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.recommend == 4}">
                        <option value="4" name="recommend">★★★★</option>
                    </c:if>
                    <c:if test="${ymWenBrigade.recommend == 5}">
                        <option value="5" name="recommend">★★★★★</option>
                    </c:if>

                <option value="0" name="recommend">--请选择--</option>
                <option value="1" name="recommend">★</option>
                <option value="2" name="recommend">★★</option>
                <option value="3" name="recommend">★★★</option>
                <option value="4" name="recommend">★★★★</option>
                <option value="5" name="recommend">★★★★★</option>
                </select>
            </div>
            <%--<label class="col-sm-1 control-label">预留人名:</label>--%>
            <%--<div class="col-sm-2">--%>
                <%--<input class="form-control" id="tagPeopleNum" name="peopleNum" type="text"--%>
                       <%--value="${ymWenBrigade.sex == 2}" placeholder="请输入预留人名">--%>
            <%--</div>--%>
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">成人票价描述（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="jiangp" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="jiangp1" class="text">
                <p>${ymWenBrigade.adultDescribe}</p>
            </div>
            <input type="hidden" id="adultDescribe" name="adultDescribe">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">儿童票价描述（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="hdgz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="hdgz1" class="text">
                <p>${ymWenBrigade.childrenDescribe}</p>
            </div>
            <input type="hidden" id="childrenDescribe" name="childrenDescribe">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">套票价描述（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="hjgz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="hjgz1" class="text">
                <p>${ymWenBrigade.mealDescribe}</p>
            </div>
            <input type="hidden" id="mealDescribe" name="mealDescribe">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">行程安排（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="hdzz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="hdzz1" class="text">
                <p>${ymWenBrigade.tripArrange}</p>
            </div>
            <input type="hidden" id="tripArrange" name="tripArrange">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">费用须知（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="fyxz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="fyxz1" class="text">
                <p>${ymWenBrigade.feeNotice}</p>
            </div>
            <input type="hidden" id="feeNotice" name="feeNotice">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">安全提示（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="aqts" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="aqts1" class="text">
                <p>${ymWenBrigade.securityTip}</p>
            </div>
            <input type="hidden" id="securityTip" name="securityTip">
        </div>
        <div class="layui-upload" style="float: right; margin-right: 500px; margin-top: -1230px">
            <button type="button" class="layui-btn" id="test1">上传路线封面图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${ymWenBrigade.img}">
            </div>
            <input id="image" name="img" value="${ymWenBrigade.img}" type="hidden"/>
            <p id="demoText"></p>
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
    var editor2 = new E('#jiangp', '#jiangp1');
    editor2.create();
</script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor3 = new E('#hdgz', '#hdgz1');
    editor3.create();
</script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor4 = new E('#hjgz', '#hjgz1');
    editor4.create();
</script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor5 = new E('#hdzz', '#hdzz1');
    editor5.create();
</script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor5 = new E('#fyxz', '#fyxz1');
    editor5.create();
</script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor5 = new E('#aqts', '#aqts1');
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
                $('#videoBackurl').val('' + res.data[0]);
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
        //选完文件后不自动上传
        upload.render({
            elem: '#test8'
            ,url: '/uploadflv/upload'
            ,accept: 'video'
            ,auto:false
            //,multiple: true
            ,bindAction: '#test9'
            ,done: function(res){
                console.log(res.data[0])
                if(res.code > 0){
                    return layer.msg('上传失败！')
                }
                $("#videourl").val('' + res.data[0]);
                $("#p1").text('' + res.data[0])
                return layer.msg('上传成功！')
            }
        });
    });
</script>
</html>