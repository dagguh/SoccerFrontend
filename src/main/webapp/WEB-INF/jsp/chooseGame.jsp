<%-- 
    Document   : registrationSuccessful
    Created on : 2011-11-07, 12:12:20
    Author     : Maciej Kwidziński <mkwidzinski@wp-sa.pl>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Stwórz lub dołącz do gry</title>
    </head>
    <body>
		Id otwartej gry: ${openGameId}
		<br/>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<form:form action="joinOpenGame">
			<input type="submit" value="Dołącz do otwartej gry" />
		</form:form>
		<form:form action="createGame">
			<input type="submit" value="Stwórz grę" />
		</form:form>
	</body>
</html>
