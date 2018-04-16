<%-- 
    Document   : challenge 8-4
    Created on : 2018/04/16, 0:17:44
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
        <%
           int key=1000;
           int num=0;
            while(key>=100){
                num--;
                key=key/2;
            }
            out.print(key);
          
            %>
    </body>
</html>
