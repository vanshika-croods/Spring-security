<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="security-app">
	<div class="details">

		<h2>Spring Security - JDBC Authentication</h2>
		</div>

	<div class="lc-block">
		<h1>
			Hello  <b><c:out value="${pageContext.request.remoteUser}"/></b> </h1>
		<form action="/logout" method="post">
			<input type="submit" class="button red big" value="Sign Out" /> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<!--this page can also be accessed by authenticated user using CSRF token  -->
		</form>
	</div>

</body>
</html>