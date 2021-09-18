package sets;
import java.util.*;

public class TreeSetDemo {
public static void main(String[]args)
{
	Set<String> fruits= new TreeSet<>();
	fruits.add("banana");
	fruits.add("apple");
	fruits.add("mango");
	fruits.add("zebra");
	// output is sorted and retain the properties of sets.
	
	System.out.println(fruits);
}
}
