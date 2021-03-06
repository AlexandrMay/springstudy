
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Student confirmation form</title>
</head>
<body>

    The student is confirmed: ${student.firstName} ${student.lastName}
    <br><br>
    Country: ${student.country}
    <br><br>
    Language: ${student.favoriteLanguage}
    <br><br>
    Operating systems:

    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
        </c:forEach>
    </ul>

</body>
</html>
