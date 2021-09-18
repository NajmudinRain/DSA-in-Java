package dequeue;

import java.util.ArrayDeque;

public class MainClass {
	public static void main(String[]args)
	{
		ArrayDeque<Integer> ad= new ArrayDeque<Integer>();
		ad.add(4);
		ad.addFirst(12);
		ad.addFirst(13);
		ad.addFirst(15);
		ad.offer(3);
		ad.add(2);
		
		
		System.out.println(ad);
		System.out.println(ad.pop());
		System.out.println(ad.remove());
		System.out.print((ad.poll()));
		
//		LinkedList<Integer> ad= new LinkedList<Integer>();
//		ad.add(4);
//		ad.addFirst(12);
//		ad.addFirst(13);
//		ad.addFirst(15);
//		ad.offer(3);
//		ad.add(2);
//		
//		
//		System.out.println(ad);
//		System.out.println(ad.pop());
//		System.out.println(ad.remove());
//		System.out.print((ad.poll()));;
//		
		
	}

}
