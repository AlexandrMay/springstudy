
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Customer confirmation form</title>
</head>
<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Postal code: ${customer.postalCode}

</body>
</html>
