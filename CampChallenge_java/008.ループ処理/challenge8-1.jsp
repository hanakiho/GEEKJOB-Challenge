<%-- 
    Document   : challenge8-1
    Created on : 2018/04/13, 16:16:24
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
<%
    //8の20乗を計算したい
    long total=8;
    for(int i=0;i<=20;i++){
        total=total*8;
    out.print(total);
    }
%>
    </body>
</html>