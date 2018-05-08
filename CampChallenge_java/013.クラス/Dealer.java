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

import java.util.ArrayList;
import java.util.Random;

class Dealer extends Human{
      ArrayList<Integer> cards = new ArrayList<>();
        public Dealer(){
        //全てのカードを追加
                    for(int n = 1; n<=4; n++){
                        for (int i = 1; i <= 13; i++ ){
                                              
                        cards.add(i);
                    
                       
                        }
                    }
        }      
        //山札からランダムに２枚カードを引く
            public ArrayList<Integer> deal(){
               ArrayList<Integer> data1 = new ArrayList<>();
                Random rand = new Random();
                Integer index = rand.nextInt(cards.size());
                data1.add(cards.get(index));
                cards.remove(index);
                
                
                Integer index1 = rand.nextInt(cards.size());
                data1.add(cards.get(index1));
                cards.remove(index1);
                  return data1;
                        
            }
        //山札からランダムに一枚引き、引いたカードを戻り値にする       
           public ArrayList<Integer> hit(){
                Random rand = new Random();
                Integer index = rand.nextInt(cards.size());
                    ArrayList<Integer> data2 = new ArrayList<>();
                        data2.add(cards.get(index));
                        cards.remove(index);
                        return data2;
            }   
           //引いたカードを追加する
           public void setCard(ArrayList<Integer> a){
                
               for (int i= 0; i < a.size(); i++){
                                                             
               myCards.add(a.get(i));

               }

           }  
           
           
           //手札の合計値を計算する
           public int open(){

               int sum = 0;
               for(int i = 0;i< myCards.size(); i++){
                    sum+=myCards.get(i);
                }
                return sum;
           }
           
           //まだカードを引くべきか判断する
           public boolean checkSum(){
               int sum = 0;
               for(int i = 0;i< myCards.size(); i++){
                    sum+=myCards.get(i);
                }
               
                if (sum <= 16 ){
                    
                return true;
                }else {
                return false;
                }  
                    
            }
               
                
}

   
    


         