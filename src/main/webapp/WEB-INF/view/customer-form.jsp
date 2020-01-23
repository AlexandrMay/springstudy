<%--
  Created by IntelliJ IDEA.
  User: alexandr.may
  Date: 22.01.2020
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Customer registration form</title>
    <style>
        .error {color: red}
    </style>
</head>
<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName" />
    <br><br>
    Last name: <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error" />
    <br><br>
    Postal code: <form:input path="postalCode" />
    <form:errors path="postalCode" cssClass="error" />
    <br><br>
    <input type="submit" value="Submit" />
</form:form>
<body>

</body>
</html>
