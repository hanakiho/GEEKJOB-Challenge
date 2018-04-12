<%-- 
    Document   : challenge 5-2
    Created on : 2018/04/12, 12:54:57
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
int NUM=1;
switch(NUM){
case 1:
out.print("one");
break;

case 2:
out.print("two");
break;

default:
out.print("想定外");
}
%>
