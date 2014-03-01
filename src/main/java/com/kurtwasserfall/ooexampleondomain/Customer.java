/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtwasserfall.ooexampleondomain;

/**
 *
 * @author kurt wasserfall 211150142 3B42 3B
 */
public class Customer  extends Person{
  // private String name;
    
    public Customer(String name,String Surname,String Address,String Phone,String IdentificationNo)
    {
            this.name = name;
            this.Surname = Surname;
            this.Address = Address;
            this.Phone = Phone;
            this.IdentificationNo = IdentificationNo;
    }
    
    public Customer()
    {
        
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
    
     private float getPaid()
    {
        return paid;
    }
    
    public void setPaid(float paid)
    {
        this.paid = paid;
    }
    
     private float getDays()
    {
        return days;
    }
    
    public void setDays(int days)
    {
        this.days = days;
    }
    
    private float getTotalPrice()
    {
        return totalPrice;
    }
      public void setTotalPrice(float totalPrice){
        this.totalPrice = totalPrice;
    }
    
     
    
    
    
       private int getlabour()
    {
        return labour;
    }
    
    
    public void setLabour(int labour)
    {
        this.labour = labour;
    }

    
    public float PayPriceTotal(float paid, int days, int labour) {
                return totalPrice = paid +(days * labour);}

    
    
    
    public float PayPriceTotalss()
    {
        return totalPrice = paid +(days * labour);
    }
    
    public void printCustomer()
    {
    System.out.println("\nCustomer Details...");
    System.out.println("Name: "+getName()+"\nSurname: "+getSurname()+"\nAddress: "+getAddress()+"\nPhone: "+getPhone()+"\nI.D: "+getIdentificationNo());
    }
}

