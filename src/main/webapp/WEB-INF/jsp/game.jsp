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
		<applet codebase="resources" code="pilkarzyki/ApletPilkarzyki.class" width="550" height="600" archive="ApletPilkarzyki.jar,lib/jersey-client.jar,lib/jersey-core.jar,lib/jersey-gf-server.jar,lib/jersey-gf-statsproviders.jar,lib/jersey-grizzly.jar,lib/jersey-json.jar,lib/jersey-multipart.jar">
<!--		<applet codebase="resources" code="pilkarzyki/ApletPilkarzyki.class" width="550" height="600" archive="ApletPilkarzyki.jar,lib/activation.jar,lib/asm-3.1.jar,lib/jackson-core-asl-1.7.1.jar,lib/jackson-jaxrs-1.7.1.jar,lib/jackson-mapper-asl-1.7.1.jar,lib/jackson-xc-1.7.1.jar,lib/jaxb-api.jar,lib/jersey-apache-client-1.8.jar,lib/jersey-atom-abdera-1.8.jar,lib/jersey-client-1.8.jar,lib/jersey-core-1.8.jar,lib/jersey-guice-1.8.jar,lib/jersey-json-1.8.jar,lib/jersey-multipart-1.8.jar,lib/jersey-server-1.8.jar,lib/jersey-simple-server-1.8.jar,lib/jersey-spring-1.8.jar,lib/jettison-1.1.jar,lib/jsr173_api.jar,lib/oauth-client-1.8.jar,lib/oauth-server-1.8.jar,lib/oauth-signature-1.8.jar">-->
			<param name="nick" value="${nick}"/>
			<param name="color" value="${color}"/>
			<param name="ticket" value="${ticket}"/>
			<param name="gameId" value="${gameId}"/>
		</applet>
		<br/>
		<a href="chooseGame">Powrót do wyboru gry</a>
	</body>
</html>
