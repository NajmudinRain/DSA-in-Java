package Recursion;

public class RecurssionDemo {
	//static int stepCount=0;
	
	public static void main(String[]args)
	{
		
		
		System.out.println(sum(5));
		System.out.println(power(3,10000));
		//System.out.println("steps "+stepCount);
		//stepCount=0;
		System.out.println(fastPower(3,10000));
		//System.out.println("steps"+stepCount);
		System.out.println(path(4,4));
		
	}
	static int sum(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		else {
			
			return (n+sum(n-1));
		}
		
	}
	static int power(int a, int b)
	{
		//stepCount++;
		if(b==0)
		{
			return 1 ;
		}
		else
		{
			return a* power(a,b-1);
		}
		
	}
	static int fastPower(int a, int b)
	{
//		stepCount++;
//		System.out.println(b);
		if(b==0)
		{
			return 1;
		}
		 if(b%2==0)
		{
			return  fastPower(a*a, b/2);
		}
		return a*fastPower(a,b-1);
		
	}
	static int path(int m, int n)
	{
		if(m==1 || n==1)
		{
			return 1;
		}
		else {
			
			return path(n,m-1)+path(m,n-1);
		}
	}
}
