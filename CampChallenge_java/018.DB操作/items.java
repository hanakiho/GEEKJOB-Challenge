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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hanakimisato
 */
@WebServlet(name = "items", urlPatterns = {"/items"})
public class items extends HttpServlet {

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
            
            Connection db_con =null;
            PreparedStatement db_st =null;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet items</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>商品一覧ページ</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con =DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db",
                        "hanaki","misato1008");
                
                String str ="select*from items";
                db_st=db_con.prepareStatement(str);
                ResultSet rs=db_st.executeQuery();
                
                while(rs.next()) {
                    
                    out.println(rs.getString("name")+"<br>");
                    out.println(rs.getString("price")+"<br>");
                    out.println(rs.getString("stock")+"<br>");
                    
                }
            }catch(SQLException e_sql) {
                System.out.println("システムエラーが発生しました。"+e_sql.toString());
                
            }catch(Exception e) {
                System.out.println("システムエラーが発生しました。"+e.toString());
                
            }finally {
                
                if(db_con!=null){
                    
            }try {
                db_con.close();
            }catch(Exception e_con) {
                System.out.print(e_con.getMessage());
            }
           
        }
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
  