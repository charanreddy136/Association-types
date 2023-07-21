package com.gqt.entities;

public class Account 
{
   private int accNo;
   private String accType;
   private String accName;
    public Account(int accNo, String accType, String accName)
    {
	
	this.accNo = accNo;
	this.accType = accType;
	this.accName = accName;
    }
	public int getAccNo() {
		return accNo;
	}
	public String getAccType() {
		return accType;
	}
	public String getAccName() {
		return accName;
	}
    
   
}
