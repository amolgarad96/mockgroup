package logical_programm;

public class Ex15_reverseEvenWordInPara
{
	public static void main(String[] args)
	{
		String org="my name is abc";
		
		String[] ar=org.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			String str = ar[i];
			if(i%2==0)
			{
				String rev = " ";
				for(int j=str.length()-1; j>=0;j--)
				{  
					rev=rev+str.charAt(j);
				}
				System.out.println(rev);
				
			}
			else
			{
				System.out.println(str);
			}
		}
		
	}

}
