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
        ★ 学校列表
    </font>
    <button class="layui-btn layui-btn-xs layui-btn-warm" style="margin-left: 1100px" onclick="imageAdd()">添加图片</button>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <table class="layui-table" lay-skin="line" id="schoolTable" style="text-align: center;">
        <tr style="font-weight: bold;">
            <td>图片名称</td>
            <td>类型</td>
            <td>上传时间</td>
            <td>描述</td>
            <td>操作</td>
        </tr>
            <tr>
                <td>达萨达</td>
                <td>图片</td>
                <td></td>
                <td>达萨达</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ school.id})">修改
                    </button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ school.id})">删除
                    </button>
                </td>
            </tr>
    </table>

    <div id="test1" style="margin-left: 900px">
    </div>
</div>
<%--<script src="../../../layui/layui.js" charset="utf-8"></script>--%>
<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到$本地，上述js路径需要改成你本地的 -->
<script>
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
                var href = '/school/list?page=' + obj.curr + '&size=' + obj.limit
                location.href = href;
            }
        });
    });
</script>
</body>

<script type="text/javascript">
    function updateById(id) {
        window.location.href = "/school/update?id=" + id;
    }

    function deleteById(id) {
        window.location.href = "/school/delete?id=" + id;
    }

    function imageAdd() {
        window.location.href = "/school/schoolImageAdd";
    }
</script>

</html>