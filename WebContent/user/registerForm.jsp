<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<style type="text/css">

.errorTip {
	color:red;
}
</style>
<head> 
    <meta charset="UTF-8"> 
    <title>Login</title> 
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/home.css"/> 
</head> 
<body> 
    <div id="login"> 
        <h1>Login</h1>
        <sf:form method="post" modelAttribute="user">
        	编号：<sf:input path="id" placeholder="编号"/>
        	昵称：<sf:input path="name" placeholder="昵称"/><sf:errors path="name" class="errorTip"></sf:errors>
        	密码：<sf:password path="password"/>
        	邮箱：<sf:input path="email" type="email"/>
        	<input type="submit" value="注册">
        </sf:form>
    </div> 
</body> 
</html>