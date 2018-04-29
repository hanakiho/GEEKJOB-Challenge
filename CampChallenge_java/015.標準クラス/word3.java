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
public class word3 {
    public static void main(String[] args) {
        String word="きょUはぴ｜え｜ちぴ｜のくみこみかんすUのがくしゅUをして｜ます";
        
        word=word.replace("U", "う").replace("｜","い");
        System.out.println(word);
        
    }
    
}
