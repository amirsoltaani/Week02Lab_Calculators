<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2020, 3:53:11 PM
    Author     : AmirS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Arithmetic Calculator</title>
</head>
<body>
<h1>Arithmetic Calculator</h1>
<form action="ArithmeticCalculatorServlet" method="post">
    <label for="first">First: </label>
    <input type="text" id="first">
    <br>
    <label for="second">Second: </label>
    <input type="text" id="second">
    <br>
    <input type="submit" value="+">
    <input type="submit" value="-">
    <input type="submit" value="*">
    <input type="submit" value="%">
    <p>Result: </p>
    <a href="AgeCalculatorServlet">Age Calculator</a>
</form>
</body>
</html>
