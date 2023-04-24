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
            <th>email</th>
            <th>password</th>
        </tr>
        <%-- items: 반복할 대상, var: 반복변수 --%>
        <%-- for(StudentDTO s: studentList) --%>
        <c:forEach items="${memberList}" var="m">
            <tr>
                <td>${m.email}</td>
                <td>${m.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
