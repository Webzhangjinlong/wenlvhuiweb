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
<div style="margin-top: 5px">
    <font style="color: #000; font-size: 12px; margin-top: 10px">
        ★ 图书列表
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div id="tab1">
    <table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden;">
        <tr style="font-weight: bold;">
            <td>书名</td>
            <td>作者</td>
            <td>出版时间</td>
            <td>图书价格</td>
            <td>推荐数量</td>
            <td>创建时间</td>
            <td>推荐星级</td>
            <td>主页展示</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${bookList.content}" var="bookList">
            <tr>
                <td>${bookList.bookName}</td>
                <td>${bookList.bookAuther}</td>
                <td>${bookList.publishDate}</td>
                <td>${bookList.bookPrice}</td>
                <td>${bookList.recommendedNumber}</td>
                <td>${bookList.createDate}</td>
                <td>★★★</td>

                <td>
                    <c:if test="${bookList.indexShow == 1}">展示</c:if>
                    <c:if test="${bookList.indexShow == 2}">不展示</c:if>
                </td>

                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ bookList.id})">修改</button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ bookList.id})">删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div id="test1" style="margin-left: 900px">
    </div>
</div>
<script type="text/javascript">
    function updateById(id){
        window.location.href="/book/update?id="+id;
    }

    function deleteById(id){
        window.location.href="/book/delete?id="+id;
    }
</script>
<script>
    var count = "${bookList.totalElements}";
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
                var  href ='/book/list?page='+obj.curr+'&size='+obj.limit
                location.href=href;
            }
        });
    });
</script>
</body>

</html>