<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MovieFlix</title>
</head>

<body>
<jsp:include page="header.jsp"/>
	<div >
	<c:forEach var="movie" items="${movies}">
<a href="/Netflix/api/moviess/${movie.imdbId}">	<img src="${movie.poster}" class="img-rounded" width="224" height="236">	
</a>
	</c:forEach>
	</div>


	<br />
	<br />

	<div class="clear"></div>
	<jsp:include page="footer.jsp"></jsp:include>
	</body></html>