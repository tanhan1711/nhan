<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2023-04-17
  Time: 8:11 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form method="post">
    <input type="text" name="num1" placeholder="Nhập số thứ nhất" value="${num1}">
    <input type="text" name="num2" placeholder="Nhập số thứ hai" value="${num2}">
    <button type="submit" value="+" name="dau">Addition (+)</button>
    <button type="submit" value="-" name="dau">Subtraction (-)</button>
    <button type="submit" value="*" name="dau">Multilication (*)</button>
    <button type="submit" value="/" name="dau">Division (/)</button>
    <h2>Kết Quả ${result}</h2>
</form>
</body>
</html>
