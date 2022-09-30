package Logical_programm1;

public class MinimumNumbersFromArray 
{
	public static void main(String[] args) 
	{
int a[]= {30,40,50,60,20};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
	System.out.println("Minimum number in array ="+min);

	


		
	}

}
