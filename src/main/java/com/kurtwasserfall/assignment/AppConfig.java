/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtwasserfall.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 *
 * @author:Kurt Wasserfall 2211150142
 */
public class AppConfig {
    
    @Bean(name="Assignment")

  public AssertionService getService(){

       return new AssertionServiceImpl();

   }

    /**
     *
     * @return
     */
    @Bean(name="Assignment")

   public AssertionService getImprovedService(){

      return new AssertionServiceImpl();

   }
    
}
