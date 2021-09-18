package dequeue;
import java.util.*;

public class SlidingWindow {
	public static void main(String[]args)
	{
		
		
	int []arr= {1,5,6,2,4,9,6,4,8};
		int n=arr.length;
		int k=3;
		ArrayList<Integer>a=Solution.max_of_subarrays(arr,n,k);
		for(int i:a)
		{
			System.out.print(i);
		}
		
		
	}

}
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
    	
    	Deque<Integer> dq= new LinkedList<Integer>();
    	ArrayList<Integer> al= new ArrayList<>();
    	
     int i=0;
     for( ;i<k;i++)
     {
    	while(!dq.isEmpty()&& arr[dq.peekLast()]<=arr[i])
    	{
    		dq.removeLast();
    	}
    		
    		dq.addLast(i);
     }
    for(;i<n;i++)
    {
    	al.add(i-k,arr[dq.peekFirst()]);
    	while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
    	{
    		dq.removeFirst();
    	}
    	
    	while(!dq.isEmpty()&& arr[dq.peekLast()]<=arr[i])
    	{
    		
    		dq.removeLast();
    	}
    	dq.addLast(i);
    	
     }
    al.add(i-k,arr[dq.peekFirst()]);
     
    	
    	
		return al;
        
    }
}