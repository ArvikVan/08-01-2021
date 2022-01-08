<%@ page import="servlet.Cart" %><%--
  Created by IntelliJ IDEA.
  User: arvik
  Date: 08.01.2022
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="servlet.Cart" %>
<html>
<head>
    <title>SHOWCART JSP</title>
</head>
<body>

<%
    Cart cart = (Cart) session.getAttribute("cart");
%>

<h3> НАИМЕНОВАНИЕ <%= cart.getName() %> </h3>
<h3> КОЛИЧЕСТВО <%= cart.getQuantity() %> </h3>

</body>
</html>
