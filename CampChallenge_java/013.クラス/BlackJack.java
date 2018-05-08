/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaパッケージ;

import static java.lang.Integer.sum;
import java.util.ArrayList;
/**
 *
 * @author hanakimisato
 */
public class BlackJack {
   public static void main(String[] args) {
        
    
   System.out.println("ブラックジャックを始めましょう");
    Dealer d=new Dealer();
    User u=new User();
    
    
    //引いたカードを手札に追加する
    d.setCard(d.deal());
    
    u.setCard(d.deal());
   System.out.println("ディーラーの引いたカードは"+d.myCards); 
     
   System.out.println("あなたの引いたカードは"+u.myCards);   
    
     
   //もし帰って来た値が１６以下なら山札からもう一度カードを引く  
  
   
   while(d.checkSum()==true||u.checkSum()) {
    //ディーラーのターン
    if(d.checkSum()==true) { 
    System.out.println("ディーラーは山札からもう一枚カードを引きます");
      
        d.setCard(d.hit());
    System.out.println("今の手札は"+d.myCards);
        int sum=d.open();
    System.out.println("ディーラーのカードの合計は"+sum+"です");   
       
    }if (u.checkSum()==true){    
    //ユーザーのターン    
        
        System.out.println("ユーザーは山札からもう一枚カードを引きます");
        u.setCard(d.hit());
        int sum1=u.open();
       
        System.out.println("ユーザーのカードの合計は"+sum1+"です");
    }  
   
   }
   //勝敗表示
   int sum=d.open();
   int sum1=u.open();  
   int maxnum=Math.max(sum,sum1);
   if(sum==21) {
       System.out.println("ディーラーはブラックジャックです。あなたの負けです。");
   }else if(sum1==21) {
   System.out.println("ユーザーはブラックジャックです。あなたの勝ちです。");
   }else if(sum>21){
       System.out.println("ディーラーはバースト。あなたの勝ちです。");
   }else if(sum1>21) {
       System.out.println("ユーザーはバースト。あなたの負けです。");
       
   }
  
   
   }
 
}


