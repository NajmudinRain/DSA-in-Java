package queue;

public class MyQueue<E> {
	
	Node<E> head,rear;
	
	
	void Enqueue(E e)
	{
		
		Node<E> toadd= new Node<>(e);
		if(head==null)
		{
			head=rear= toadd;
		}
		rear.next=toadd;
		rear=rear.next;
		
		
	}
	E Dequeue()
	{
		if(head==null)
		{
			return null;
		}
		Node<E> temp=head;
		head=head.next;
		if(head==null)
		{
			rear=null;
		}
		return temp.data;
		
}


}
class Node <E>{
	
	E data;
	Node<E> next;
	Node(E data)
	{
		this.data=data;
		this.next=null;
		
	}
}
	
	
	

