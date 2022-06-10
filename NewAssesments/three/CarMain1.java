package com.assesment;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CarMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="obj1.txt";
		
		try
		{
			FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Car ca=(Car)ois.readObject();
			Car ca1=(Car)ois.readObject();
			Car ca2=(Car)ois.readObject();
	
		    System.out.println(ca);
		    System.out.println(ca1);
		    System.out.println(ca2);
		    //System.out.println(ca3);
		    
		    System.out.println("obj readed");
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
