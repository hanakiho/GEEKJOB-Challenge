package newJavaパッケージ;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.sql.Result;

/**
 *
 * @author hanakimisato
 */
@WebServlet(urlPatterns = {"/db_9"})
public class db_9 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            Connection db_con = null;
            request.setCharacterEncoding("UTF-8");
            PreparedStatement db_st=null;
            
            int UserID =Integer.parseInt(request.getParameter("userId"));
            String UserName =request.getParameter("userName");
            String TelNumber =request.getParameter("telNumber");
            int Age =Integer.parseInt(request.getParameter("age"));
            String Date =request.getParameter("date");
            
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db",
                    "hanaki","misato1008");
                
                //挿入
                String str ="insert into profiles(profilesID,name,tel,age,birthday) values(?,?,?,?,?)";
                db_st=db_con.prepareStatement(str);
                db_st.setInt(1,UserID);
                db_st.setString(2,UserName);
                db_st.setString(3,TelNumber);
                db_st.setInt(4,Age);
                db_st.setString(5,Date);
                
                
                db_st.executeUpdate();
                
                //ここから検索
                
                str ="select*from profiles";
                db_st=db_con.prepareStatement(str);
                ResultSet rs=db_st.executeQuery();
                        
                
                
                
                while(rs.next()) {
                    
                    out.print(rs.getInt("profilesID")+"<br>");
                    out.print(rs.getString("name")+"<br>");
                    out.print(rs.getString("tel")+"<br>");
                    out.print(rs.getInt("age")+"<br>");
                    out.print(rs.getString("birthday")+"<br>");
                    
                    
                    
                    
                }
                
                rs.close();
                db_st.close();
                db_con.close();
                
            }catch(SQLException e_sql) {
                out.println("エラーが発生しました。："+e_sql.toString());
                
            }catch(Exception e) {
                out.println("エラーが発生しました。："+e.toString());
                
            }finally {
                if(db_con !=null) {
                   try {
                       db_con.close();
                   }catch(Exception e_con) {
                       out.println(e_con.getMessage());
                   }
                }
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>テーブルに新しいレコードを追加します。</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet db_9 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db_9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(db_9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db_9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(db_9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
