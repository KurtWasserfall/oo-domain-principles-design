/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtwasserfall.assignment;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author:Kurt Wasserfall 2211150142
 */
public class AssertionTest {
    private  AssertionService assertionService;
    
    public AssertionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public  void setUpClass() throws Exception {
      ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

      assertionService = (AssertionService )ctx.getBean("Assignment");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
      @Test 
      public void testAdd() throws Exception {
      int result = assertionService.add(12,5);
      Assert.assertEquals(result,17,"12+5 = 17 ");

    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
