package com.assesment;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Car c= new Car();
	     Car c1=new Car();
	     Car c2=new Car("344564","545456",null);
	   //  System.out.println(c.count);
         String fileName="obj1.txt";
	     try
	     {
	    	 FileOutputStream fis=new FileOutputStream(fileName);
	    	 ObjectOutputStream oos=new ObjectOutputStream(fis);
	    	 oos.writeObject(c);
	    	 oos.writeObject(c1);
	    	 oos.writeObject(c2);
	    	System.out.println(c);
	    	System.out.println(c1);
	    	System.out.println(c2);
	    	System.out.println("object stord");
	     }
	     catch (Exception e) {
			e.printStackTrace();
		}
	}

}
