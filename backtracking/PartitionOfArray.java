package backtracking;
import java.util.*;

public class PartitionOfArray {
public static void main(String[]args)
{
	int [] a= {2,1,2,3,4,8};
	int sum=0;
	for(int i=0; i<a.length;i++)
	{
		sum+=a[i];
	}
	ArrayList<Integer> ans= new ArrayList<>();
	boolean isPossible=(sum%2==0);
	if(isPossible)
	{
		for(int e:ans)
		{
			System.out.println(e+" ");
		}
		
	}
}
static boolean partitionOfArray(int[]a,int sum, int i,ArrayList<Integer>ans)
{
	if(i>=a.length || sum<0) return false;
	if(sum==0)return true;
	ans.add(a[i]);
	boolean leftPossible=partitionOfArray(a,sum-a[i],i+1,ans);
	
	if(leftPossible)return true;
	//this line make backtracking possible
	ans.remove(ans.size()-1);
	return partitionOfArray(a,sum,i+1,ans);
}



}
