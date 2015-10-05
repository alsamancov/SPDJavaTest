<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Manager</title>
</head>
<body>
<div>
    <h1>User Manager</h1>
    <c:if test="${!empty users}">
        <table>
            <tr>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>email</th>
                <th>skype</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.skype}</td>
                    <td><a href="/deleteUser/${user.id}">DELETE</a> </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
<a href="addUser">Add user</a>

</body>
</html>

