/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtwasserfall.ooexampleondomain;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
abstract class Person {
    
    String name;
    String Surname;
    String Address;
    String Phone;
    String IdentificationNo;
    float paid = 0;
    int labour = 0;//this is per day
    int days = 0;
    float totalPrice = 0;
    
    abstract public float PayPriceTotal(float paid, int days, int labour);
    
}
