package queue;
import java.util.*;

//enqueue()-->head--push()
//dequeue()--rear--Pop()

public class QueueDemo {
	public static void main(String[]args)
	{
	Queue<Integer> q = new LinkedList<Integer>();
	//System.out.println(q.remove());
	System.out.println((q.peek()));
	//System.out.println(q.poll());
	q.add(12);
	q.add(13);
	q.add(14);
	System.out.println(q);
	System.out.println(q.element());
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q.element());
		
	}

}
//public class MainClass{
//	
//	public static void main(String[]args)
//	{
//		MyQueue<Integer> mq= new MyQueue<>();
//		mq.Enqueue(12);
//		mq.Enqueue(13);
//		mq.Enqueue(14);
//		
//		
//		System.out.println(mq.Dequeue());
//		System.out.println(mq.Dequeue());
//	}
//	
//}
