package LinkedList;


public class LastElemToFirst<E>{
	
	
	E moveToFront(Node head) 
    { 
		Node<E> temp=head;
	   if(temp==null||temp.next==null)
	     {
		return temp.data;
	     }
	   Node<E> seclast=null;
	   Node<E> last=temp;
	   while(last.next!=null)
	   {
		   seclast=last;
		   last=last.next;
	   }
	   seclast.next=null;
	   last.next=temp;
	   temp=last;
	     
	return temp.data;

}
}