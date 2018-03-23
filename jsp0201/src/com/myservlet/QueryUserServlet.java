package com.myservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DB;
import com.model.User;

public class QueryUserServlet extends HttpServlet {
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = request.getParameter("query");
		String type = request.getParameter("type");
		//用来封装查询结果
		List<User> rs = new ArrayList();
		//判断查询类型，按名字
		if("1".equals(type)){
			//遍历userlist
			for(User u : DB.userlist){
				//检索username是否包含query
				if(u.getUsername().indexOf(query)!=-1){
					//将user对象放入结果rs
					rs.add(u);
				}
			}
		}else{
			//按照年龄查询
			//遍历userlist
			for(User u : DB.userlist){
				//检索age是否等于query
				if(u.getAge()==Integer.parseInt(query)){
					//将user对象放入结果rs
					rs.add(u);
				}
			}
		}
		
		request.getSession().setAttribute("rs", rs);
		response.sendRedirect("rs.jsp");
		
		
		
		
		
		
		
		
	}

}
