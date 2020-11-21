<%--
  Created by IntelliJ IDEA.
  User: kevint
  Date: 21/11/20
  Time: 10:11 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Sign In</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
  <div class="col-md-8 mx-auto">
    <div class="card">
      <div class="card-body">
        <form action="access" method="post">
          <caption>
            <h2 class="mb-3 text-center">
              Bienvenido
            </h2>
          </caption>
          <div class="form-group row">
            <input type="email" name="email" id="email" class="form-control" placeholder="email">
          </div>
          <div class="form-group row">
            <input type="password" name="password" id="password" class="form-control">
          </div>
          <button type="submit" class="btn btn-outline-primary btn-block">Ingresar</button>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
