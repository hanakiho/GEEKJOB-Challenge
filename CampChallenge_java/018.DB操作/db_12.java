/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newJavaパッケージ;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author hanakimisato
 */
@WebServlet(name = "db_12", urlPatterns = {"/db_12"})
public class db_12 extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           request.setCharacterEncoding("UTF-8");
           
            Connection db_con =null;
            PreparedStatement db_st=null;
            
            String UserName =request.getParameter("userName");
            int Age =Integer.parseInt(request.getParameter("age"));
            String Birthday =request.getParameter("birthday");
            
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db",
                    "hanaki","misato1008");
            
            
            String str =
                    "select*from profiles where name LIKE ? OR age=? OR birthday=?";
            
            db_st=db_con.prepareStatement(str);
            
            db_st.setString(1,"%"+UserName+"%");
            db_st.setInt(2,Age);
            db_st.setString(3,Birthday);
            
            out.println("検索結果");
            
            ResultSet rs =db_st.executeQuery();
            
            while(rs.next()) {
                
                out.println(rs.getInt("profilesID"));
                out.println(rs.getString("name"));
                out.println(rs.getString("tel"));
                out.println(rs.getInt("age"));
                out.println(rs.getString("birthday"));
                
            }
            
            rs.close();
            db_st.close();
            db_con.close();
            
           }catch(SQLException e_sql) {
                out.print("システムエラーが発生しました。："+e_sql.toString());
                        
            }catch(Exception e) {
                out.print("システムエラーが発生しました。："+e.toString());
                
            }finally {
                if(db_con !=null) {
                    
                }try {
                    db_con.close();
                }catch(Exception e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet db_12</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet db_12 at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
