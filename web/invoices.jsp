<%--
  Created by IntelliJ IDEA.
  User: lunkus
  Date: 2019-06-16
  Time: 09:01
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*" %>
<%@ page import="com.recbill.model.Invoice" %>
<%@ page import="com.recbill.model.Item" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invoices</title>
</head>
<body>
<h1>List of Invoices</h1>

<%
    // get invoices from the request object (sent by InvoiceServlet)
    List<Invoice> invoices = (List<Invoice>) request.getAttribute("INVOICES");
    List<Item> items = (List<Item>) request.getAttribute("ITEMS");
%>

<%= invoices %>
<hr>
<%= items %>

</body>
</html>
