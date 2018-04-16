/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author hanakimisato
 */
import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import org.camp.servlet.ResultData;
import java.io.Serializable;
import java.util.Date;
public class ResultData implements Serializable{
    private Date d;
    private String luck;
    
public ResultData(){}

public Date getD(){
    return d;
}
public void setD(Date d){
    this.d=d;
}
public String getLuck(){
    return luck;
}
public void setLuck(String luck){
    this.luck=luck;
}
}
//リクエストスコープへ結果を設定
/*
      ResultData data=new ResultData();
      data.setD(newDate());
      data.setLuck(lucklist[index]);
      request.setAttribute("DATA",data);
      RequestDispatcher rd=request.getRequestDispatcher(result);
      rd.forward(request,response);

*/



 