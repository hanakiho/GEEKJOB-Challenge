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
public class class1{
  
  
    public static void main(String[] args){
         Car car1=new Car();
         car1.setNum(5431);
          car1.setGas(500);
    }    
 } 
class Car{
       int num;
       int gas;
    void setNum(int n){
       num=n;
       System.out.println("ナンバーは"+num+"です。");
    }  
    void setGas(int g){
        gas=g;
        System.out.println("ガソリンは"+gas+"です。");
    }
    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
    }

    
 

