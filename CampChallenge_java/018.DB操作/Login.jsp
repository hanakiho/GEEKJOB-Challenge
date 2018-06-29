<%-- 
    Document   : Login
    Created on : 2018/06/07, 16:51:33
    Author     : hanakimisato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログインページ</title>
    </head>
    <body>
        <h1>ログイン画面</h1>
        <form action ="./Login" method="post">
            <p>ユーザーID：<input type="text" name="userID"></p>        
            <p>パスワード<input type="password" name="pass"></p>
            <p><input type="submit" name="sent" value="送信"></p>
        </form>
    </body>
</html>
