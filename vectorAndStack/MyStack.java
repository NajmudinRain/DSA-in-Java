package vectorAndStack;

import  LinkedList.MyLinkedList;

public class MyStack<E> {
	
		
		 MyLinkedList<E> ll=new MyLinkedList<>();
		
		 void push(E e){
			ll.add(e); 
		  }
		 E pop()throws Exception{
			 if(ll.head==null)
			 {
				 throw new Exception("cant pop from empty stack");
			 }
			 return ll.removeLast();
		 }
		 E peek()throws Exception{
			 if(ll.head==null)
			 {
				 throw new Exception("stack is empty");
			 }
			 return ll.getLast();
			 
		 }
		
		


}
