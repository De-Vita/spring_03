<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오후 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>monday5.jsp</h2>
  <form action="/monday5-param" method="post">
    <input type="text" name="name" placeholder="이름"> <br>
    남:<input type="radio" name="gender" value="male">
    여:<input type="radio" name="gender" value="female"> <br>
    지역:
    <select name="city">
      <option value="">선택하세요</option>
      <option value="Incheon">인천</option>
      <option value="Seoul">서울</option>
      <option value="Jeju">제주</option>
    </select> <br>
    개발 가능한 언어:
    java<input type="checkbox" name="lang" value="java">
    c<input type="checkbox" name="lang" value="c">
    python<input type="checkbox" name="lang" value="python">
    javascript<input type="checkbox" name="lang" value="javascript">
    <br>
    <input type="submit" value="전송">
  </form>
</body>
</html>
