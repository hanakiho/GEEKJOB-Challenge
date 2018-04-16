<%-- 
    Document   : challenge 8-3
    Created on : 2018/04/15, 23:11:56
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
            //変数を宣言し、その値を０から１００までの合計値にする。
            int total=0;
                for(int i=1;i<=100;i++){
                total=total+i;
            }
            out.print(total);
            %>
    </body>
</html>
