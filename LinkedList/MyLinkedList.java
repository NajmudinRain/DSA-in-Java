package LinkedList;
 
  class Node<E>{
	E data;
	Node<E> next;
	Node(E data)
	{
		this.data=data;
		this.next=null;
	}
}

public class MyLinkedList<E>{
 public	Node<E> head=null;
	
	
	 public void add(E data) {
		  if(head==null)
		  {
			  head=new Node<E>(data);
			 
		  }
		
		  else {
			  Node<E> temp=head;
			  while(temp.next!=null)
			  {
				  temp=temp.next;
			}
			  temp.next= new Node<E>(data);
		  }
		  
   }

	  void print()
	  {
		 Node<E> temp=head;
		   if(temp==null)
		   {
			   System.out.println("head is null");
		   }
		   else {
			  while(temp!=null)
			  {
				  System.out.println(temp.data);
				  temp=temp.next;
			  }
		   }
	  }
	  
	  public E getLast( ) throws Exception{ 
			Node<E>temp=head;
			if(temp==null)
			{
				throw new Exception("can't peek form empty linked list");
				
			}
			else {
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				return temp.data;
				
			}
	  }
	  public E removeLast( ) throws Exception{ 
			Node<E>temp=head;
			if(temp==null)
			{
				throw new Exception("can't remove form empty linked list");
				
			}
			if(temp.next==null)
			{
				head=null;
				return temp.data;
			}
			else {
				while(temp.next.next!=null)
				{
					temp=temp.next;
				}
				Node<E> toremove=temp.next;
				temp.next=null;
				return toremove.data;
				}
	  }
	   
	   void inserAfter(Node<E> prevNode, E data)
	   { 
		   Node<E> temp=null;
		   if(prevNode.next==null)
		   {
			   prevNode.next=new Node<E>(data);
		   }
		   else
		   { 
			 
			   temp=prevNode.next;
			   prevNode.next=new Node<E>(data);
			   prevNode.next.next=temp;
		   }
	   }
	 
	  
}


 


//   class Node<E>
//{
//	E data;
//	Node<E> next;
//	Node( E data)
//	{
//		this.data=data;
//		this.next=null;
//	}
//	
//}
//
//public class Mylinklist<E>{
//	public Node<E> head=null;
//	
//	public void add( E data)
//	{
//		Node<E> toadd= new Node<E>(data);
//		if(head==null) {
//			head=toadd;
//		}
//		else
//		{
//			Node<E> temp=head;
//			while(temp.next!=null)
//			{
//				temp=temp.next;
//			}
//			temp.next=toadd;
//		}
//		
//		
//	}
//	public E removeLast( ) throws Exception{ 
//		Node<E>temp=head;
//		if(temp==null)
//		{
//			throw new Exception("can't remove form empty linked list");
//			
//		}
//		if(temp.next==null)
//		{Node<E> toremove=temp;
//		temp=null;
//		return toremove.data;
//			
//		}
//		
//		while(temp.next.next!=null)
//		{
//			temp=temp.next;
//		}
//		Node<E> toremove =temp.next;
//		temp.next=null;
//		return toremove.data;
//		
//	}
//	public E getLast()throws Exception
//	{
//		Node<E> temp=head;
//		if(temp==null)
//		{
//			throw new Exception("linked list is empty");
//		}
//		while(temp.next!=null)
//		{
//			temp=temp.next;
//		}
//		return temp.data;
//		
//	}
//	void print()
//	{
//		Node<E> temp=head;
//		while(temp!=null)
//		{
//			System.out.println(temp.data);
//			temp=temp.next;
//		}
//	}
//	public static void main(String[]args)
//	{
//		Mylinklist<Integer>ll= new Mylinklist<>();
//		ll.add(12);
//		ll.add(13);
//		ll.add(14);
//		ll.add(16);
//				
//		ll.print();
//	}
//	
//	
//
//}
