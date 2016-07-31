<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="css/style.css" rel="stylesheet" type="text/css" />

<title>Login Page</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include> 
	 
<div id="Content" >

<form method="POST" action="/Netflix/api/users/login">

&nbsp;<center>
<h2><b>Login</b></h2>
<c:if test="${not empty message}">
	${message}
</c:if>
<br> 
<b>Username:</b><br>
<input type="text" name="email" required>
<br>
<br>
<b>Password:</b><br>
<input type="password" name="pwd" required>
<br>
<br>
<button value="select" class="btn btn-success">Submit</button>

							<a href="signup"><input class="btn btn-primary" type="submit"
						value="Signup"></a></li>
</center>
</form>
</div>
</body><br/><br/>
<jsp:include page="footer.jsp"></jsp:include> 
</html>

