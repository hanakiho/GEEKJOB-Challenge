<%-- 
    Document   : factorization
    Created on : 2018/05/13, 10:13:22
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
     <%  request.setCharacterEncoding("utf-8");
         int x=Integer.parseInt(request.getParameter("x"));
         
         for(int i=2;i<=x;i++) {
             if(i==x) {
                 out.print(x);
                 break;
             }else if(x%i==0) {
                 do {
                     x/=i;
                     out.print(i+"*");
                 }while(x%i==0);
             }      
         }
         
     %>
    </body>
</html>
