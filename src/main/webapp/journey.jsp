<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Catalog Example</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>You were here:</h1>
<ol>
    <c:forEach items="${urls}" var="url">
        <li>${url}</li>
    </c:forEach>
</ol>
<form method="post">
    <input type="submit" value="Clear history">
</form>
</body>
</html>