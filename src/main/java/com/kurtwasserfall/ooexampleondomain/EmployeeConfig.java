package com.kurtwasserfall.ooexampleondomain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;


/**
 *
 * @author kurt wasserfall 211150142 3B
 */
@Configuration
public class EmployeeConfig {
     @Bean(name="emp")
     
public CustomerService getService(){

      return new CustomerServiceImpl();

   }
}