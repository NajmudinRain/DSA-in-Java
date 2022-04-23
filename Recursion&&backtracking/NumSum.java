package Recursion;
import java.util.*;
public class NumSum {
	public static void main(String[]args) {
		int []arr= new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		
		boolean flag=false;
		
		for( int i=0; i<arr.length;i++)
		{
		   if(arr[i]>5)break;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]+arr[j]==x) {
				   System.out.print(arr[i]+","+arr[j]+";");
				   
				   flag=true;
			   }
		   }
			
		}
		if(flag==false) {
			System.out.println("NULL");
		}
		
		
		
	}

}