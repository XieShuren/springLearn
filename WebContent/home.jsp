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
        <form method="post"> 
            <input type="text" required="required" placeholder="用户名" name="u"></input> 
            <input type="password" required="required" placeholder="密码" name="p"></input> 
            <button class="but" type="submit">登录</button> 
        </form> 
    </div> 
</body> 
</html>