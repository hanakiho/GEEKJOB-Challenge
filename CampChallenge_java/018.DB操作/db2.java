/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newJavaパッケージ;

import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author hanakimisato
 */
public class db2 {
    public static void main(String[] args) {
        Connection db_con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hanaki","misato1008");
            
            Statement stmt = db_con.createStatement();           
            String str ="insert into profiles values(3,'鈴木 たかし','023-456-7890',25,'1992-10-08')";
            System.out.println();
            System.out.println("SQL:"+str);
            
            int num = stmt.executeUpdate(str);
            System.out.println(num+"件のレコードを追加しました。");
            stmt.close();
            db_con.close();
            
            
        }catch(SQLException e_sql) {
            System.out.println("接続時にエラーが発生しました。:"+e_sql.toString());
            
        }catch(Exception e) {
            System.out.println("接続時にエラーが発生しました。:"+e.toString());
        }finally {
            if(db_con !=null) {
                try{
                    db_con.close();
                }catch(Exception e_con) {
                    System.out.println(e_con.getMessage());
                    
                }
            }
        }
    }
}
