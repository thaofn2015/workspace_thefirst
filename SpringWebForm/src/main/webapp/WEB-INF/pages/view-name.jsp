<%@ page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Spring Web Form 1 - View Name</title>
    </head>

    <body>
        <a href="index">Index</a>
        </br>
        <a href="convert-name">Convert Name</a>
        <p>Converted Name: ${user.userName}</p>
    </body>
</html>