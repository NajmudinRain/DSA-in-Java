package sets;
import java.util.*;


public class HashSetDemo {
	public static void main(String[]args)
	{
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		System.out.println(fruits.add("mango"));
		fruits.add("banana");
		System.out.println(fruits.add("banana"));// no duplpicates, order is not prefered
		System.out.println(fruits);
		
		Iterator it = fruits.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
