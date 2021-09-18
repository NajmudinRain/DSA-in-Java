package queue;

public class MyQueueUsingArr {
	int capacity;
	int front,rear;
	int arr[];
	int count;
	
	
	MyQueueUsingArr(int c)
	{
		capacity=c;
		arr=new int[capacity];
		front=rear=0;
		count=0;
	}
	
	void enqueue(int x)
	{
		if(count==capacity) {
			System.out.println("queue is full");
		}
		else{
		arr[rear%capacity]=x;
		rear++;
		count++;
		}
	}
	  int dequeue()throws Exception
	{ 
		  int x=-1;
		if(count==0)
		{
			throw new Exception("queue is empty");
			
			
		}
		
		if(count<capacity){
			
		 x= arr[front%capacity]; //garbage value
			front++;
			count--;
		}
		return x;
		
	}
	 int peek() throws Exception{
		 if(count==0) {
			 System.out.println("queue is empty");
			 return -1; //for empty queue
		 }
		 else {
			 return arr[front%capacity];
		 }
	 }
	 int size()
	 {
		 return arr[front];
	 }
	boolean isEmpty()
	{
		return count==0;
	}
	
	
	public static void main(String[]args)throws Exception
	{
		MyQueueUsingArr myQueue= new MyQueueUsingArr(6);
		//myQueue.dequeue();
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		myQueue.enqueue(50);
		while(!myQueue.isEmpty())
		{ 
			System.out.println(myQueue.peek());
			System.out.println(myQueue.dequeue());
		}
		
		
		
	}
}


