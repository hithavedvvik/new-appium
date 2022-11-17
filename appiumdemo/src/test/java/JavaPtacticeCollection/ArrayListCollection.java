package JavaPtacticeCollection;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class ArrayListCollection {
	@Test

	public void listCollection() {

		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add('A');
		list.add("kavitha");
		list.add(10.6);
		System.out.println(list);
		ArrayList<Object> list2=new ArrayList<Object>();
		list2.add(10);
		System.out.println(list2);
		//list.contsins method
		if(list.contains(list2)) {
			System.out.println("the list1 contains the list 2");
		}
		else
		{
			System.out.println("the list does not contains the list 2");
		}

		//
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(10);
		list3.add(14);
		list3.add(24);
		list3.add(24);
		for(int i:list3)
		{

			System.out.println(i);

		}
		list3.add(102);
		list3.add(14);
		list3.add(24);
		list3.add(243);
		for(int i:list3)
		{
			System.out.println(i);


		}
		Collections.sort(list3);


		//////
		ArrayList<Integer> list4=new ArrayList<Integer>();
		list4.add(13);
		list4.add(176);
		list4.add(12);
		list4.add(8767);
		System.out.println(list4);
		ArrayList<Integer> list5=new ArrayList<Integer>();
		list5.add(13);
		list5.add(14);
		list5.add(7);
		list5.add(7);
		System.out.println(list5);
		list4.contains(list5);
		System.out.println("contains"+list5);
		list4.remove(list5);
		System.out.println("after removing"+list4);
		list.retainAll(list5);
		System.out.println("after retaining"+list5);
		System.out.println("after retaining position "+list5.get(3));





	}
	@Test

	public void ascendingArray()

	{
		int a[]= {10,2,3,213,34};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}
	@Test
	public void adecendingArray()

	{
		int a[]= {10,2,3,213,34};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}
	@Test
	
	public void sumOfFirstThreemaxnum() {
		
		int a[]= {10,2,3,213,34};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("the first sum of max"+sum);
	}
	@Test
	
	public void firstmaxWithOutBubbleSort()
	{
		int a[]= {22,21,73,211,18};
		int Fmax=a[0];
		
		
		for(int i=1;i<a.length;i++)
		{
			if(Fmax<a[i])
			{
				Fmax=a[i];
			}
		}
		System.out.println("the first max is"+Fmax);
	}
	@Test
	
	public void secondMaxWithOutBubbleSor() {
		int a[]= {224,222,73,211,18,223};
		int Fmax=a[0];
		int SMax=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(Fmax<a[i])
			{
				SMax=Fmax;
				Fmax=a[i];
			}
			else
			{
				SMax=a[i];
			}
		}
		System.out.println("the first max is"+Fmax);
		System.out.println("the second max is"+SMax);
	}
	@Test
	
	public void primeArray()
	{
		int a[]= {3,4,5,6,7,8,9,10,11};
		for(int i=0; i<a.length;i++)
		{
			int n=a[i];
			int j=2;
			while(true)
			{
				if(n%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
				if(i==n)
				{
					System.out.println("prime no is"+a[i]);
				}
			}
		}
	}
	
	@Test
	
	public void StringArrayMaxWithoutBubblesort() {
		
		String s[]={"Kavitha","vavvik","anand","hithaishi"};
		int max=s[0].length();
		for(int i=1;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
			}
		}
			
			for(int i=0;i<s.length;i++)
			{
				if(s[i].length()==max)
				{
					System.out.println("the max is "+s[i]);
			}
		
		}
		
	}
	@Test
public void StringArrayMaxAndMinINSAMELogicWithoutBubblesort() {
		
		String s[]={"Kavitha","vavvik","anand","hithaishi"};
		int max=s[0].length();
		for(int i=1;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
			}
		}
			
			for(int i=0;i<s.length;i++)
			{
				if(s[i].length()==max)
				{
					System.out.println("the max is "+s[i]);
			}
		
		}
		
	}
	//i/p[1 2 3 4 5]==o/p  3 4 5 1 2 
	@Test
	
	
	public void keyRotate()
	{
		int a[]= {1,2,3,4,5,6};
		int key=2;
		for (int i = 0; i < key; i++) {
			
		int temp=a[0];
		for (int j = 1; j < a.length; j++)
		{
			a[j-1]=a[j];
			
			
			
		}
		a[a.length-1]=temp;
		
		}
		//this loop is to print the output
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
	}
	//iput int a[]={1,2,4,5,7,10} o/p 3 6 8 9
	@Test
	
	public void missingNumberTest()
	{
		int a[]= {1,2,4,7,10};
		for (int i = 0; i < a.length-1; i++)
		{
			int n=a[i+1]-a[i];
			int count=1;
			while(n>1)
			{
				System.out.print(a[i]+count);
				count++;
				n--;
			}
		}
	}
	@Test
	
	
	public void separateZeroesAndOne()
	{
		
		int a[]= {0,0,1,0,1,0,1};
		int b[]=new int[a.length];
		int m=0;
		
		int n=a.length-1;
		for (int i = 0; i < b.length; i++) 
		{
			if(a[i]==1)
			{
				b[n]=a[i];
				
				
			}
			
		}
		
	//	int m=a.length-1;
		
		
	}
	@Test
	public void appendDifferentNumberWithZero() 
	{
		int a[]= {0,1,2,0,0,3,4};
		int b[]=new int [a.length];
		int count=3;
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				count++;
		}
			
			for (int k = 0; k < b.length; k++) {
				
			}
			
		}
				
		
	}
	
	
	
	//write a logic to print first 10 fibonnicii number
	//int n=123 get the the each digit of the number
	//check weather number is palindrom number
	//swap givwn two numbers with third variable
	//check weather the string is palindrom
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


