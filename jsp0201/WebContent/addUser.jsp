<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
新增用户
<form action="add.do" method="post">
	username:<input type="text" name="username"><br>
	age:<input type="text" name="age"><br>
	sex:<input type="radio" name="sex" value="1" checked="checked">男
		<input type="radio" name="sex" value="0">女
	<input type="submit" value="提交">
</form>











</body>
</html>