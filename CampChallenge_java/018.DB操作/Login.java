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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hanakimisato
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
            PreparedStatement db_st=null;
            request.setCharacterEncoding("UTF-8");
            String userID=request.getParameter("userID");
            String pass =request.getParameter("pass");
            
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con=DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db",
                        "hanaki","misato1008");
            String data="select*from user "
                    +"WHERE userID=? AND pass=?";
            db_st =db_con.prepareStatement(data);
            db_st.setString(1,userID);           
            db_st.setString(2,pass);
            
            ResultSet rs=db_st.executeQuery();
            String dataName=null;
            while(rs.next()) {
               dataName=rs.getString("name");
               
            }
            HttpSession hs =request.getSession();
            
            int check=(int)(Math.random()*1000);
            
            hs.setAttribute("data",dataName);
            hs.setAttribute("ac",check);
           request.setAttribute("check", check);
            
            RequestDispatcher dispatch=request.getRequestDispatcher("./Login2.jsp");
            dispatch.forward(request,response);
            
            }catch(SQLException e_sql) {
                out.println("接続時にエラーが発生しました。："+e_sql.toString());
                
            }catch (Exception e) {
                out.println("接続時にエラーが発生しました。："+e.toString());
                e.printStackTrace();
            }finally{
                if(db_con !=null) {
            try{
               db_con.close();
            }catch(Exception e_con)  {
               out.println(e_con.getMessage());
            }
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
