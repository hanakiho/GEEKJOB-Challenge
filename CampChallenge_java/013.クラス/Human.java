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
abstract class Human{

        abstract protected int open();

        abstract protected void setCard(ArrayList<Integer> a);

        abstract protected boolean checkSum();

    ArrayList<Integer> myCards = new ArrayList<>();


    }

   
