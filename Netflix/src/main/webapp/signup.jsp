<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>

<head>
<meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
<title>Food On Time</title>
</head>

<body>

	<jsp:include page="header.jsp"></jsp:include>
<center>
	<div id="Content">
		<h2>USER REGISTERATION</h2>

		<c:if test="${not empty message}">
${message}			
		</c:if>
			<form method="POST" action="createUser">
				<table >

					<tr>
						<td><label for="firstName">FirstName</label></td>
						<td><input type="text" id="firstName" name="firstName"
							required /><br></td>
					</tr>



					<tr>
						<td><label for="lastName">LastName</label></td>
						<td><input type="text" id="lastName" name="lastName"
							required  /><br></td>
					</tr>



					<tr>
						<td><label for="pwd">Password</label></td>
						<td><input type="password" id="pwd" name="pwd"
							 required  /><br></td>
					</tr>


					<tr>
						<td><label>ConfirmPassword</label></td>
						<td><input type="password" id="pwds"
							name="pwds"  required
							 /><br></td>
					</tr>



					<tr>
						<td><label>Email</label></td>
						<td><input type="email" id="email" name="email" required
							value="${emailId}" /><br></td>
					</tr>

<tr><td></td><td><br></td></tr>

					<tr>
						<td colspan="2" style="text-align: center;"><input
							type="submit" value="SUBMIT" class="btn btn-success" /> 
							<a href="index.jsp" class="btn btn-danger"
							>Cancel</a></td>
					</tr>
				</table>
			</form>
		</div></center>
	<div class="spacer">&nbsp;</div>
	<jsp:include page="footer.jsp"></jsp:include>


	<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>

</body>
</html>