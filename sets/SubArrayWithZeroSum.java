package sets;
import java.util.*;

//public class SubArrayWithZeroSum {
//	public static void main(String[]args)
//	{
//		int []arr= {1,1,2,3,2,6,4,10,-3};
//		boolean flag=false;
//		for(int i=0;i<arr.length;i++)
//		{
//			int sum=0;
//			for(int j=i; j<arr.length;j++)
//			{
//				sum+=arr[j];
//				if(sum==0)
//				{
//					flag=true;
//					break;
//				}
//				
//		    }
//		}
//		if(flag)
//		{
//			System.out.println("array with subarray having sum zero");
//		}
//		else {
//			System.out.println("no subarray having sum zero");
//		}
//		
//		
//		
//		
//	}
//
//}
 public class SubArrayWithZeroSum{
	 public static void main(String[]args)
	 {
		 int [] arr= {1,2,3,-6,7,-4,-2,};
		 Set<Integer> s =new HashSet<>();
		 int sum=0;
		 boolean flag=false;
		 for (int i=0; i<arr.length;i++)
		 {
		 	 s.add(sum);
		 	 sum+=arr[i];
		 	 
		 	 if(s.contains(sum))
		 	 {
		 		flag=true;
		 		break;
		 	}
		 	 
		 }
//		 int k=7;
//
//		 for(int element:arr)
//		 {  s.add(sum);
//		 	
//		 	 sum+=element;
//		 	 if(s.contains(sum-k))
//		 	 {
//		 		 System.out.println(sum-k);
//		 		 flag=true;
//		 		 break;
//		 		 
//		 	 }
//		 	
//		 	 
//		 }

		 if(flag)
		 {
		 	 System.out.println("present");
		 }
		 else {
		 	 System.out.println("absent");
		 }
		
		 
		 
	 }
	 
	 
 }
