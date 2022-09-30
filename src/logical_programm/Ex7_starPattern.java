package logical_programm;

public class Ex7_starPattern
{
//        *
//       **
//      ***
//     ****
//    *****
//     ****
//      ***
//       **
//        *
	public static void main(String[] args)
	{
		int star=1;
		int space=4;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=space;j++)
			   {
				System.out.print(" ");
			   }
				for(int j=1;j<=star;j++)
				{
					System.out.print("*");
				}
			System.out.println();
			if(i<5)
			{
				space--;
				star++;
				
			}
			else
			{
				space++;
				star--;
				
			}
		}
		
		
		
		
	}

}
