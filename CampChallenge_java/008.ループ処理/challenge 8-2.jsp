<%-- 
    Document   : challenge 8-2
    Created on : 2018/04/13, 16:49:31
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
    //Aを３０文字続いたものを表示する
String NAME="A";
for(int i=1;i<=30;i++){
    NAME="A"+"A";
    out.print(NAME);
    
}
    %>
    </body>
</html>
