package com.assesment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileHandling {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Date date=new Date();
		long fileStarting = date.getTime()/100000000;
		System.out.println("starting :"+fileStarting);
		
		try {
	    File folder=new File("demo");
	    if(!folder.exists())
	    		folder.mkdir();
	    FileWriter fw=new FileWriter("demo/sample.txt");
	    BufferedWriter bw=new BufferedWriter(fw);
	    bw.write("golbal Warn");
	    bw.write("\nthre is an Error in the file");
	    bw.write("\nFatal");
	    bw.write("jytciccytusayxdouydiydviuyviupyiyieyiweyriwey");
	    bw.close();
	    
	    FileReader fr=new FileReader("demo/sample.txt");
	    BufferedReader br=new BufferedReader(fr);
	    String str=null;
	    while((str=br.readLine())!=null)
	    {
	    	System.out.println(str);
	    }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(100000);
		try
		{
			FileReader fr=new FileReader("/home/vastpro/javaTest2/DynamicWebProject/demo/sample.txt");
			BufferedReader br =new BufferedReader(fr);
			
			try(FileWriter fw = new FileWriter("samplecopy.txt"))
					{
				String str=null;
				while((str=br.readLine())!=null)
				{
					if(str.contains("Warn") || str.contains("Error") || str.contains("Fatal"))
					{
					
					fw.write(str);
					System.out.println("done");
					}
					else
					{
						System.out.println("uyrciytrcytr");
					}
				}
				long fileEnding = date.getTime()/100000000;
				System.out.println("ending :"+fileEnding);
				
				long sub=fileStarting-fileEnding;
				System.out.println("total time taken "+sub);
					}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
