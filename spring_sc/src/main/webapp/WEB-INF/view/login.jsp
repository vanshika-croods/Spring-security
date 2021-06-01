<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

	<form action="/login" method="POST">
		<div>
			<label for="username">UserName:</label> <input type="text"
				name="userName" />
		</div>
		<div>
			<label for="password">Password:</label> <input type="password"
				name="password" />
		</div>
		<div>
			<input type="submit" value="Sign In" />
		</div>
		<c:if test="${param.error ne null}">
			<div class="alert-danger">Invalid username and password.</div>
		</c:if>
		<c:if test="${param.logout ne null}">
			<div class="alert-normal">You have been logged out.</div>
		</c:if>
			<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
</body>
</html>