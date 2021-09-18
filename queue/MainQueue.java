package queue;

public class MainQueue {
	public static void main(String[]args) {
	MyQueue<Integer> mq=new MyQueue<>();
	
	mq.Enqueue(23);
	mq.Enqueue(21);
	mq.Enqueue(22);
	mq.Enqueue(25);
	mq.Enqueue(26);
	
	System.out.println(mq.Dequeue());
	
	
	
	}
}
