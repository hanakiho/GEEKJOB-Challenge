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
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class timeStamp4 {
     public static void main(String[] args) {
         //日付の差を求める。
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2015,12,31,23,59,59);
        cal2.set(2015,01, 01,00,00,00);
        
        long diffTime = cal1.getTimeInMillis() - cal2.getTimeInMillis();
        int diffDayMillis = 1000 * 60 * 60 * 24;
        int diffDays = (int) (diffTime / diffDayMillis);
         System.out.println("2つの日付の差は：" + diffDays + "日です。");
         
    }
}
