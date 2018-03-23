<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>注册</title>
<script>
var flag = false;
function validatename(){
	var username = document.getElementById("username").value;
	if(username==""){
		document.getElementById("usernameerror").innerHTML="用户名不能为空";
		return false;
		}
	else{
		document.getElementById("usernameerror").innerHTML="";
		return true;
		}
	}
	function validatesex(){
		var sex = document.getElementsByName("sex");
		var count = 0;
		for(i in sex){
			if(sex[i].checked){
			}
			}
		count++;
		break;	
	}
	if(count == 0){
		document.getElementById("sexerror").innerHTML="性别必须选择";
		return false;
		}
	else{
		document.getElementById("sexerror").innerHTML="";
		return true;
		}
	}
	function validatexxk(){
		var count=0;
		var xxk = document.getElementsByName("xxk");
		for( c in xxk){
			if(xxk[c].checked){
				count++;
				}
			}
		}
	function validate(){
		if(validatename() && validatesex() &&validatexxk()){
			return true;
			console.print("提交成功");
			}
		else{
			return false;
			console.print("提交失败");
			}
		}
	</script>
</head>
<body>
<form onsubmit="return validate()" action="login.do">
姓名：<input type="text" name="username" id="username" onblur="validatename()" /><span id="usernameerror"></span><br />
密码：<input type="password" name="password"><br>
性别：<input type="radio" name="sex" value="男" onchange="validatesex()"/>男
<input type="radio" name="sex" value="女" />女<span id="sexerror"></span><br />
爱好：<input type="checkbox" name="like" value="游泳">游泳
<input type="checkbox" name="like" value="画画">画画
<input type="checkbox" name="like" value="写作">写作
<input type="checkbox" name="like" value="跑步">跑步<br>
籍贯：<select name="jg">
<option value="山东省">山东省</option>
<option value="山西省">山西省</option>
<option value="陕西省">陕西省</option>
<option value="广东省">广东省</option>
</select><br>
   个人简介：<textarea name="info">
   </textarea><br>
   <input type="submit" value="确定提交">
   </form>
</body>
</html>