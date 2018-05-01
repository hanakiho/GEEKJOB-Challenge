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
         car1.setNum(5431,500);
          car1.Car();
          class2 car2=new class2();
          car2.Car();
    }    
 } 
class Car{
    
      int num;
      int gas;
    void setNum(int num,int gas){
       this.num=num;
       this.gas=gas;
      
    }  
    void Car(){
        
        System.out.println("ガソリンは"+gas+"です。");
        System.out.println("ナンバーは"+num+"です。");
    }
}  

    
 

