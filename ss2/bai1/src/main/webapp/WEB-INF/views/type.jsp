<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2023-04-12
  Time: 8:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="post">
<input type="checkbox" name="condiment" value="Lettuce">Lettuce</br>
<input type="checkbox" name="condiment" value="Tomato">Tomato</br>
<input type="checkbox" name="condiment" value="Mustard">Mustard</br>
<input type="checkbox" name="condiment" value="Sprouts">Sprouts</br>
<input type="submit" value="Save">
</form>
<h2></h2>
<a:forEach items="${result}" var="s">
    <a:out value="${s}"/>;
</a:forEach>
</body>
</html>
