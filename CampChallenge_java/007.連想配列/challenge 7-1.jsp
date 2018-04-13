<%-- 
    Document   : challenge 7-1
    Created on : 2018/04/13, 11:38:50
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
<%@page import="java.util.HashMap"%>

<%
    HashMap<String,String>data1=new HashMap<String,String>();
    
    data1.put("1","AAA");
    data1.put("hello", "world");
    data1.put("soeda", "33");
    data1.put("20","20");
    
out.print(data1);
    
    
    
    


    
%>