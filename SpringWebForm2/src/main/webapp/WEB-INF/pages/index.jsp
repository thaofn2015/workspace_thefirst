<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Web Form 2 - Index</title>
</head>
<body>
    <a href="add-employee">Add Employee</a>
    <h2>Employee List</h2>
    <c:if test="${not empty employees}">
        <div>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>Position</th>
                    <th>Favorite</th>
                </tr>
                <c:forEach items="${employees }" var="emp">
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.address}</td>
                        <td>${emp.email}</td>
                        <td>${emp.gender}</td>
                        <td>${emp.position}</td>
                        <td>
                        <c:if test="${not empty emp.favorite }">
                            <c:forEach items="${emp.favorite }" var="fav">
                                ${fav}
                            </c:forEach>
                        </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </c:if>
</body>
</html>