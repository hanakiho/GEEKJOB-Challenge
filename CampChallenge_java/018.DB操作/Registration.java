package newJavaパッケージ;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>商品登録画面</title>");
            out.println("</head>");
            out.println("<body>");
            Connection db_con=null;
            PreparedStatement db_st=null;            
            request.setCharacterEncoding("UTF-8");
            String name=request.getParameter("name");
            int price =Integer.parseInt(request.getParameter("price"));
            int stock =Integer.parseInt(request.getParameter("stock"));
            
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con=DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db",
                        "hanaki","misato1008");
                
                String str ="insert into items values(?,?,?)";
                db_st=db_con.prepareStatement(str);
                db_st.setString(1,name);
                db_st.setInt(2,price);
                db_st.setInt(3, stock);
                int num=db_st.executeUpdate();
                System.out.println(num);
                out.println("商品が登録されました。");
                
            }catch(SQLException e_sql) {
                out.print("システムエラーが発生しました。："+e_sql.toString());
                e_sql.printStackTrace();   
            }catch(Exception e) {
                out.print("システムエラーが発生しました。："+e.toString());
                e.printStackTrace();
            }finally {
                if(db_con !=null) {
                    
                }try {
                    db_con.close();
                }catch(Exception e_con) {
                    System.out.println(e_con.getMessage());
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
