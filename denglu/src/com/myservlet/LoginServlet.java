package com.myservlet;

import com.po.User;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		String[] like = req.getParameterValues("like");
		String jg = req.getParameter("jg");
		String info = req.getParameter("info");
		User user = new User();	
		user.setInfo(info);
		user.setJg(jg);
		user.setLike(like);
		user.setPassword(password);
		user.setSex(sex);
		user.setUsername(username);
		req.getSession().setAttribute("user", user);
		resp.sendRedirect("success.jsp");
	}

}
