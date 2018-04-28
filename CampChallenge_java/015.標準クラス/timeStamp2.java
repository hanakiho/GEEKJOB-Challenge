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
import java.util.Date;
import java.text.SimpleDateFormat;

public class timeStamp2 {
    public static void main(String[] args){
        Date d=new Date();
        
       
        SimpleDateFormat d2=
                new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
       
        String c2=d2.format(d);
        System.out.println(c2);
    }
}
