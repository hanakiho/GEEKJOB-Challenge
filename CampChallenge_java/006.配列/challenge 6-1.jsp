<%-- 
    Document   : challenge 6-1
    Created on : 2018/04/12, 18:48:54
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
        <h1></h1>
    </body>
</html>
<%
    String[]data={"10","100","soeda","hayashi","-20","118","end"};
    
    out.print(data[0]); 
    out.print("<br>");
    out.print(data[1]);
    out.print("<br>");
    out.print(data[2]);
    out.print("<br>");
    out.print(data[3]);
    out.print("<br>");
    out.print(data[4]);
    out.print("<br>");
    out.print(data[5]);
    out.print("<br>");
    out.print(data[6]);
%>