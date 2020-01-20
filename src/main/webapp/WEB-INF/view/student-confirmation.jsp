<%--
  Created by IntelliJ IDEA.
  User: alexandr.may
  Date: 20.01.2020
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Student confirmation form</title>
</head>
<body>

    The student is confirmed: ${student.firstName} ${student.lastName}
    <br><br>
    Country: ${student.country}

</body>
</html>
