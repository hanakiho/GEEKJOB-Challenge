<%-- 
    Document   : challenge 5-3
    Created on : 2018/04/12, 15:31:03
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
    char a='A';
    switch(a){
    case 'A':
    out.print("英語");
    break;
    case'あ':
    out.print("日本語");
    }
    %>
