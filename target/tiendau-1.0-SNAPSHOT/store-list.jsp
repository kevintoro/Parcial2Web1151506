<%--
  Created by IntelliJ IDEA.
  User: kevint
  Date: 21/11/20
  Time: 9:26 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="es">
<head>
  <title>Stores</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
  <meta charset="UTF-8"></meta>
</head>
<body>
<div class="container mt-4">
  <div class="col">
    <h2 class="text-center" style="color: #1e90ff">
      Servicios
    </h2>
    <div class="row mt-2">
      <div class="col-md-6 col-sm-12">
        <a href="<%=request.getContextPath()%>/login" class="btn btn-primary btn-block">
          Login
        </a>
      </div>
      <div class="col-md-6 col-sm-12">
        <a href="<%=request.getContextPath()%>/signup" class="btn btn-primary btn-block">
          Registrate
        </a>
      </div>
    </div>
    <div class="row row-cols-1 row-cols-md-4 mt-5">
      <c:forEach var="store" items="${stores}">
        <div class="col mb-3">
          <div class="card">
            <img src="${store.getImagen()}" class="card-img-top" alt="room_image">
            <div class="card-body">
              <h5 class="card-title text-center">
                <a href="${store.getFacebook()}">${store.getNombre()}</a>
              </h5>
              <p class="card-text text-center">
                ${store.getLema()}
              </p>
              <a href="" class="btn btn-primary text-center">+</a>
            </div>
          </div>
        </div>
      </c:forEach>
    </div>
  </div>
</div>
</body>
</html>
