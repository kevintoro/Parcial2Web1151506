<%--
  Created by IntelliJ IDEA.
  User: kevint
  Date: 21/11/20
  Time: 10:51 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Store</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
  <div class="col">
    <h2 class="text-center" style="color: #1e90ff">
      <c:out value="${store.getNombre()}"/>
    </h2>
    <div class="row row-cols-1 row-cols-md-4 mt-5">
      <c:forEach var="store" items="${services}">
      </c:forEach>
    </div>
  </div>
</div>
</body>
</html>
