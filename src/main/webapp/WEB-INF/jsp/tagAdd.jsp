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
       var tagName = document.getElementById("tagName").value;
       var tagType = document.getElementById("tagType").value;
       var tagSource = document.getElementById("tagSource").value;
       var tagStatus = document.getElementById("tagStatus").value;
       var tagPeopleNum = document.getElementById("tagPeopleNum").value;
       var tagDefault = document.getElementById("tagDefault").value;
       var tagSign = document.getElementById("tagSign").value;
       var tagPolicyDate = document.getElementById("tagPolicyDate").value;
       var tagAddr = document.getElementById("tagAddr").value;
       var browse = document.getElementById("browse").value;

       if(tagName == "" || tagName == null){
            alert("请输入活动名称!");
           return false;
      }if(tagType == "" || tagType == 0){
           alert("请选择活动种类!")
           return false;
       }if(tagSource == "" || tagSource == null){
           alert("请输入活动来源!")
           return false;
       }if(tagStatus == "" || tagStatus == 0){
           alert("请选择创建类型!")
           return false;
       }if(tagPeopleNum == "" || tagPeopleNum == null){
           alert("请输入活动人数!")
           return false;
       }if(tagDefault == "" || tagDefault == 0){
           alert("请选择活动状态!")
           return false;
       }if(tagSign == "" || tagSign == null){
           alert("请输入报名时间!")
           return false;
       }if(tagPolicyDate == "" || tagPolicyDate == null){
           alert("请输入活动开始时间!")
           return false;
       }if(tagAddr == "" || tagAddr == null){
           alert("请输入活动详细地址!")
           return false;
       }if(browse == "" || browse == null){
           alert("请输入活动浏览量!")
           return false;
       }
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
    <form class="form-horizontal" id="form1" role="form" action="/tag/tagAddById" method="post">
        <div>
            <input type="hidden" name="id" value="${tagupdate.id}">
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">活动名称:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagName" type="text" name="title" value="${tagupdate.title}"
                       placeholder="请输入活动名称">
            </div>
            <label class="col-sm-1 control-label">活动类别:</label>
            <div class="col-sm-2">
                <select id="tagType" name="textType" value="${tagupdate.textType}" class="form-control">
                    <c:if test="${tagupdate.textType == 1}">
                        <option name="textType" value="1">惠民</option>
                    </c:if>
                    <c:if test="${tagupdate.textType == 2}">
                        <option name="textType" value="1">演出</option>
                    </c:if>
                    <c:if test="${tagupdate.textType == 3}">
                        <option name="textType" value="3">社区</option>
                    </c:if>
                    <c:if test="${tagupdate.textType == 4}">
                        <option name="textType" value="5">亲子</option>
                    </c:if>
                    <c:if test="${tagupdate.textType == 5}">
                        <option name="textType" value="1">历史</option>
                    </c:if>
                    <option value="0" name="textType">--请选择--</option>
                    <option value="1" name="textType">惠民</option>
                    <option value="2" name="textType">演出</option>
                    <option value="3" name="textType">亲子</option>
                    <option value="4" name="textType">历史</option>
                    <option value="5" name="textType">社区</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">活动来源:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagSource" type="text" name="source" value="${tagupdate.source}"
                       placeholder="请输入活动来源">
            </div>
            <label class="col-sm-1 control-label">创建类型:</label>
            <div class="col-sm-2">
                <select name="status" id="tagStatus" value="${tagupdate.status}" class="form-control">
                    <c:if test="${tagupdate.status == 1}">
                        <option value="1" name="status">转发</option>
                    </c:if>
                    <c:if test="${tagupdate.status == 2}">
                        <option value="2" name="status">自写</option>
                    </c:if>
                    <option value="0" name="status">--请选择--</option>
                    <option value="1" name="status">转发</option>
                    <option value="2" name="status">自写</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">参与人数:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagPeopleNum" name="peopleNum" type="text"
                       value="${ tagupdate.peopleNum}" placeholder="请输入参与人数">
            </div>
            <label class="col-sm-1 control-label">活动状态:</label>
            <div class="col-sm-2">
                <select name="giveDefault" id="tagDefault" value="${tagupdate.giveDefault}" class="form-control">
                    <c:if test="${tagupdate.giveDefault == 1}">
                        <option value="1" name="giveDefault">进行中</option>
                    </c:if>
                    <c:if test="${tagupdate.giveDefault == 2}">
                        <option value="2" name="giveDefault">已结束</option>
                    </c:if>
                    <c:if test="${tagupdate.giveDefault == 3}">
                        <option value="3" name="giveDefault">未开始</option>
                    </c:if>
                    <option value="0" name="giveDefault">--请选择--</option>
                    <option value="1" name="giveDefault">进行中</option>
                    <option value="2" name="giveDefault">已结束</option>
                    <option value="3" name="giveDefault">未开始</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">报名时间:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagSign" type="text" name="signDate" value="${tagupdate.signDate}"
                       placeholder="年-月-日">
            </div>
            <label class="col-sm-1 control-label">活动时间:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagPolicyDate" type="text" name="policyDate"
                       value="${tagupdate.policyDate}" placeholder="年-月-日">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">详细地址:</label>
            <div class="col-sm-2">
                <input class="form-control" id="tagAddr" type="text" name="policyAddr"
                       value="${tagupdate.policyAddr}" placeholder="请输入详细地址">
            </div>
            <label class="col-sm-1 control-label">浏览量:</label>
            <div class="col-sm-2">
                <input class="form-control" id="browse" type="text" name="browse"
                       value="${tagupdate.browse}" placeholder="请输入浏览量">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">经度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="longitude" type="text" name="longitude"
                       value="${tagupdate.longitude}" placeholder="请输入经度">
            </div>
            <label class="col-sm-1 control-label">纬度:</label>
            <div class="col-sm-2">
                <input class="form-control" id="latitude" type="text" name="latitude"
                       value="${tagupdate.latitude}" placeholder="请输入浏览量">
            </div>
            <div class="col-sm-2">
                <a href="https://lbs.amap.com/console/show/picker"
                   class="form-control">♡&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点我查看经纬度</a>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">视频描述:</label>
            <div class="col-sm-2">
                <input class="form-control" id="detailsContent" type="text" name="detailsContent" value="${tagupdate.detailsContent}"
                       placeholder="请输入视频描述">
            </div>
            <label class="col-sm-1 control-label">活动电话:</label>
            <div class="col-sm-2">
                <input class="form-control" id="phone" type="text" name="phone"
                       value="${tagupdate.phone}" placeholder="请输入活动电话">
            </div>
        </div>
        <div class="layui-upload" style="margin-left: 20px;margin-top: 20px">
            <button type="button" class="layui-btn layui-btn-normal" id="test8">选择活动视频</button>
            <input type="hidden" id="videourl" name="videourl" value="${tagupdate.videourl}" >
            <button type="button" class="layui-btn" id="test9">开始上传</button>
            <p id="p1" class="layui-btn layui-btn-warm layui-btn-radius" style="margin-top: 11px">${tagupdate.videourl}</p>
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">活动奖品（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="jiangp" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="jiangp1" class="text">
                <p>${tagupdate.prize}</p>
            </div>
            <input type="hidden" id="prize" name="prize">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">活动规则（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="hdgz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="hdgz1" class="text">
                <p>${tagupdate.policyRule}</p>
            </div>
            <input type="hidden" id="policyRule" name="policyRule">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">获奖规则（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="hjgz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="hjgz1" class="text">
                <p>${tagupdate.awardRules}</p>
            </div>
            <input type="hidden" id="awardRules" name="awardRules">
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">活动宗旨（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="hdzz" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="hdzz1" class="text">
                <p>${tagupdate.policyPurpose}</p>
            </div>
            <input type="hidden" id="policyPurpose" name="policyPurpose">
        </div>
        <div class="layui-upload" style="float: right; margin-right: 500px; margin-top: -1090px">
            <button type="button" class="layui-btn" id="test1">上传活动封面图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo1" src="${tagupdate.image}">
            </div>
            <input id="image" name="image" value="${tagupdate.image}" type="hidden"/>
            <p id="demoText"></p>
        </div>
        <div class="layui-upload" style="float: right; margin-right: 300px; margin-top: -1090px">
            <button type="button" class="layui-btn" id="test2">上传视频封面图</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" id="demo2" src="${tagupdate.videoBackurl}">
            </div>
            <input id="videoBackurl" name="videoBackurl" value="${tagupdate.videoBackurl}" type="hidden"/>
            <p id="demoText1"></p>
        </div>
        <div style="margin-left: 22px;">
            <label class="control-label">活动内容详情（必填）:</label><br>
        </div>
        <div style="margin-left: 22px; margin-top: 10px">
            <div id="div1" class="toolbar"></div>
            <div style="padding: 5px 0; color: #ccc"></div>
            <div id="div2" class="text">
                <p>${tagupdate.cotent}</p>
            </div>
            <input type="hidden" id="cotent" name="cotent">
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