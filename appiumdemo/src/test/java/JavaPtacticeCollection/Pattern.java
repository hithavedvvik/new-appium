package JavaPtacticeCollection;

import org.testng.annotations.Test;

public class Pattern {
	@Test
	public void evenPatter()
	{
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				if(j%2==0)
				{
					System.out.print(j+"  ");
			
			}
				else
				{
					System.out.print(i+"  ");
				}
		}
			System.out.println();
		
	}

	}}
