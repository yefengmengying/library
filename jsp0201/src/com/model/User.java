package com.model;

public class User {
	private int userid;
	private String username;
	private int age;
	private String sex;
	
	public User(){
		
	}
	
	public User(int userid,String username,int age,String sex){
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.sex = sex;
	}
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
