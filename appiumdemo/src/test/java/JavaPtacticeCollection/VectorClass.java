package JavaPtacticeCollection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<String>ver=new Vector<String>(4);
		ver.add("Tiger");
		ver.add("cat");
		ver.add("Elephant");
		ver.add("mangoos");
		System.out.println("size"+ver.size());
		System.out.println("size"+ver.capacity());
		System.out.println("vector element is"+ver);
		ver.add("tiger");
		ver.add("mangoos");
		ver.add("carrot");
		System.out.println("vector element is"+ver);
		if(ver.contains("tiger"))
		{
			System.out.println("the tiger is present in the index"+ver.indexOf("tiger"));
		}
		else
		{
			System.out.println("the tiger is present in the index");
		}
		System.out.println("the first animal of the vector"+ver.firstElement());
		
		System.out.println("the first animal of the vector"+ver.lastElement());
		
		Enumeration<String> enums = ver.elements();
		while(enums.hasMoreElements())
		{
			System.out.println(enums.nextElement());
		}
		
		
		
		
		
		
	}
	
	
		
			

}
