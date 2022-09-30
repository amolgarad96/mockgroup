package Logical_programm1;

public class MissingNumberFromArray
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,5,6,7,9};
		int num;
		num=a[0];//1
		int num2 = a[0];
		
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==num+1)//
			{
				 num=a[i];
			}
			else if(a[i]==num2+i)
			{
				num2=a[i];
			}
			else
			{
				System.out.println(num+1);
				System.out.println(num2+1);
				break;
				
			}
			
			
		}
		
		
	}

}
