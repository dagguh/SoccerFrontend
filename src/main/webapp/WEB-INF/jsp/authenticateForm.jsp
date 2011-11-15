<%-- 
    Document   : registrationFormView
    Created on : Nov 7, 2011, 4:13:11 AM
    Author     : Maciej Kwidziński <maciek.kwidzinski@gmail.com>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Logowanie</title>
	</head>
	<body>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<form:form action="authenticate" modelAttribute="credentials">
			Ksywa:
			<form:input path="nick" />
			<br/>
			Hasło:
			<form:input path="password" type="password" />
			<br/>
			<input type="submit" value="Zaloguj się" />
		</form:form>
		<span class="error">${userError}</span>
		<a href="register">Zarejestruj się</a>
	</body>
</html>