/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaパッケージ;

/**
 *
 * @author hanakimisato
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class timeStamp3 {
    public static void main(String[] args){
        
       Calendar cl=Calendar.getInstance();
        cl.set(2016,10,04,10,00,00);
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        System.out.println(sdf.format(cl.getTime()));
       sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(cl.getTime()));
       
    }
    
}
