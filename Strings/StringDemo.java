package Strings;


public class StringDemo {
	
public static void main(String[]args)
{
	
String s1="hell";
	
	String s2="hell";
	String s3=new String("cool");
    String s4=new String("cool").intern();
    String s5=new String("cool").intern();
	int arr1[]= new int[5];
	int arr2[]= new int[5];
	int arr3[]= {1,2,4,5};
	int arr4[]= {1,2,4,5};
	
	if(s4==s5)               
	//if(s1.equals(s2))
			{
		System.out.println("same");    //both are diff from// if(Arrays.equals(arr1, arr2))
			}
	else
	{
		System.out.println("not same");
	}
	
}
}
