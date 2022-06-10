package assessments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
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
	}

}
