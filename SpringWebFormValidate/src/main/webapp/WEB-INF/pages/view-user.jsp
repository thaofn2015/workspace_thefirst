<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Spring Web Form Validation</title>
</head>
<body>
  <h2>add-user.jsp</h2>
    Id: ${user.id} <br/>
    Name: ${user.name}<br/>
    Email: ${user.email }<br/>
    Phone Number: ${user.phone }<br/>
    Date Of Birth: <fmt:formatDate pattern = "dd/MM/yyyy" value = "${user.dateOfBirth}"/>
</body>
</html>