package DSA;

import java.util.*;

//public class Main1
//{
//	public static void main(String[] args) {
//		int sum, temp=0;
//	
//		int[] arr = {1020, 10023, 2345, 2300,4530, 3004};
//            for (int i=0;i<arr.length ; i++) {
//           String s=Integer.toString(arr[i]);
//           String str="";
//           for(int j=0;j<s.length();j++)
//           {
//        	   if(s.charAt(j)=='0')
//        	   {
//        		   continue;
//        	   }else {
//        		   str+=s.charAt(j);
//        	   }
//           }
//         arr[i]=Integer.valueOf(str);
//	
//        }
//       for(int i=0;i<arr.length;i++)
//       {
//    	   for(int j=i+1;j<arr.length;j++)
//    	   {
//    		   if(arr[i]<arr[j]) {
//    			   temp=arr[i];
//    			   arr[i]=arr[j];
//    			   arr[j]=temp;
//    		   }
//    	   }
//       }
//       for(int i:arr) {
//    	   System.out.print(i+" ");
//       }
//      
//       
//            
//}
//}
import java.util.*;
public class Main1{
	public static void main(String[]args) {
		int[] arr = {1020, 10023,111, 2345, 9876,000,2300,4530, 3004};
		//create an arraylist
		ArrayList<Integer> al= new ArrayList<>();
		 for (int i=0;i<arr.length ; i++) {
			String s=Integer.toString(arr[i]); //convert integer to string
           boolean flag=true;
           for(int j=0;j<s.length();j++) 
           {
        	   if(s.charAt(j)=='0')
        	   {  flag=false;
        		   break;
        	   }
           }
           if(flag) {
           al.add(arr[i]);
           }
			 
}
		 Collections.sort(al,Collections.reverseOrder()); //will sort the arraylist in descending order
		 int[] arr1=new int[al.size()];

		 int j=0;
		 for(int i:al)
		 {
			
			arr1[j]=i;
			j++;
		}
		 
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
		 }
		 
		
	
		 
	
	
	}
	
	
}