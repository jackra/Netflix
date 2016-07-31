<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MovieFlix</title>
<!-- JS Files -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<!-- CSS Files-->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.15.35/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>

<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="/Netflix/api/moviess"><img class="navbar-brand"
				src="images/MovieFlix-logo.gif" alt="MovieFlix"></a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li><a href="#">Browse</a></li>
				<li><a href="#">DVD</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-search"></span>
						Search</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<!-- <li><a><span class="glyphicon glyphicon-user"></span>Welcome
						User</a></li> -->
								<c:if test="${user eq null}">
				<li><a href="index.jsp"><input class="btn btn-success" type="submit"
						value="Login"></a></li>
			</c:if>
			<c:if test="${user ne null}">
			<li><a href="#">Welcome, ${user.firstName}</a></li>
				<li><a href="index.jsp"><input class="btn btn-danger" type="submit"
						value="Logout"></a></li>
						</c:if>
			</ul>
		</div>
	</div>
	</nav>
	</body>
	</html>