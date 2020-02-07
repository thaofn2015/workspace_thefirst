<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Spring Web Internationliztion</title>
    </head>

    <body>
        <a>Language :</a>
        <a href="?language=en">English | </a>
        <a href="?language=vi">Viet Nam | </a>
        <a href="?language=ja">Japan | </a>
        <a href="?language=fr">France</a>

        <h2>hello :  <spring:message code="hello" text="default text" /></h2>
        Current Locale : ${pageContext.response.locale}
    </body>
</html>