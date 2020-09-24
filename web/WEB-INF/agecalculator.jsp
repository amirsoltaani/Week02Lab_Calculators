<%-- 
    Document   : agecalculator
    Created on : 24-Sep-2020, 2:00:43 PM
    Author     : AmirS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="AgeCalculatorServlet" method="post">
        <label for="ac">Enter Your Age:</label>
        <input id="ac" name="age" type="text">
        <br>
        <p>${result}</p>
        <p>${message}</p>
        <p>${message2}</p>
        <input type="submit" value="Age next birthday">
        </form>
        <a href="ArithmeticCalculatorServlet">Arithmetic Calculator</a>
    </body>
</html>
