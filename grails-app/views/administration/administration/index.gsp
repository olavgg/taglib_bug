<%--
  Created by IntelliJ IDEA.
  User: olav
  Date: 06.07.16
  Time: 11:20
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title></title>
</head>

<body>
<permission:isAdministrator>
	<h1>Hello!</h1>
</permission:isAdministrator>
<g:each in="${brains}" var="b">
	<permission:isAdministrator>
		<h2>world!</h2>
	</permission:isAdministrator>
</g:each>
</body>
</html>