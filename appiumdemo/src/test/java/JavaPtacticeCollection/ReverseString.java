package JavaPtacticeCollection;

import java.util.Arrays;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ReverseString {
	@Test

	public void reverseString(){
		// TODO Auto-generated method stub
		String s="kavitha";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);


		}
		System.out.println(s1);
	}

	@Test
	public void removeDuplicatesInTwoString() {

		String a="my name is kavitha";
		String b="my name is ananda";
		String c=a+" "+b;
		String[] d=c.split(" ");
		System.out.println(Arrays.toString(d));
		int count=0;
		for(int i=0;i<d.length;i++)
		{
			for (int j = 0; j < d.length; j++) {
				if(d[i]==d[j])
				{
					count++;
				}
			}

		}
		if(count==1)
		{
			System.out.println();


		}

	}
	@Test
	public void OccurenceOfvowelWithDuplicate() {
		String str[]= {"kavitha","vedvvik","anand","hithaishi"};

		for(int i=0;i<str.length;i++)
		{

			int count=0;
			String m=str[i];
			for (int j = 0; j < m.length(); j++) {


				if(m.charAt(j)=='a'||m.charAt(j)=='e'||m.charAt(j)=='i'||m.charAt(j)=='u'||m.charAt(j)=='o')
				{
					count++;

				}	
			}
			System.out.println("thcount is        "+m           +count);

		}
	}
	@Test
	

	public void OccurranceOfvowelWithOutDuplicate()
	{
		String str[]= {"kavitha","vedvvik","anand","hithaishi"};
		

		for(int i=0;i<str.length;i++)
		{
			int count=0;
			String m=str[i];
			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			for (int j = 0; j < m.length(); j++)
			{
				set.add(m.charAt(j));
			}
			for (Character ch:set)
			{
				
					if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o')
					{
						count++;

					}	
					
					
				}
			System.out.println("thcount is        "+m+"   "+count);

			}
		}

@Test

public void ascendingvowelWithDuplicate()
{
	String str[]= {"kavitha","vedvvik","anand","hithaishi"};
	

	for(int i=0;i<str.length;i++)
	{
	}
}
@Test
public void PrintSumOfDigitInString ()
{

	
	
		String s="a1b2c3";
		int sum=0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
				int n =s.charAt(i)-48;//0-9 48-57
				sum=sum+n;
			}

	

			
		}
		System.out.println(sum);
	}
public void string() {
	
	String s="my naame is kavitha";
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
	String	m=s1[i];
	for (int j = 0; j < s.length(); j++) {
		
	}
	
}
}
@Test
public void swapUsingSubstring() {
String	s1="kavitha";
String s2="anand";
s1=s1+s2;//kavithaanand
s2=s1.substring(0, s1.length()-s2.length());
s1=s1.substring(s2.length());
System.out.println(s1);
System.out.println(s2);


	
}


}














































