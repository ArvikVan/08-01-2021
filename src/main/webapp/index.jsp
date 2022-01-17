<%--
  Created by IntelliJ IDEA.
  User: arvik
  Date: 09.01.2022
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index-page</title>
</head>
<body>
<form name="test" method="get" action="/08_01_2021/ItemServlet">
    <p><b>Ваше имя:</b><br>
        <input type="text" name = "name" size="40">
    <p><label for="cat">Выберите модель:</label>
    <select multiple id="cat" name="cat">
        <option value="iphone 6s">iPhone 6S</option>
        <option value="lumia 950">Lumia 950</option>
        <option value="nexus 5x">Nexus 5X</option>
        <option value="galaxy s7">Galaxy S7</option>
    </select></p>
    </p>
    <p><input type="submit" value="Отправить">
        <input type="reset" value="Очистить"></p>
</form>
<form name="test" method="post" action="ItemServlet">
    <p><b>Удалить из бд:</b><br>
        <input type="text" name = "id" size="40">
    </p>
    <p><input type="submit" value="Delete"></p>
</form>
</body>
</html>
