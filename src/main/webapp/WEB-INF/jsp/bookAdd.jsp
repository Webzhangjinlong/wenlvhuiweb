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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>
</head>
<style type="text/css">
    .toolbar {
        border: 1px solid #ccc;
        width: 730px;
    }

    .text1 {
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
        $("#bookDetail").val(editor1.txt.html());
        $("#form1").submit();
    }
</script>
<div style="margin-top: 5px">
    <font style="color: #000; font-size: 12px; margin-left: 10px">
        ★ 添加图书
    </font>
    <br>
    <hr style="background: red; height: 2px; margin-top: 5px">
</div>
<div>
    <form class="layui-form" role="form" action="/book/addUpdate" id="form1">
        <div>
            <input type="hidden" name="id" value="${ymBook.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">图书名称:</label>
            <div class="col-sm-2">
                <input class="form-control" id="bookName" type="text" name="bookName" value="${ymBook.bookName}" placeholder="请输入图书名称">
            </div>
            <label class="col-sm-1 control-label">图书作者:</label>
            <div class="col-sm-2">
                <input class="form-control" id="bookAuther" type="text" name="bookAuther" value="${ymBook.bookAuther}"
                       placeholder="请输入图书作者">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">创作时间:</label>
            <div class="col-sm-2">
                <input class="form-control" id="publishDate" type="text" name="publishDate" value="${ymBook.publishDate}" placeholder="请输入创作时间">
            </div>
            <label class="col-sm-1 control-label">推荐人:</label>
            <div class="col-sm-2">
                <select class="selectpicker show-tick form-control"   name="recommendUser"   data-live-search="true">
                    <option  value="-1">请选择</option>
                    <c:forEach items="${user}" var="user" >
                        <option value="${user.id}">${user.username}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">图书价格:</label>
            <div class="col-sm-2">
                <input class="form-control" id="bookPrice" type="text" name="bookPrice" value="${ymBook.bookPrice}" placeholder="请输入图书价格">
            </div>
            <label class="col-sm-1 control-label">推荐数量:</label>
            <div class="col-sm-2">
                <input class="form-control" id="recommendedNumber" type="text" name="recommendedNumber" value="${ymBook.recommendedNumber}" placeholder="请输入推荐数量">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">性别爱好:</label>
            <div class="col-sm-2">
                <select class="form-control" id="sex" name="sex" value="${ymBook.sex}">

                    <c:if test="${ymBook.sex == 1}">
                        <option value="1" name="sex">男</option>
                    </c:if>
                    <c:if test="${ymBook.sex == 2}">
                        <option value="2" name="sex">女</option>
                    </c:if>
                    <c:if test="${ymBook.sex == 3}">
                        <option value="2" name="sex">通用</option>
                    </c:if>

                    <option value="0" name="sex">--请选择--</option>
                    <option value="1" name="sex">男</option>
                    <option value="2" name="sex">女</option>
                    <option value="3" name="sex">通用</option>
                </select>
            </div>
            <label class="col-sm-1 control-label">大众爱好:</label>
            <div class="col-sm-2">
                <select class="form-control" id="bookTag" name="bookTag" value="${ymBook.bookTag}">

                    <c:if test="${ymBook.bookTag == 1}">
                        <option value="1" name="bookTag">最新</option>
                    </c:if>
                    <c:if test="${ymBook.bookTag == 2}">
                        <option value="2" name="bookTag">最热</option>
                    </c:if>
                    <c:if test="${ymBook.bookTag == 3}">
                        <option value="2" name="bookTag">国外</option>
                    </c:if>

                    <option value="0" name="bookTag">--请选择--</option>
                    <option value="1" name="bookTag">最新</option>
                    <option value="2" name="bookTag">最热</option>
                    <option value="3" name="bookTag">国外</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">主页展示:</label>
            <div class="col-sm-2">
                <select class="form-control" id="indexShow" name="indexShow" value="${ymBook.indexShow}">

                    <c:if test="${ymBook.indexShow == 1}">
                        <option value="1" name="indexShow">展示</option>
                    </c:if>
                    <c:if test="${ymBook.indexShow == 2}">
                        <option value="2" name="indexShow">不展示</option>
                    </c:if>

                    <option value="0" name="indexShow">--请选择--</option>
                    <option value="1" name="indexShow">展示</option>
                    <option value="2" name="indexShow">不展示</option>
                </select>
            </div>
            <label class="col-sm-1 control-label">推荐星级:</label>
            <div class="col-sm-2">
                <select class="form-control" id="recommendClass" name="recommendClass" value="${ymBook.recommendClass}">

                    <c:if test="${ymBook.recommendClass == 1}">
                        <option value="1" name="recommendClass">★</option>
                    </c:if>
                    <c:if test="${ymBook.recommendClass == 2}">
                        <option value="2" name="recommendClass">★★</option>
                    </c:if>
                    <c:if test="${ymBook.recommendClass == 3}">
                        <option value="1" name="recommendClass">★★★</option>
                    </c:if>
                    <c:if test="${ymBook.recommendClass == 4}">
                        <option value="2" name="recommendClass">★★★★</option>
                    </c:if>
                    <c:if test="${ymBook.recommendClass == 5}">
                        <option value="2" name="recommendClass">★★★★★</option>
                    </c:if>

                    <option value="0" name="recommendClass">--请选择--</option>
                    <option value="1" name="recommendClass">★</option>
                    <option value="2" name="recommendClass">★★</option>
                    <option value="3" name="recommendClass">★★★</option>
                    <option value="3" name="recommendClass">★★★★</option>
                    <option value="3" name="recommendClass">★★★★★</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">文章类型(最少选择一个!):</label>
            <div class="col-sm-5">
                <label class="checkbox-inline">
                    <input type="checkbox"  name="book_tag" id="inlineCheckbox1" value="36"> 小说
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox2" value="37"> 历史
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox3" value="38"> 周刊
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox4" value="39"> 科学
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox5" value="40"> 教材
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox6" value="41"> 儿童
                </label>
                <br>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox7" value="42"> 社会
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox8" value="43"> 法律
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox9" value="44"> 艺术
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox10" value="45"> 传记
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox11" value="46"> 经济
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="book_tag" id="inlineCheckbox12" value="47"> 生活
                </label>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">所在书馆:</label>
            <div class="col-sm-5">
                <input class="form-control" id="libraryAddress" type="text" name="libraryAddress" value="${ymBook.libraryAddress}" placeholder="图书馆多个请以，号分隔">
            </div>
        </div>


        <div class="layui-upload" style="float: right; margin-right: 400px; margin-top: -300px">
            <button type="button" class="layui-btn" id="test1">上传图书封面图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${ymBook.imgUrl}">
            </div>
            <input id="imgUrl" name="imgUrl" type="hidden" value="${ymBook.imgUrl}"/>
            <p id="demoText"></p>
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">图书详情（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="div1" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="div2" class="text1">
                <p>${ymBook.bookDetail}</p>
            </div>
            <input type="hidden" id="bookDetail" name="bookDetail">
        </div>
        <div style="margin-top: 10px; margin-left: 650px;">
            <button type="button" id="button" class="layui-btn layui-btn-sm" onclick="chan()">确定添加/修改</button>
        </div>
    </form>
</div>
<script type="text/javascript" src="/js/wangEditor.js"></script>
<script type="text/javascript">
    var E = window.wangEditor;
    var editor1 = new E('#div1', '#div2');
    editor1.create();
</script>
</body>
<script>
    layui.use('upload', function () {
        var $ = layui.jquery
            , upload = layui.upload;
        $("#div01").show()
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
</html>