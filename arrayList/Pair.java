package arrayList;
//generic demo
public class Pair<X ,Y > {
	X x;
	Y y;
	int num;
	public Pair(X x, Y y)
	{
		this.x=x;
		this.y=y;
	}
	void getDescription()
	{
		System.out.println(x+" "+y);
	}

}
