<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/24/2023
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<h1>Create new product</h1>
<form:form action="/product/add" modelAttribute="product" method="post">
    <div class="mb-3">
        <form:input path="name" type="text" class="form-control"/>
        <form:errors path="name" cssClass="text-danger" element="p"/>
    </div>
    <div class="mb-3">
        <form:input path="des" type="text" class="form-control"/>
        <form:errors path="des" cssClass="text-danger" element="p"/>
    </div>
    <div class="mb-3">
        <form:input path="price" type="number" class="form-control"/>
        <form:errors path="price" cssClass="text-danger" element="p"/>
    </div>
    <div class="mb-3">
        <form:input path="stock" type="number" class="form-control"/>
        <form:errors path="stock" cssClass="text-danger" element="p"/>
    </div>
    <button type="submit" class="btn btn-primary">Register</button>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
