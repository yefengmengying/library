package com.myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DB;
import com.model.User;

public class AddUserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取表单提交的数据
		String username = req.getParameter("username");
		int age = Integer.parseInt(req.getParameter("age"));
		String sex = req.getParameter("sex");
		//封装User对象
		User user = new User();
		user.setUsername(username);
		user.setAge(age);
		if("1".equals(sex)){
			user.setSex("男");
		}else{
			user.setSex("女");
		}
		//从userlist中获取最后一个user的id
		//  list的get方法获取指定索引的对象，DB.userlist.size()获取list中共有几个对象
		//获取最后一个user对象DB.userlist.get(DB.userlist.size()-1)
		User lastUser = (User)DB.userlist.get(DB.userlist.size()-1);
		int lastId = lastUser.getUserid();
		//设置新增user对象的id
		int userid = lastId+1;
		user.setUserid(userid);
		//将user添加到userlist
		DB.userlist.add(user);
		
		resp.sendRedirect("index.jsp");
		
		
		
		
		
		
		
		
		
	}

}
