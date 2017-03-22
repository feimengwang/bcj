<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
	<form:form method="POST" commandName="user" action="./login">
		
			<table>
			<thead>
			<tr><th colspan=2>用户登录</th></tr>
			</thead>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="name"><form:errors path="name" /></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password"><form:errors path="password" /></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td>男<input type="radio" name="sex" value="m" checked="checked">女<input type="radio" name="sex" value="f"></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><input type="text" name="email"><form:errors path="email" /></td>
				</tr>
				<tr>
					<td>电话:</td>
					<td><input type="text" name="telephone"></td>
				</tr>
				<tr>
					<td><input type="reset" value="重置"></td>
					<td><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>