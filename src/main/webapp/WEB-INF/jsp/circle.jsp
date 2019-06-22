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
</style>
<body>
<div style="margin-top: 10px">
    <font style="color: #000; font-size: 14px; margin-left: 10px; font-weight: bold">
        ★ 圈子列表
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div id="tab1">
    <table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden;">
        <tr style="font-weight: bold;">
            <td>圈子名称</td>
            <td>圈子类型</td>
            <td>圈子头像</td>
            <td>圈子背景</td>
            <td>浏览量</td>
            <td>管理员</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${YmCircleList.content}" var="YmCircleList">
            <tr style="font-weight: bold;">
                <td>${YmCircleList.createUser}</td>
                <td>
                    <c:if test="${YmCircleList.dictionaryId == 1}">绘画</c:if>
                    <c:if test="${YmCircleList.dictionaryId == 2}">刺绣</c:if>
                </td>
                <td><img src="${YmCircleList.imgUrl}" style="width: 35px; height: 30px;"></td>
                <td><img src="${YmCircleList.backgroundUrl}" style="width: 35px; height: 30px;"></td>
                <td>${YmCircleList.browse}</td>
                <td>zhangfei</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-warm" onclick="circleTetail(${ YmCircleList.id})">详情
                    </button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteCircle(${ YmCircleList.id})">删除
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div id="test1" style="margin-left: 900px">
    </div>
</div>


<script type="text/javascript">
    function deleteCircle(id) {
        alert("您已成功删除！");
        window.location.href = "/circle/delete?id=" + id;
    }
</script>

<script>
    function circleTetail(id) {
        window.location.href = "/circle/details?id=" + id;
    }

</script>

<script>
    var count = "${YmCircleList.totalElements}";
    console.log(count)
    layui.use('laypage', function () {
        var laypage = layui.laypage;
        var curr = location.search == "" ? 0 : location.search.split("?page=")[1].split("&")[0];
        //执行一个laypage实例
        laypage.render({
            elem: 'test1', //注意，这里的 test1 是 ID，不用加 # 号
            count: count,
            curr: curr, //获取起始页
            jump: function (obj, first) {
                if (first) {
                    return
                }
                var href = '/circle/list?page=' + obj.curr + '&size=' + obj.limit
                location.href = href;
            }
        });
    });
</script>

</body>

</html>