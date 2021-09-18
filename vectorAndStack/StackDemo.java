package vectorAndStack;
import java.util.*;
//in java, stack internally implements the vector class. we can also create stack by implementing linkedlist

public class StackDemo {
	public static void main(String[]args)
	{
		
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(14);
		stack.push(16);
		
		int poped=stack.pop();
		System.out.println(poped);
		//System.out.println(stack.peek());
		 poped=stack.pop();
		poped=stack.pop();
	
			
		System.out.println(poped);
		
		
//		Vector<String> vt=new Vector<String>();
//		vt.add("naj");
//		vt.add("rehan");
//		vt.add("najmudin");
//		System.out.println(vt);
		
	}

}
