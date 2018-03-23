<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.myservlet.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册信息页面</title>
</head>
<body>
<span>恭喜你已经注册成功 你的注册信息如下</span><br>
姓名：${user.username}<br>
密码：${user.password}<br>
性别：${user.sex }<br>
爱好：${user.like[0] }  
	${user.like[1] } 
	${user.like[2] } 
	${user.like[3] } 
<br>
籍贯：${user.jg }<br>
个人简介：${user.info }<br>

</body>
</html>