package priorityQueues;

import java.util.*;
public class MainClass {
public static void main(String[]args)
{
	
  PriorityQueue<String> pq= new PriorityQueue();
  pq.add("apple");
  pq.add("mango");
  pq.add("kwik");
  pq.add("banana");
  pq.add("guave");
  pq.add("lichhi");
  System.out.println(pq);
//  
//  //storation and removal are not in same order
//  //adding is not sorted but removal is sorted;
//  
  System.out.println(pq.remove());
  System.out.println(pq.remove());
  System.out.println(pq.remove());
  System.out.println(pq.remove());
  System.out.println(pq.remove());
  System.out.println(pq.remove());
	
//	PriorityQueue<Integer> pq= new PriorityQueue(Collections.reverseOrder());
//	pq.add(12);
//	pq.add(1);
//	pq.add(4);
//	System.out.println(pq); //elements not stored in sorted order but are removed in sorted order.
//	System.out.println(pq.isEmpty());
//	System.out.println(pq.peek());
//	System.out.println(pq.remove());
//	System.out.println(pq.remove());
//	System.out.println(pq.remove());
//	
  
  
  
	
}
}
