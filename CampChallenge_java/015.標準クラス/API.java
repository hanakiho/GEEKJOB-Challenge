/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newJavaパッケージ;

/**
 *
 * @author hanakimisato
 */
import java.io.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.lang.Math;
import java.util.Date;

public class API {
    public static void main(String[] args) {
        try {
            File name=new File("APIfile");
            FileWriter fw=new FileWriter(name);
            
            
            fw.write("標準クラスのMathクラスを使って四捨五入します。");
            fw.write("\n");
            fw.write("開始時刻");
            fw.write("\n");
            
            Calendar cl=Calendar.getInstance();
            cl.set(2018,4,10,11,58,00);
            SimpleDateFormat sdf=
                    new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
            fw.write(sdf.format(cl.getTime()));
            
            //処理内容
            long n =Math.round(1.78);
            fw.write("\n");
            fw.write("1.78を四捨五入すると"+" "+n+" "+"です。");
            fw.write("\n");
            fw.write("処理を終了します。");
            fw.write("\n");
            
            //終了時刻
            Date d=new Date();
            SimpleDateFormat d2=
                    new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
            String c2=d2.format(d);
            fw.write("現在の時刻は");
            fw.write("\n");
            fw.write(c2);
            
            
            
            FileReader fr=new FileReader(name);
            BufferedReader br=new BufferedReader(fr);
            System.out.print(br.readLine());
            fw.close();
            fr.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static SimpleDateFormat SimpleDateFormat(String yyyy年MM月dd日HH時mm分ss秒) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}