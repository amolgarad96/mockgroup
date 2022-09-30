package logical_programm;

public class Ex12_SplitPara 
{
	public static void main(String[] args) 
	{
		String org="my name is abc";
		String[] ar = org.split(" ");
		
		System.out.println(ar[1]);
		
		System.out.println("----------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
