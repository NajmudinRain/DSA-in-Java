package sets;
import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String[]args)
	{
		
	Set<String>fruits = new LinkedHashSet<String>();
	fruits.add("banana");
	fruits.add("mango");
	fruits.add("guava");
	//order is preserved , lose the properties of set.(ie. not constant operation)
	System.out.println( fruits.get("banana"));
	
		
		
	}

}
