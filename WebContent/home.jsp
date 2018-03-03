<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
    <meta charset="UTF-8"> 
    <title>Login</title> 
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/home.css"/> 
</head> 


<body> 
    <div id="login"> 
        <h1>Login</h1> 
       <form name='f' action='<%=request.getContextPath()%>/login' method='POST'>
	<table>
		<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>
		<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
		<tr><td>Remember me:</td><td><input type="checkbox" id="remember_me" name="remember-me"/></td></tr>
		<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</table>
</form>
    </div> 
</body> 
</html>