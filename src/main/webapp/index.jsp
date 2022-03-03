<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>ToDo</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!--addItem-->

<body>
<div class="container pt-3">
    <div class="row">
        <div class="card" style="width: 100%">
            <div class="card-header">
                <form method="post" action="<%=request.getContextPath()%>/todoservlet">
                    <div class="form-group">
                        <label style="font-weight: bold">Добавить задачу</label>
                        <input type="text" class="form-control" id="description" placeholder="Описание задачи"
                               title="Введите текст задачи!">
                    </div>
                    <div class="form-select">
                        <label for="cat">Выберите модель:</label>
                        <select multiple id="cat" name="cat">
                            <option value="iphone 6s">iPhone 6S</option>
                            <option value="lumia 950">Lumia 950</option>
                            <option value="nexus 5x">Nexus 5X</option>
                            <option value="galaxy s7">Galaxy S7</option>
                        </select>
                    </div>
                    <br>
                    <button type="button" class="btn btn-primary">Добавить</button>
                </form>
            </div>
            <div class="card-body">
                <label style="font-weight: bold">Список заданий</label>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="showAll">
                    <label class="form-check-label" for="showAll">
                        Показать все
                    </label>
                </div>
                <table class="table" id="itemsList">
                    <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">Description</th>
                        <th scope="col">Category</th>
                        <th scope="col">Date</th>
                        <th scope="col">Name</th>
                        <th scope="col">Done</th>
                    </tr>
                    </thead>
                    <tbody id="table">
                    <br>
                        <c:forEach var="item" items="${requestScope.items}" >
                            <tr>
                                <th scope="col"><c:out value="${item.id}"/></th>
                                <th scope="col"><c:out value="${item.description}"/></th>
                                <th scope="col">
                                    <c:forEach items="${allCategories}" var="cat">
                                        <c:out value="${cat.name}"/>

                                    </c:forEach>
                                </th>
                                <th scope="col">
                                    <fmt:parseDate value="${item.created}" pattern="yyyy-MM-dd'T'HH:mm" var="parseCreated"/>
                                    <fmt:formatDate value="${parseCreated}" pattern="dd.MM.yyyy HH:mm"/>
                                </th>
                                <th scope="col">Name</th>
                                <th scope="col">Done</th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
