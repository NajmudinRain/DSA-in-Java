package Recursion;

import java.util.*;

public class PermutationOfString {
	static Set<String> set= new HashSet<>();
			
	public static void main(String[]args)
	{
		permutationOfString("abccc",0,4);
		
	}
	static void permutationOfString(String s, int l, int r)
	{ 
		
		if(l==r) {
		if (set.contains(s)) return;
		set.add(s);
			System.out.println(s);}
		
		for(int i=l; i<=r;i++)
		{
			s=interchangeChar(s,l,i);
			permutationOfString(s,l+1,r);
			s=interchangeChar(s,l,i);
		}
	}
 static String interchangeChar(String s, int a, int b)
 {
	 char array[]=s.toCharArray();
	 char temp=array[a];
     array[a]=array[b];
     array[b]=temp;
     
     return String.valueOf(array);
     //return new String(array);
    // return Arrays.toString(array);
     
 }
}
