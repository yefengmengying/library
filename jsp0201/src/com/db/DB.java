package com.db;

import java.util.ArrayList;
import java.util.List;

import com.model.User;

/*
 * 模拟数据库存储数据
 */
public class DB {
	//通过静态userlsit模拟user表
	public static List<User> userlist = new ArrayList();
	//通过静态初始化块，对userlist进行初始化
	static{
		userlist.add(new User(1001,"scott1",35,"男"));
		userlist.add(new User(1002,"scott2",36,"男"));
		userlist.add(new User(1003,"scott3",37,"男"));
		userlist.add(new User(1004,"scott4",38,"男"));
		userlist.add(new User(1005,"scott5",39,"男"));
		userlist.add(new User(1006,"scott6",33,"男"));
	}
	
	
	
	
	
	
}
