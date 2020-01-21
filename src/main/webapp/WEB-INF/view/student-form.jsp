<%--
  Created by IntelliJ IDEA.
  User: alexandr.may
  Date: 20.01.2020
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Student registration form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName" />
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>
        Country: <form:select path="country">
                    <form:options items="${student.countryOptions}" />
                    </form:select>
        <br><br>
        Favorite Language:
        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
        <br><br>
        Operating systems:
        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Mac <form:checkbox path="operatingSystems" value="Mac" />
        Windows <form:checkbox path="operatingSystems" value="Windows" />
        <br><br>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>
