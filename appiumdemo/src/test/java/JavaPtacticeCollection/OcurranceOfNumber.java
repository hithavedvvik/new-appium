package JavaPtacticeCollection;

import java.util.LinkedHashSet;

public class OcurranceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,1,4,7,9,6,5,9,6};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
			for( Integer it:set)
			{
				int count=0;
				{
					for(int i=0;i<a.length;i++)	
						if(a[i]==it) {
							count++;
						}
				}
				
				System.out.println(it+":"+count);
			}
	}
				
			
		}
		
