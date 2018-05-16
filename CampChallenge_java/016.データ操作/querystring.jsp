<%-- 
    Document   : querystring
    Created on : 2018/05/12, 23:34:37
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
         <h1>今回のポイント</h1>
       <% request.setCharacterEncoding("utf-8");
       int type=Integer.parseInt(request.getParameter("type"));
       int count=Integer.parseInt(request.getParameter("count"));
       int total=Integer.parseInt(request.getParameter("total"));
       out.print("商品は");
       if(type==1) {
           out.print("雑貨");
           
       } else if(type==2) {
           out.print("生鮮食品");
           
       } else {
           out.print("その他");
           
       }
       out.print("カテゴリです。");%>
          <br>
      <% out.print("今回の購入金額によって付与されるポイントは");
        if(total<3000) {
            out.print("ありません。");
        }else if(total<5000) {
            double i=total*0.04;
            int point=(int)i;
            out.print(point+"です。");
        }else {
            double i=total*0.05;
            int point =(int)i;
            out.print(point+"です。");
        }

          %>
    </body>
</html>
