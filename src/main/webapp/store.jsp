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
    <div class="row">
      <a href="<%=request.getContextPath()%>/" class="btn btn-outline-primary mt-5 ml-4">
        Inicio
      </a>
      <a href="<%=request.getContextPath()%>/addService?store=<c:out value="${store.getId()}"/>"
         class="btn btn-outline-primary mt-5 ml-3">
        Agregar Servicio
      </a>
    </div>
    <div class="container">
      <div class="row row-cols-1 row-cols-lg-4 row-cols-md-3 mt-2">
        <c:if test="${services.size()>0}">
          <c:forEach var="service" items="${services}">
            <div class="col mb-2">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">
                      ${service.getNombre()}
                  </h5>
                  <p class="card-text">
                      ${service.getDescripcion()}
                  </p>
                </div>
              </div>
            </div>
          </c:forEach>
        </c:if>
        <c:if test="${services.size()==0}">
          <div class="card mx-auto">
            <div class="card-body">
              <h5 class="card-title">
                No hay servicios
              </h5>
              <p class="card-text">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus autem corporis eaque enim et, harum
                id
                natus nostrum placeat quaerat repellat repudiandae. Debitis iusto provident sequi tempora tempore!
                Repellendus, tempore.
              </p>
            </div>
          </div>
        </c:if>
      </div>
    </div>
  </div>
</div>
</body>
</html>
