<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
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
</head>
<body>
<div style="margin-top: 10px">
    <font style="color: #000; font-size: 12px; margin-left: 10px">
        ★ 空间列表
    </font>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <table class="layui-table" lay-skin="line" style="text-align: center; overflow: hidden;">
        <tr style="font-weight: bold;">
            <td>空间名</td>
            <td>标题</td>
            <td>地址</td>
            <td>经度</td>
            <td>纬度</td>
            <td>面积</td>
            <td>电话</td>
            <td>创建时间</td>
            <td>操作</td>
        </tr>
            <tr>
                <td>空间名</td>
                <td>标题</td>
                <td>地址</td>
                <td>经度</td>
                <td>纬度</td>
                <td>面积</td>
                <td>电话</td>
                <td>创建时间</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ list.id})">修改/详情
                    </button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ list.id})">删除
                    </button>
                </td>
            </tr>
    </table>
    <div id="test1" style="margin-left: 900px">
    </div>
</div>
<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    var count = "${list.totalElements}";
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
                var href = '/craftsman/list?page=' + obj.curr + '&size=' + obj.limit
                location.href = href;
            }
        });
    });
</script>

<script type="text/javascript">
    function updateById(id) {
        window.location.href = "/craftsman/show?id=" + id;
    }

    function deleteById(id) {
        window.location.href = "/craftsman/delete?id=" + id;
    }
</script>
</body>
</html>