package JavaPtacticeCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Stringvowel {
	public static void main(String[] args)
	{
		Stringvowel vowel=new Stringvowel();
		vowel.OccuranceOfCharacter();
	}

	public void stingCombination()
	{
		String combination="vedvvikmanvithithaishi";
		//hs=new LinkedHashset();

	}
	public void vowel() {
		String s="vedvvik";
		int consonent=0;

		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i')
			{
				count++;
			}
			else
			{
				consonent++;
			}
		}

		System.out.println("the lower case vowel is"+count);
		System.out.println("the consonents is"+consonent);
		int countcaps=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				countcaps++;
			}
		}
		System.out.println("ihe uppercase vowel count is "+countcaps);

		
	}
	
	public void DuplicateVowel()
	{
		String vowel="vedvvik";
		HashSet set=new HashSet();

	}
	public void OccuranceOfCharacter() 
	{
		String value="vedvvik";
		int count=0;
		for(int i=0;i<value.length();i++)
		{
			for(int j=1;j<value.length();j++)
			{
				if(value.charAt(i)==value.charAt(j))
				{
					count++;
				}

			}

		}

		System.out.println(" the occurence is"+count);
}
	
	public void removeDuplicate()
	
	{
	String s="vevvik Welcome to bangalore";
	String[] sp=sp.split("");1q
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
		
	}
	public void shiftString()
	{
		
	}

}
