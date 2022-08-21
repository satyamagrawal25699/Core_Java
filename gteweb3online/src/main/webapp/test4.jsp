<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	
	<c:set var="uname" value="<%=request.getParameter(\"uname\") %>"/>  
	<c:if test="${ name.equals(\"Rahim\")}">  
			<jsp:forward page="Welcome.jsp"/>
			
	</c:if>

</body>
</html>