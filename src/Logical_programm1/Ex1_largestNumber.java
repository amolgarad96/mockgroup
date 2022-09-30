package Logical_programm1;

import java.util.Scanner;

public class Ex1_largestNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First No : ");
		int num=scan.nextInt();
		int rem=0;
		int large=0;//784
		while(num>0)
		{
			num=num/10;//78

			rem=num%10;//78/10=8
			if(rem>large)//8>0
			{
				large=rem;
			}
			
		}
		System.out.println("largest digit is:"+large);
		
		
		
	}

}
