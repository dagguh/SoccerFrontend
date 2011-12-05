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
        <title>Gra</title>
    </head>
    <body>
		<applet codebase="resources" code="pilkarzyki/ApletPilkarzyki.class" width="640" height="600" archive="ApletPilkarzyki.jar,lib/jersey-client.jar,lib/jersey-core.jar,lib/jersey-gf-server.jar,lib/jersey-gf-statsproviders.jar,lib/jersey-grizzly.jar,lib/jersey-json.jar,lib/jersey-multipart.jar">
			<param name="nick" value="${nick}"/>
			<param name="color" value="${color}"/>
			<param name="ticket" value="${ticket}"/>
			<param name="gameId" value="${gameId}"/>
		</applet>
		<br/>
		<a href="chooseGame">Powrót do wyboru gry</a>
	</body>
</html>
