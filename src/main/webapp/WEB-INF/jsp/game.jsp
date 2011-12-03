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
		Tutaj znajduje sie gra!
		<br/>
		A jej ID to ${gameId}
		<br/>
		Przy każdej komunikacji musisz wysłać nick gracza - ${nick} i jego ticket ${ticket}
		<br/>
		
		<applet codebase="resources/classes" code="pilkarzyki/ApletPilkarzyki.class" width="550" height="600"></applet>
	</body>
</html>
