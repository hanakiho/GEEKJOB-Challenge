<%-- 
    Document   : plofile
    Created on : 2018/05/10, 16:45:21
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
         <h1>plofile情報</h1>
    <%  request.setCharacterEncoding("UTF-8");
        out.print(request.getParameter("txtName"));
        out.print(request.getParameter("gender"));       
        out.print(request.getParameter("hobby"));
        out.print(request.getParameter("btnSubmit"));
       %>
    </body>
</html>
 
