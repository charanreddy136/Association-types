package com.gqt.Association;

public class Launch 
{ 	
	public static void main(String[] args)
	{
	      Charger ch = new Charger("Samsung", 22.5f);
	      Mobile m = new Mobile();
	      m.setCharger(ch);
	      System.out.println(m.os.getName());
	      System.out.println(m.os.getSize());
	      System.out.println(m.charger.getBrand());
	      System.out.println(m.charger.getVoltage());
	      m=null;
	      //System.out.println(m.os.getName());
	      //System.out.println(m.os.getSize());
	      //System.out.println(m.charger.getBrand());
	      //System.out.println(m.charger.getVoltage());
	      System.out.println(ch.getBrand());
	      System.out.println(ch.getVoltage());
	      
	      
    }
}
