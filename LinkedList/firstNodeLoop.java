package LinkedList;


public class firstNodeLoop<E>{
	E firstNode(Node<E> head)throws Exception
	{
		Node<E> slow=head;
		Node<E> fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				break;
			}
			
		}
		if(slow==head)
		{
			return slow.data;
		}
		else {
			
			slow=head;
			while(slow!=fast)
			{  
				
				slow=slow.next;
				fast=fast.next;
			}
			
			return slow.data;
			
		}
		
		
		
	}
}
