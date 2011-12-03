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
        <title>Lista gier</title>
    </head>
    <body>
		<!--	<applet codebase="resources/classes" code="pilkarzyki/ApletPilkarzyki.class" width="550" height="600"></applet>-->
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<form:form action="createGame">
			<input type="submit" value="Stwórz grę" />
		</form:form>
	</body>
</html>
