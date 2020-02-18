<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring Web Upload File</title>
</head>
<body>

    <h2>${des}</h2>

    <form:form action="uploadFile" method="POST" enctype="multipart/form-data" modelAttribute="myFile" >
        File: <input type="file" name="multipartFile"> <br><br>
        Description: <form:input path="description"/> <br><br>
        <input type="submit" value ="Upload">
    </form:form>

</body>
</html>