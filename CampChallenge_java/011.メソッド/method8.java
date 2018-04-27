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
@WebServlet(name = "method8", urlPatterns = {"/method8"})
public class method8 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String[] getProfiles(int id) {
        String[][] profiles={
            {"1","1992年１０月３日","東京","1246"},
           {"2","1993年9月３日","神奈川","2231"},
           {"3","1998年1月18日", "大阪","1111"}
        };
        /*変数limitを値２で用意。
        limitを利用して表示するプロフィール情報を２名分にする。
        */
        
        for(String[]tmp:profiles){
            int num=Integer.parseInt(tmp[0]);
                if(id==num){
                    
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
           /* out.print(i);*/
           int limit=2;
                  //for(int b=0;b<limit;b++){  
           //String str=String.valueOf(b);
           
           
           for(int i=1;i<limit+1;i++){
           String[] a=getProfiles(i);
               for (String a1 : a) {
                   out.print(a1+" ");
               }
               out.print("<br>");
               
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
