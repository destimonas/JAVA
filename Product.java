class Product
{
	int pcode;
	String pname;
	int price;
	Product(int pc,String pn,int p)
	{
		pcode=pc;
		pname=pn;
		price=p;
	}
	public static void main(String args[])
	{
		int a,b,c;
		Product p1=new Product(1,"Phone",25000);
		Product p2=new Product(2,"Headset",5000);
		Product p3=new Product(3,"Charger",1500);
		a=p1.price;
		b=p2.price;
		c=p3.price;
		if(a<=b)
		{
			System.out.println("Phone"+" "+a);
		}
		else if(b<=c)
		{
			System.out.println("Headset"+" "+b);
		}
		else
		{
			System.out.println("Charger"+" "+c);
		}
		
	
	}
}
