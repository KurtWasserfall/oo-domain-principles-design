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
public class CustomerServiceImpl implements CustomerService {
       @Override
         public float PayPriceTotal(float paid, int days, int labour, float totalPrice) {
                return totalPrice = paid +(days * labour);

    }

   

  
   
}
