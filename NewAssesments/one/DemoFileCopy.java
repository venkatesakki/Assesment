package assessments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoFileCopy {

	public static void main(String[] args) {
		
		try
		{
			FileReader fr=new FileReader("/home/vastpro/Demojava/Training/DynamicWebProject1/demo/sample.txt");
			BufferedReader br =new BufferedReader(fr);
			
			try(FileWriter fw = new FileWriter("/home/vastpro/Demojava/Training/DynamicWebProject1/samplecopy.txt"))
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
					}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
