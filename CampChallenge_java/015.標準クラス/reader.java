/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newJavaパッケージ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hanakimisato
 */
public class reader {
    public static void main(String[] args) {
        try {
        File f=new File("myText.txt");
        FileWriter fw= new FileWriter(f);
        fw.write("はじめまして。花木です");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        System.out.print(br.readLine());
        fw.close();
        fr.close();
        } catch(IOException e) {
            
        }   
}
    }