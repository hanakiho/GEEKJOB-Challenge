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
import java.sql.DriverManager;
public class db6 {
    public static void main(String[] args) {
        
        Connection db_con = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hanaki","misato1008");
            Statement stmt = db_con.createStatement();
            String mysql ="delete from profiles where profilesID=3";
                    
            System.out.println("SQL:"+mysql);
            
            int num =stmt.executeUpdate(mysql);
            System.out.println(num+"件のレコードを削除しました。");
            
            String sql = "select*from profiles";
            ResultSet rs=stmt.executeQuery(sql);
            
            System.out.println("profilesID name tel age birthday");
            
            while(rs.next()) {
                int profilesID=rs.getInt("profilesID");
                String name =rs.getString("name");
                String tel =rs.getString("tel");
                int age =rs.getInt("age");
                String birthday =rs.getString("birthday");
                
                
                System.out.print(profilesID+"\t");
                System.out.print(name+"\t");
                System.out.print(tel+"\t");
                System.out.print(age+"\t");
                System.out.println(birthday+"\t");
                
            }
            
            stmt.close();
            db_con.close();
                    
        }catch(SQLException e_sql) {
            
            System.out.println("エラーが発生しました。："+e_sql);
            
        }catch(Exception e) {
            
            System.out.println("エラーが発生しました。："+e);
            
        }finally{
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
