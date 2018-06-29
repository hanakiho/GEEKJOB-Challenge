<%-- 
    Document   : Registration
    Created on : 2018/06/07, 15:33:56
    Author     : hanakimisato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品登録画面</title>
    </head>
    <body>
        <form action ="./Registration" method="post">
            <p>商品情報を登録してください。</p>
            <p>商品名<input type ="text" name="name"></p>
            <p>値段<input type="text" name="price"></p>
            <p>在庫数<input type="text" name="stock"></p>
            <p><input type="submit" name="sent" value="登録"></p>               
        </form>
    </body>
</html>
