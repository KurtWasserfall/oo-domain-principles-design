
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtwasserfall.ooexampleondomain;
import com.kurtwasserfall.ooexampleondomain.CustomerConfig;
import com.kurtwasserfall.ooexampleondomain.CustomerService;
import com.kurtwasserfall.ooexampleondomain.EmployeeConfig;
import com.kurtwasserfall.ooexampleondomain.EmployeeService;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class PersonTest {
    private CustomerService customerService;
    private EmployeeService employeeService;
    
    public PersonTest() {
    }
    
    @BeforeClass
    public  void setUpClass() {
        
         ApplicationContext ctxCust = new AnnotationConfigApplicationContext(CustomerConfig.class);
         ApplicationContext ctxEmp = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        customerService = (CustomerService)ctxCust.getBean("cust");
        employeeService = (EmployeeService)ctxEmp.getBean("emp");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testSomeMethod() {
        
     // System.out.println("Testin method");
        float result = customerService.PayPriceTotal(500, 2, 250,500);
    }
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
     
    
}
