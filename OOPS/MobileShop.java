package OOPS;

class Telephone{
	private Long mobile_id;
	private String model_name;
	private int quantity;
	
	public Long getId()
	{
		return mobile_id;
	}
	public String getName()
	{
		return model_name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public void set(Long mid, String mname, int quantity)
	{
		this.mobile_id=mid;
		this.model_name=mname;
		this.quantity=quantity;
	}
	public void display(Telephone[] t)
	{
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i].getId()+" "+t[i].getName()+" "+t[i].getQuantity());
			}
	}
	
	
}

class Smart_Phone{
	private  Long mobile_id;
	private Boolean enabled_5G;
	private Boolean foldable;
	private Boolean dual_screen;
	
	public Long getId() {
		return mobile_id;
	}
	public Boolean getEnabled_5G()
	{
		return enabled_5G;
	}
	public Boolean getfoldable(){
		
		return foldable;
	}
	public Boolean getdual_screen() {
		return dual_screen;
	}
	public void setInfo(Long mobile_id,Boolean enabled_5G, Boolean foldable, Boolean dual_screen)
	{
		this.mobile_id=mobile_id;
		this.enabled_5G=enabled_5G;
		this.foldable=foldable;
		this.dual_screen=dual_screen;
	}
	
	public void display(Smart_Phone [] sp)
	{
		for(int i=0; i<sp.length; i++)
		{
			System.out.println(sp[i].getId()+" "+sp[i].getEnabled_5G()+" "+sp[i].getfoldable()+" "+sp[i].getdual_screen());
		}
	}
	
}



public class MobileShop{
public static void main(String[]args)
{
	Telephone[] t= new Telephone[5];
	for(int i=0;i<5;i++)
	{
		t[i]=new Telephone();
	}
	t[0].set(12345678L, "iphone11",100);
	t[1].set(3540984L, "realMe5pro",1000);
	t[2].set(12345678L, "iphone7",60);
	t[3].set(53433L, "note8pro", 50);
	t[4].set(53433L, " samsungGalaxy", 33);
	Telephone obj1= new Telephone();
	obj1.display(t);
	
	System.out.println('\n');
	
	Smart_Phone[] sp=new Smart_Phone[5];
	for(int i=0;i<5;i++)
	{
		sp[i]=new Smart_Phone();
	}
	sp[0].setInfo(2454354598L, true,false,true);
	sp[1].setInfo(2454354598L, true,false,true);
	sp[2].setInfo(9867236509L, false, false, false);
	sp[3].setInfo(5667781243L, true, false, false);
	sp[4].setInfo(1267894365L, true, true, true);
	Smart_Phone obj2=new Smart_Phone();
	obj2.display(sp);
}
}
