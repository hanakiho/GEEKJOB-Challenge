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
public class fileClass {
    public static void main(String[] args) {
        try {
            File fp=new File("test.txt");           
            FileWriter fw=new FileWriter(fp);           
            fw.write("はじめまして。花木です。");
            fw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
