package maps;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {
	public static void main(String[]args)
	{
		Map<String,Integer>  numbers= new  HashMap<>();
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three", 3);
		numbers.putIfAbsent("one", 10); // if key dont exist then only it will put
		System.out.println(numbers);
		System.out.println(numbers.get("two"));
		System.out.println(numbers.containsKey("two"));
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		//numbers.remove("one");
	//	Set<Entry<String,Integer>> s= numbers.entrySet();
		for(Entry<String,Integer> entry:numbers.entrySet())
		{
		System.out.println(entry.getValue()*100);
		}
		
		
		System.out.println(getHash("GOD"));
	
		
}
	
	public static int getHash(String s)
	{
		int hash=0;
		for(int i=0;i<s.length();i++)
		{
			hash+=s.charAt(i);
		}
		return hash;
		
	}

}
