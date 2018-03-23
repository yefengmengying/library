<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<frameset rows="20%,*">
	<frame src="forward.do?pagename=top.jsp" name="top">
	<frameset cols="20%,*">
		<frame src="forward.do?pagename=left.jsp" name="left">
		<frame src="forward.do?pagename=main.jsp" name="main">
	</frameset>
</frameset>
</html>