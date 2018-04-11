<%-- 
    Document   : challenge 3-1
    Created on : 2018/04/11, 17:50:00
    Author     : hanakimisato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

<% 
int age = 20;
final int NUM = 30;
int tasu = age + NUM;
int hiku = age - NUM;
int kakeru = age * NUM;
int wari = age / NUM;
int amari = age % NUM;

out.print(tasu);
out.print("<br>");
out.print(hiku);
out.print("<br>");
out.print(kakeru);
out.print("<br>");
out.print(wari);
out.print("<br>");
out.print(amari);
%>