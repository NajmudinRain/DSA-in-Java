package vectorAndStack;

public class MyStackUsingArr {
	private int size;
	int top;
	int arr[];
	
  MyStackUsingArr(int n)
  {
	  size=n;
	  arr=new int[size];
	  top=-1;
  }
  
   void push(int x) {
	arr[++top]=x;  
  }
	
   int pop()
  {
	return arr[top--];	
  }
  int size()
  {
	  return top+1;
  }
  boolean isEmpty()
  {
	  return top==-1;
  }
	
	public static void main(String[]args)
	{
		MyStackUsingArr mystack= new MyStackUsingArr(10);
		mystack.push(25);
		mystack.push(50);
		mystack.push(75);
		mystack.push(100);
		System.out.println(mystack.pop());
		System.out.println(mystack.size());
		System.out.println(mystack.isEmpty());
			while(!mystack.isEmpty())
				{
				System.out.println(mystack.pop());
				};
		
	}

}
