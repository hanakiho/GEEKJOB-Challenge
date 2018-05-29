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
public class db7 {
    public static void main(String[] args) {
        
    
        Connection db_con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hanaki","misato1008");
            
            Statement stmt = db_con.createStatement();
            
            String mysql ="update profiles set profilesID=1,name='田中 敏夫',tel='012-3232-3456',age=25,birthday='1992-10-03' where profilesID=1";
            
            System.out.println("SQL:"+mysql);
            
            int num = stmt.executeUpdate(mysql);
            System.out.println(num+"件のレコードを更新しました。");
            
            String sql = "select*from profiles order by profilesID ASC";
            ResultSet rs=stmt.executeQuery(sql);
            
            System.out.println("profilesID,name,tel,age,birthday");
            
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
            
            System.out.println("エラーが発生しました。:"+e_sql.toString());
    
        }catch(Exception e) {
            
            System.out.println("エラーが発生しました。:"+e.toString());
            
        }finally {
            if(db_con !=null) {
                try {
                    db_con.close();
                    
                }catch(Exception e_con) {
                    
                    System.out.println(e_con.getMessage());
                    
                }
            }
        }
    }
}