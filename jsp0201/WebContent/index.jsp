<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.db.*,com.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="query.do">
	<input type="text" name="query">
	<select name="type">
		<option value="1">按姓名</option>
		<option value="2">按年龄</option>
	</select>
	<input type="submit" value="查询">
</form>

<a href="addUser.jsp">新增用户</a>

<table border="1">
	<tr>
		<th>ID</th>
		<th>USERNAME</th>
		<th>AGE</th>
		<th>SEX</th>
		<th>OPRATION</th>
	</tr>
	<%
		for(User u : DB.userlist){
	%>
		<tr>
			<td><%=u.getUserid() %></td>
			<td><%=u.getUsername() %></td>
			<td><%=u.getAge() %></td>
			<td><%=u.getSex() %></td>
			<td>
				<a href="delete.do?userid=<%=u.getUserid() %>">删除</a>
				<a href="update.do?userid=<%=u.getUserid() %>">修改</a>
			</td>
		</tr>
	<%
		}
	%>
</table>







</body>
</html>