<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.model.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>ID</th>
		<th>USERNAME</th>
		<th>AGE</th>
		<th>SEX</th>
		<th>OPRATION</th>
	</tr>
	<%
		List<User> rs = (List<User>)session.getAttribute("rs");
		for(User u : rs){
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