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


class timeStamp1 {
    public static void main(String[] args){
        Calendar c=Calendar.getInstance();
        c.set(2016,01,01,00,00,00);
        System.out.print(c.get(Calendar.YEAR));
        System.out.print("年");
        System.out.print(c.get(Calendar.MONTH));
        System.out.print("月");
        System.out.print(c.get(Calendar.DAY_OF_MONTH));
        System.out.print("日");
        System.out.print(c.get(Calendar.HOUR_OF_DAY));
        System.out.print("時");
        System.out.print(c.get(Calendar.MINUTE));
        System.out.print("分");
        System.out.print(c.get(Calendar.SECOND));
        System.out.print("秒");
                
    }
}
