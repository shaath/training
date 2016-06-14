import java.util.Scanner;


public class nestedif {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println(a);
		
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println(b);
		
		System.out.println("Enter C value");
		int c=sc.nextInt();
		System.out.println(c);
		
		
		if (a > b & a > c)
		{
			System.out.println("A is greater");
			
		}
		else if (b > c & b> a) 
		{
			System.out.println("B is greater");
			
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
