package Logical_programm1;

import java.util.Arrays;

public class Ex3_Ex2_SumOfTwoArrayOfSameSize 
{
	public static void main(String[] args) 
	{
		int[] ar1= {10,20,40,50};
		int[] ar2= {60,65,20,25};
		int[] c=new int[ar1.length];
		for(int i=0;i<=ar1.length-1;i++)
		{
			c[i]=ar1[i]+ar2[i];
		}
		System.out.println(Arrays.toString(c));
		
	}

}
