package Strings;
import java.util.*;

public class jagArrayDemo {
	public static void main(String args[]){  
		Scanner sc= new Scanner(System.in);
		
		//declaring 2-d array with 4 rows.
		 String jagArray[][] = new String[4][];
            
               //intialising each array.
              jagArray[0]=new String[2];
              jagArray[1]=new String[3];
              jagArray[2]=new String[4];
              jagArray[3]= new String[5];
              System.out.println("enter the strings");
		for(int i=0;i<=jagArray.length-1;i++)
		{
			for(int j=0; j<=jagArray[i].length-1;j++)
			{
				jagArray[i][j]=sc.next();
			}
		}
		
		for(int i=0;i<jagArray.length;i++)
		{
			for(int j=0;j<=jagArray[i].length-1;j++)
			{
				System.out.print(jagArray[i][j]+" ");
			}
			 System.out.println();
		}
		}  
}
