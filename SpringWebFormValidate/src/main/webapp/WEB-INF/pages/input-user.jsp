<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .error {
                color: red;
            }
        </style>
        <meta charset="UTF-8">
        <title>Spring Web Form Validate</title>
    </head>

    <body>
        <form:form action="add-user" method="POST" modelAttribute="user">
            Id:
            <form:input path="id"/> <form:errors path="id" cssClass="error"/> <br/><br/>
            Name:
            <form:input path="name"/> <form:errors path="name" cssClass="error"/> <br/><br/>
            Email:
            <form:input path="email"/> <form:errors path="email" cssClass="error"/> <br/><br/>
            Phone Number:
            <form:input path="phone"/> <form:errors path="phone" cssClass="error"/> <br/><br/>
            Date Of Birth:
            <form:input path="dateOfBirth" type="date"/> <form:errors path="dateOfBirth" cssClass="error"/> <br/>
            <button type="submit">Submit</button>
        </form:form>
    </body>
</html>