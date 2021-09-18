package sets;
import java.util.*;
public class SetOperationDemo {
	public static void main(String[]args)
	{
		Set<Integer> x = new HashSet<>();
		x.add(5);
		x.add(10);
		x.add(15);
		x.add(20);
      Set <Integer> y= new HashSet<>();
      y.add(15);
      y.add(20);
      y.add(25);
      y.add(30);
      //x.addAll(y); union of set
      x.retainAll(y);// intersection of set
      System.out.println(x);
		
	}

}
