<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>New Employee</title>
    </head>
    <body>
        <h2>New Employee</h2>
        <form:form action="add-employee" method="POST" modelAttribute="employee">
            <p>Name: </p>
            <form:input path="name"/>
            <p>Address: </p>
            <form:textarea path="address"/>
            <p>Email: </p>
            <form:input path="email"/>
            <p>Gender: </p>
            <form:radiobutton path="gender" value="Male" label="Male"/>
            <form:radiobutton path="gender" value="Female" label="Female"/>
            <p>Position: </p>
            <form:radiobuttons path="position" items="${listPosition}"/>
            <p>Favorite: </p>
            <form:checkboxes path="favorite" items="${listFavorite}"/>
            <br>
            <br>
            <input type="submit" value="Add"/>
        </form:form>
    </body>
</html>