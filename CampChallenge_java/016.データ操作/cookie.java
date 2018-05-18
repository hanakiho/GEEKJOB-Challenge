/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newJavaパッケージ;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hanakimisato
 */
@WebServlet(name = "cookie", urlPatterns = {"/cookie"})
public class cookie extends HttpServlet {

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
           /*クッキーを利用して現在時刻を記録する。
            また、２回目以降のアクセス時は、クッキーの値を取り出し、
            前回にアクセスした時刻の情報を画面に表示する。
            */
           
            //現在時刻の取得
            Date now = new Date();
           
            
            //cookieへ"Data"という名前で現在時刻を登録
            Cookie c =new Cookie("LastLogin",now.toString());
            c.setMaxAge(30);
            //cookieに反映
            response.addCookie(c);
            //クッキーを利用し、自分が利用したい情報を探す。
            Cookie[] cs = request.getCookies();
            
            if(cs != null) {
                for(int i=0;i<cs.length;i++) {
                  if(cs[i].getName().equals("LastLogin")) {
                      out.print("前回のログインは"+cs[i].getValue());
                      break;
                  }  
                    
                }
            }
           
            
            
            
            
            
            /*cookieを操作するには、クッキークラスを利用する。
            Cookie作成（情報の書き込み）
            Cookie 変数名　= new Cookie(名前、値);
            ＊有効期限を設定すること！
            変数＝Cookie変数.setMaxAge(有効期限);
            
            Cookieクラスに情報を設定するだけでは、Cookieクラスに反映されない。
            response変数にある、addCookieメソッドを使うこと。
            */
           
            
            
            
            
            
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
