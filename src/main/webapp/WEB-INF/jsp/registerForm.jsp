<%-- 
    Document   : registrationFormView
    Created on : Nov 7, 2011, 4:13:11 AM
    Author     : Maciej Kwidziński <maciek.kwidzinski@gmail.com>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<body>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<form:form action="register" modelAttribute="credentials">
			Ksywa:
			<form:input path="nick" />
			<br/>
			Hasło:
			<form:input path="password" type="password"/>
			<br/>
			<input type="submit" value="Zarejestruj się" />
		</form:form>
		<a href="authenticate">Zaloguj się</a>
	</body>
</html>