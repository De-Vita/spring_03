<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>monday4.jsp</h2>
    <table style="text-align: center">
        <tr>
            <th>id</th>
            <th>email</th>
            <th>password</th>
            <th>name</th>
            <th>mobile</th>

        </tr>
        <c:forEach items="${memberList}" var="memeber">
            <tr>
                <td>${memeber.id}</td>
                <td>${memeber.email}</td>
                <td>${memeber.password}</td>
                <td>${memeber.name}</td>
                <td>${memeber.mobile}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
