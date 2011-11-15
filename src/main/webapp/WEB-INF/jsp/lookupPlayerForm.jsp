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
		<form:form action="lookupPlayer" modelAttribute="nick">
			Ksywa:
			<form:input path="nick" />
			<input type="submit" value="Pokaż jako XML" />
		</form:form>
	</body>
</html>