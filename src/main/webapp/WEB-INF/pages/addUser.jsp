<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<form:form method="post" action="addUser" commandName="user">
    <table>
        <tr>
            <td><form:label path="firstName">
                First Name
            </form:label></td>
            <td><form:input path="firstName"/> </td>
        </tr>
        <tr>
            <td><form:label path="lastName">
                Last Name
            </form:label></td>
            <td><form:input path="lastName"/> </td>
        </tr>
        <tr>
            <td><form:label path="email">
                email
            </form:label></td>
            <td><form:input path="email"/> </td>
        </tr>
        <tr>
            <td><form:label path="skype">
                skype
            </form:label></td>
            <td><form:input path="skype"/> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add User"/> </td>
        </tr>
    </table>
</form:form>

</body>
</html>
