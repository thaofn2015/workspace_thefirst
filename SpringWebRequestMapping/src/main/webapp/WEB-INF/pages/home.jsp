<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Home</title>
</head>
<body>
    <h1>Home</h1>
    <a href="/SpringWebRequestMapping/main/pathvariable/123">Go to Path Variable 1</a>
    <br>
    <a href="/SpringWebRequestMapping/main/pathvariable2/456/phanngocthao">Go to Path Variable 2</a>
    <br>
    <form action="/SpringWebRequestMapping/main/requestparam" method="GET">
        Ho: <input type="text" name="lastname"/>
        Ten: <input type="text" name="firstname"/>
        Tuoi: <input type="number" name="age">
        <br>
        <button type="submit">Go to Request Param</button>
    </form>
</body>
</html>