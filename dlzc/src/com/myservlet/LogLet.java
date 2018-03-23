package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myservlet.Service;
import com.mysql.jdbc.Statement;

public class LogLet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	  // 接收客户端信息       
    	String username = request.getParameter("username");
        username = new String(username.getBytes("ISO-8859-1"), "UTF-8");
        String pass = request.getParameter("password");
        System.out.println(username + "--" + pass);
        //response.sendRedirect("Success.jsp");
        String driverClass="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://47.93.22.3:3301/student"; 
        String user="root";
        String passwordsql="123456";
        Connection conn;
        try{
        Class.forName(driverClass);
        conn=DriverManager.getConnection(url,user,passwordsql);
        java.sql.Statement stmt=conn.createStatement();
        String sql="select name,id from test";
        ResultSet rs=stmt.executeQuery(sql);
        String id = null;
        String name = null;
        while(rs.next()){
        	name = rs.getString("name");
        	id = rs.getString("id");
        	System.out.println(id);
        	System.out.println(name);
        	//response.sendRedirect("Success.jsp");
        	if(name.equals(username) && id.equals(pass)) {
        		response.sendRedirect("Success.jsp");
    			//rs.close();
    			//conn.close();
    			//return;
    		}
    	}
        }
    	/*rs.close();
    	conn.close();
    	System.out.println("用户名或密码错误！");
    }  catch (ClassNotFoundException e) {
    	System.out.println("Sorry,can`t find the Driver!");
    	e.printStackTrace();
    } catch (SQLException e) {
    	e.printStackTrace();
    } catch (Exception e) {
    	e.printStackTrace();
    }*/
        catch(Exception ex){
            ex.printStackTrace();
    }
}
}