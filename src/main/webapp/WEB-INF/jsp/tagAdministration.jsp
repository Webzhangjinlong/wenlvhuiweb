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
    <font style="color: #000; font-size: 12px; margin-left: 10px">
        ★ 活动列表
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div id="tab1">
    <table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden;">
        <tr style="font-weight: bold;">
            <td>标题</td>
            <td>状态</td>
            <td>来源</td>
            <td>浏览量</td>
            <td>活动状态</td>
            <td>创建时间</td>
            <td>文章类型</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${tagList.content}" var="tag">
            <tr style="font-weight: bold;">
                <td>${ tag.title}</td>
                <td>
                    <c:if test="${tag.status==1 }">转发</c:if>
                    <c:if test="${tag.status==2 }">自写</c:if>
                </td>
                <td>${ tag.source}</td>
                <td>${ tag.browse}</td>
                <td>
                    <c:if test="${ tag.giveDefault == 1}">进行中</c:if>
                    <c:if test="${ tag.giveDefault == 2}">已结束</c:if>
                    <c:if test="${ tag.giveDefault == 3}">未开始</c:if>
                </td>
                <td>${tag.createDate}</td>
                <td>
                    <c:if test="${tag.textType == 1}">惠民</c:if>
                    <c:if test="${tag.textType == 2}">演出</c:if>
                    <c:if test="${tag.textType == 3}">亲子</c:if>
                    <c:if test="${tag.textType == 4}">赛事</c:if>
                    <c:if test="${tag.textType == 5}">历史</c:if>
                    <c:if test="${tag.textType == 6}">社区</c:if>
                </td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ tag.id})">修改/详情
                    </button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ tag.id})">删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div id="test1" style="margin-left: 900px">
    </div>
</div>

<script type="text/javascript">
    function deleteById(id) {
        alert("您已成功删除！");
        window.location.href = "/tag/delete?id=" + id;
    }
</script>

<script>
    function updateById(id) {
        window.location.href = "/tag/update?id=" + id;
    }

</script>
<script>
    var count = "${tagList.totalElements}";
    console.log(count)
    layui.use('laypage', function(){
        var laypage = layui.laypage;
        var curr = location.search == "" ? 0 :location.search.split("?page=")[1].split("&")[0];
        //执行一个laypage实例
        laypage.render({
            elem: 'test1', //注意，这里的 test1 是 ID，不用加 # 号
            count:count,
            curr: curr, //获取起始页
            jump: function(obj, first){
                if(first){
                    return
                }
                var  href ='/tag/list?page='+obj.curr+'&size='+obj.limit
                location.href=href;
            }
        });
    });
</script>

</body>

</html>