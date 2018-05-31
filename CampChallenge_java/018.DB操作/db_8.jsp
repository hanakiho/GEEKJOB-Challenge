<%-- 
    Document   : db_8
    Created on : 2018/05/28, 16:20:12
    Author     : hanakimisato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>名前検索結果</h1>
        <% 
            Connection db_con=null;
            request.setCharacterEncoding("UTF-8");
            String userName =request.getParameter("UserName");
            PreparedStatement db_st=null;
            try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db",
                    "hanaki","misato1008");
            
            
            String str ="select*from profiles where name like ? ";
            db_st=db_con.prepareStatement(str);
            db_st.setString(1,"%"+userName+"%");
            
            ResultSet rs =db_st.executeQuery();
            
            
            
            while(rs.next()) {
                int num = rs.getInt("profilesID");
                String name = rs.getString("name");
                String tel =rs.getString("tel");
                int age =rs.getInt("age");
                String birthday =rs.getString("birthday");
                
                
                
                out.print(num+"\t");
                out.print(name+"\t");
                out.print(tel+"\t");
                out.print(age+"\t");
                out.println(birthday+"\t");
                
                if(rs==db_con) {
                    
                    System.out.println("一致する情報はありませんでした。");
                    
                }
                
            }   
            
            rs.close();
            db_st.close();
            db_con.close();
            
                    
                    
                    
            
            
            }catch(SQLException e_sql) {
                out.println("エラーが発生しました。:"+e_sql.toString());
                
            }catch(Exception e) {
                out.println("エラーが発生しました。:"+e.toString());
                
            }finally{
                
                if(db_con !=null) {
                    try{
                        db_con.close();
                    }catch(Exception e_con) {
                        out.println(e_con.getMessage());
                    }
                }
            }
        %>
    </body>
</html>
