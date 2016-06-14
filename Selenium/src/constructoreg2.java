
public class constructoreg2 
{
	static int age;
	static String name;
	static String address;
	
	constructoreg2(int a,String n)
	{
		age=a;
		name=n;
		System.out.println(age+" "+name);
	}
	
	constructoreg2(int a,String n,String ad)
	{
		age=a;
		name=n;
		address=ad;
		System.out.println(age+" "+name+" "+address);
	}
	

	public static void main(String[] args) 
	{
//		System.out.println(age+" "+name);
		constructoreg2 c=new constructoreg2(25,"Venki");
	
		constructoreg2 d=new constructoreg2(20, "sandhya", "US");

	}

}
