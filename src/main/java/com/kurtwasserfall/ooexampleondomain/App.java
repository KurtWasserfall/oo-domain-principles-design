package com.kurtwasserfall.ooexampleondomain;

/**
 * @author kurt wasserfall 211150142 3B
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //my polymorphism example
        
        Customer per1,per2;
        Employee per3,per4;
        
        per1 = new Customer("Peter","Roger","20 abletone street","0212345123","1234567845345");
        per2 = new Customer("Eral","johnson","2 strand street","0212345623","6784567845345");
        per3 = new Employee ("Meto","Rawly");
        per4 = new Employee ("Sach","Maree");
        
        per1.printCustomer();
        per3.printEmployee();
        per2.printCustomer();
        per4.printEmployee();
    }
}
