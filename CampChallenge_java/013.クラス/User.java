/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaパッケージ;

import java.util.ArrayList;

/**
 *
 * @author hanakimisato
 */
class User extends Human{
            //Humanクラスを継承し、抽象メソッドを全て実装
    public User() {
    }
    
    
            
                
            
            public void setCard(ArrayList<Integer> a){
                for(int i =0 ;i<a.size(); i++)
                       myCards.add(a.get(i));
            }

            public int open(){
               int sum1 = 0;
                for(int i = 0;i< myCards.size(); i++){
                    sum1+=myCards.get(i);
                }
                return sum1;

            }
            public boolean checkSum(){
                int sum1 = 0;
                for(int i = 0;i< myCards.size(); i++){
                    sum1+=myCards.get(i);
                }
                    if (sum1 <= 16 ){
                        return true;
                    }
                    else{
                        return false;
                    }


            }
    }          
