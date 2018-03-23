package com.myservlet;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DB;
import com.model.User;

public class DeleteUserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取超链接传递的userid，转型为int
		int userid = Integer.parseInt(req.getParameter("userid"));
		
		//从userlist中删除对应userid的对象
		/*for(User u : DB.userlist){
			if(u.getUserid()==userid){
				
				 * remove方法有两个
				 * 参数为int值remove(1)按照list索引删除对象
				 * 参数为Object，remove(u)按照如果与集合中的对象是同一个就删除
				 * 如何判断是否同一个对象：
				 * 1、按照hashcode判断
				 * 2、重写equals方法
				 
				DB.userlist.remove(u);
			}
		}*/
		//获取迭代器
		Iterator<User> it = DB.userlist.iterator();
		//it.hasNext判断是否有下一个元素
		while(it.hasNext()){
			//it.next取出元素
			User u = it.next();
			if(u.getUserid()==userid){
				//it.remove将当前正在迭代的对象删除
				it.remove();
				break;//结束while
			}
		}
		
		resp.sendRedirect("index.jsp");
		
		
		
		
	}

}
