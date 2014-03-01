/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtwasserfall.ooexampleondomain;

/**
 *
 * @author kurt
 */
public class Employee extends Person {
    
     public Employee()
    {
        
    }
     
    public Employee(String name,String Surname)
    {
            this.name = name;
            this.Surname = Surname;
            
    }
    
   
    private String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    private String getSurname()
    {
        return Surname;
    }
    
    public void setSurName(String Surname)
    {
        this.Surname = Surname;
    }
    
    private String getAddress()
    {
        return Address;
    }
    
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    
    private String getPhone()
    {
        return Phone;
    }
    
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }
    
     private String getIdentificationNo()
    {
        return IdentificationNo;
    }
    
    public void setIdentificationNo(String IdentificationNo)
    {
        this.IdentificationNo = IdentificationNo;
    }
    
   
    public void printEmployee()
    {
    System.out.println("\nEMPLOYER WORKING ON CAR");
    System.out.println("Name: "+getName()+"\nSurname: "+getSurname());
    }

    @Override
    public float PayPriceTotal(float paid, int days, int labour) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
