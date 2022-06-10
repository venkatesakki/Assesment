package assessments;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public String spin()
	{
		Random r=new Random();
		int chance=r.nextInt(2);
		if(chance == 0) {
			return "head";
		}
		else
		{
		return "tails";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int head=0;
		int tails=0;
		System.out.println("enter hpow time you want to spin");
		int times=sc.nextInt();
		
		FlipCoin f=new FlipCoin();
		for(int i=0;i<times;i++)
		{
			if(f.spin().equals("head"))
			{
				head++;
			}
			else
			{
				tails++;
			}
			
		}
		System.out.println("head"+head);
		System.out.println("tails"+tails);

	}

}
