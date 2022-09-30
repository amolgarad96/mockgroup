package logical_programm;

import java.util.HashMap;
import java.util.Set;

public class Ex16_repeatatingCharusinghashmap 
{
	public static void main(String[] args)
	{
		
		String s1="abcaba";
		  
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char org = s1.charAt(i);
			if(mp.containsKey(org))            //containskey verify key present or not
			{
				mp.put(org, mp.get(org)+1);   //mp.get(key) returns value
				                              //put method use to add keys and value in hashmap
			}
			else
			{
				mp.put(org, 1);
			}
		}
		
		Set<Character> keys=mp.keySet();
		for(Character s2:keys)
		{
			System.out.println(s2+""+mp.get(s2));
		}
		
		System.out.println("---");
		
		for(Character s3:keys)
		{
			if(mp.get(s3)>1)
			{
				System.out.println(s3+""+mp.get(s3));
			}
		}
			
			
			
			
			
		
	}

}
