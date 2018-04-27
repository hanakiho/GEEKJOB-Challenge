/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hanakimisato
 */
@WebServlet(name = "method7", urlPatterns = {"/method7"})
public class method7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String[] getProfiles(String id) {
        String[][] profiles={
            {"1","1992年１０月３日","東京","1246"},
           {"2","1993年9月３日","神奈川","2231"},
           {"3","1998年1月18日", null,"1111"}
        };
            for(String[]tmp:profiles){
                if(tmp[0].equals(id)){
                return tmp;
                }
            }       
            return null;
           
            
            
    }
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
           
            for(int b=1;b<=3;b++){
                //out.print(b);
                
                String str=String.valueOf(b);
                 String[] a=getProfiles(str);
                for(int i=0;i<a.length;i++){
                    /*out.print(a[i]<br>);*/
                     if(a[i]==null){    
                          continue;
                     }else{ 
                         out.print(a[i]+" ");
                     }
                }
                out.print("<br>");
            }
           
           //もしa[i]の要素がnull なら　スキップ
           //その後、a[i]の表示
           
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
