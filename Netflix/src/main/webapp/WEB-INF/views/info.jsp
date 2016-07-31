<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.15.35/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MovieFlix</title>
</head>
<body><jsp:include page="header.jsp" />
<div id="Content1">
		<h2>${movie.title}</h2>
		<img src="${movie.poster}" class="img-rounded" width="224"
							height="236">
			<form method="POST" action="create">
			<div class="item_desc">
				<table style="background-color: #F6F6EE;">
					
					<tr>
						<td style="width: 50%;"><label for="genre">Genre</label></td>
						<td>${movie.genre} </td>

					</tr>

					<tr>
						<td><label for="released">Release date</label></td>
						<td>${movie.released}</td>
					</tr>

					<tr>
						<td><label for="plot">Plot</label></td>
						<td>${movie.plot}</td>
					</tr>
					<tr>
						<td><label>Awards</label></td>
						<td>${movie.awards} </td>
					</tr>
<c:if test="${!cmts.isEmpty()}">
					<tr>
						<td><label>Comments</label></td>
						<td>
						<c:forEach var="cmt" items="${cmts}">
					${cmt.name}<br/>
										</c:forEach></td>
					</tr></c:if>
					<tr>
						<td><label>New Comment</label></td>
						<td><textarea rows="4" cols="29" name="name" ></textarea></td>

					</tr></td></tr>
				</table>
				<input type="hidden" name="movieid" id="movieid"
					value="${movie.imdbId}"> <input class="btn btn-success"
					type="submit" value="Add Comment" id="showTextArea" />

</div>

			</form>

			<a href="/Netflix/api/moviess">Back to Home page</a>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>