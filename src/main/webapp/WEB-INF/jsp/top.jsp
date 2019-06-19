<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>欢迎进入文旅惠后台管理系统</title>
	</head>
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  		<link rel="stylesheet" href="/layui/css/layui.css"  media="all">
  		<script src="/layui/layui.js"></script>
  		<style type="text/css">
  			
  			#title{
  				float: right;
  			}
			#top{
				float:right;
				margin-top: -25px;
				margin-left: 154px;
			}	
			#font_title{
				margin-left: 30px;
				font-size: 30px;
				color: #fff;
			}	
		</style>
	<body style="background: #393D49" >
		<div style="margin-top: 30px">
			<font id="font_title">
				欢迎进入文旅惠后台管理系统
			</font>
		</div>
		<div id="top">
			<font style="color: #f0f0f0">账号：${user.username}</font>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<font style="color: #f0f0f0">日期：</font>
			<div id="linkweb" style=" display:inline; color: #ffffff; margin-right: 20px"></div>
		</div>
		<script>
            setInterval("document.getElementById('linkweb').innerHTML=new Date().toLocaleString()+'   星期'+'日一二三四五六'.charAt(new Date().getDay  ());",1000);
		</script>
		<script>
            function showTime() {
                var now = new Date();
                var nowTime = now.toLocaleString();
                var date = nowTime.substring(0,10);//截取日期
                var time = nowTime.substring(10,20); //截取时间
                var week = now.getDay(); //星期
                var hour = now.getHours(); //小时
                //判断星期几
                var weeks = ["日","一","二","三","四","五","六"];
                var getWeek = "星期" + weeks[week];
                var sc;
                //判断是AM or PM
                if(hour >= 0 && hour < 5){
                    sc = '凌晨';
                }
                else if(hour > 5 && hour <= 7){
                    sc = '早上';
                }
                else if(hour > 7 && hour <= 11){
                    sc = '上午';
                }
                else if(hour > 11 && hour <= 13){
                    sc = '中午';
                }
                else if(hour> 13 && hour <= 18){
                    sc = '下午';
                }
                else if(hour > 18 && hour <= 23){
                    sc = '晚上';
                }
                document.getElementById('time').innerHTML ="当前时间：" + date+" " + getWeek +"&nbsp;"+"   "+sc+"  "+time;
                setTimeout('showTime()',1000);
            }
		</script>
	</body>
	<script>
		layui.use('element', function(){
		  var element = layui.element;
		});
</script>
</html>