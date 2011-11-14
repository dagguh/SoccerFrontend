<%-- 
    Document   : registrationSuccessful
    Created on : 2011-11-07, 12:12:20
    Author     : Maciej Kwidziński <mkwidzinski@wp-sa.pl>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Player ${nick}</title>
    </head>
    <body>
		Player ${nick} as XML:
		<pre><c:out value="${playerXml}" escapeXml="true" /></pre>
	</body>
</html>
