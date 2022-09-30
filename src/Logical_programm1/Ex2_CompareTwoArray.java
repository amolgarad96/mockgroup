package Logical_programm1;

import java.util.Arrays;

public class Ex2_CompareTwoArray 
{
	public static void main(String[] args) 
	{
	   int a[]= {1,2,3};
	   int b[]= {2,1,4};
	   int[] c=new int[a.length]; //c= {3,3,7}
	   
	  for(int i=0;i<a.length;i++)
	  {
		  
		  c[i]=a[i]+b[i];
		 
	  }
	  System.out.println(Arrays.toString(c));




	}

}
