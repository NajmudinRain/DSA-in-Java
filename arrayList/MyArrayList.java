package arrayList;
import java.util.*;;

public class MyArrayList {
	public static void main(String[]args)
	{
		
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("lichhi");
		String s=fruits.get(0);
	
		
	
		System.out.println(s);
		Pair<String,Integer> p1=new Pair<>("rehan",786);
		Pair<Boolean, String> p2=new Pair<>(true,"naj");
		p1.getDescription();
		p2.getDescription();
		}

}
