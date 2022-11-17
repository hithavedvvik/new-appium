package JavaPtacticeCollection;

import java.util.Arrays;
import java.util.Iterator;

public class MockClass {
//list of arrays
	public static void main(String[] args) {
		String s="my name is kavitha";
		String[] s1=s.split(" ");
		String res="";
		System.out.println(Arrays.toString(s1));
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		
		s1[s1.length-1]=temp;
		for(String str:s1) {
			res+=str+" ";
		}
System.out.println(res);
	}
//Second commit
	//third commit
}

