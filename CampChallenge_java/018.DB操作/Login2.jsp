<%-- 
    Document   : Login2
    Created on : 2018/06/07, 16:57:51
    Author     : hanakimisato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession hs =request.getSession();
    String data=(String)hs.getAttribute("data");
    //int ac =(int)ac.getAttribute("ac");
    %>
    <%if(hs.getAttribute("ac").equals(request.getAttribute("check"))&&data !=null) {
      %>  
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン</title>
    </head>
    <body>
        <p>ようこそ<%= data %>さん</p>
        <br>
        <a href="./Registration.jsp">商品を登録する</a><br>
        <a href="./items">商品一覧を見る</a><br>
        <br>
        <a href ="./Logout">ログアウト</a><br>
    </body>
</html>
<%
    }else{
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン</title>
    </head>
    <body>
        <h4>ユーザーIDかパスワードが違います。</h4>
    </bodY>
</html>
<%
    }
%>
