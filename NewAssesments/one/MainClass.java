package assessments;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,sum1=0;
		int a[] =new int[100];
		int b[] =new int[100];
		for(int i=0;i<a.length;i++)
		{
	       a[i]=(int)(Math.random()*10);
	       b[i]=(int)(Math.random()*10);
	       Circle c=new Circle(a[i]);
	       ClassTest c1=new ClassTest(a[i],b[i]);
	       sum=sum+c.getArea();
	       sum1=sum1+c1.getArea();
		
		
		}
		System.out.println("area of circle 1"+sum);
		System.out.println("area of circle 2"+sum1);
	}

}
