package maps;
import java.util.*;
public class HashCodeAndEquals {
	public static void main(String[]args)
	{
		Pen p1= new Pen("red", 100);
		 Pen p2= new Pen("red",100);
		 
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		Set<Pen> pens= new HashSet();
		pens.add(p1);
		pens.add(p2);
		System.out.println(pens);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	
		
		
		
	}


}
class Pen{
	String color;
	int price;
	public Pen(String color, int price)
	{
		this.color=color;
		this.price=price;
		
   }
//	@Override
//	public boolean equals( Object obj)
//	{
//		Pen that=(Pen)obj;
//		boolean isequal=this.color==that.color &&this.price==that.price;
//		   return isequal;
//		
//	}
//	@Override
//	public int hashCode()
//	{
//		return price+color.hashCode();
//	}
//	
// automatically generated from ecllipse
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
