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
    <c:forEach items="${beanList}" var="bean">
    	<p><c:out value="${bean.id}"></c:out>:<c:out value="${bean.name}"></c:out></p>
    </c:forEach>
      <form action='<%=request.getContextPath()%>/logout' method='POST'>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="Logout"/>
</form>
</body> 
</html>