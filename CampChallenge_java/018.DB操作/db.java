/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newJavaパッケージ;

/**
 *
 * @author hanakimisato
 */
import java.sql.*;


public class db {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
    
    Connection db_con = null;
   
    try {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hanaki","misato1008");
    
        PreparedStatement db_st;
        db_st = db_con.prepareStatement("select*from user");
    db_con.close();
    
    System.out.println("ここまできた");
    
    }catch(SQLException e_sql) {
        System.out.println("接続時にエラーが発生しました。："+e_sql.toString());
        
    }catch (Exception e) {
            System.out.println("接続時にエラーが発生しました。："+e.toString());
            e.printStackTrace();
    }finally{
        if(db_con !=null) {
           try{
               db_con.close();
           }catch(Exception e_con)  {
               System.out.println(e_con.getMessage());
           }
        }
    }
    
    
    }
}
