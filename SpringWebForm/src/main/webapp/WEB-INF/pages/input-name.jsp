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
        <title>Spring Web Form 1 - Input Name</title>
    </head>

    <body>
        <form:form action="convert-name" method="POST" modelAttribute="user">
            <p>Input name: </p>
            <form:input path="userName"/>

            <input type="submit" value="Convert">
        </form:form>
    </body>
</html>