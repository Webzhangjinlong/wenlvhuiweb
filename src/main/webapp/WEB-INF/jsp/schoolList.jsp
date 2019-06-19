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
    <font style="color: #000; font-size: 14px; margin-left: 10px; font-weight: bold">
    ★ 文艺培训列表
    </font>
    <button onclick="schoolAdd()" type="button" class="layui-btn layui-btn-sm layui-btn-normal" style="margin-left: 80%">
        添加培训机构
    </button>
    <script type="text/javascript">
        function schoolAdd() {
            window.location.href="/school/add"
        }
    </script>
    <br>
    <hr style="background: red; height: 2px">
</div>
<div>
    <table class="layui-table" lay-skin="line" id="schoolTable" style="text-align: center;">
        <tr style="font-weight: bold;">
            <td style="width: 12%">机构名称</td>
            <td style="width: 10%">机构类型</td>
            <td style="width: 12%">联系电话</td>
            <td style="width: 8%">市</td>
            <td style="width: 8%">区</td>
            <td style="width: 18%">详细地址</td>
            <td style="width: 15%">创建时间</td>
            <td style="width: 17%">操作</td>
        </tr>

        <c:forEach items="${schoolList.content}" var="school">
            <tr>
                <td>${ school.name}</td>
                <td>
                    <c:if test="${school.schoolType == 16}">唱歌</c:if>
                    <c:if test="${school.schoolType == 17}">书法</c:if>
                    <c:if test="${school.schoolType == 18}">刺绣</c:if>
                    <c:if test="${school.schoolType == 19}">健身</c:if>
                    <c:if test="${school.schoolType == 20}">摄影</c:if>
                    <c:if test="${school.schoolType == 21}">乒乓球</c:if>
                    <c:if test="${school.schoolType == 22}">舞蹈</c:if>
                    <c:if test="${school.schoolType == 23}">剪纸</c:if>
                    <c:if test="${school.schoolType == 24}">乐器</c:if>
                    <c:if test="${school.schoolType == 25}">绘画</c:if>
                    <c:if test="${school.schoolType == 26}">武术</c:if>
                    <c:if test="${school.schoolType == 27}">游泳</c:if>
                </td>
                <td>${ school.phone}</td>
                <td>${ school.city}</td>
                <td>${ school.area}</td>
                <td>${ school.addrDetail}</td>
                <td>${ school.createDate}</td>
                <td>
                    <button class="layui-btn layui-btn-sm layui-btn-warm" onclick="updateById(${ school.id})">修改
                    </button>
                    <button class="layui-btn layui-btn-sm layui-btn-danger" onclick="deleteById(${ school.id})">删除
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div id="test1" style="margin-left: 900px">
    </div>
</div>
<%--<script src="../../../layui/layui.js" charset="utf-8"></script>--%>
<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到$本地，上述js路径需要改成你本地的 -->
<script>
    var count = "${schoolList.totalElements}";
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

</script>

</html>