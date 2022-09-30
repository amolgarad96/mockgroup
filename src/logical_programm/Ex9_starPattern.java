package logical_programm;

public class Ex9_starPattern 
{
	public static void main(String[] args) 
	{
//		******
//		*****
//		****
//		***
//		**
//		*
		int star=6;
		for(int i=1;i<=6;i++)//1
		{
			for(int j=1;j<=star;j++)//1<=6
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}

}
