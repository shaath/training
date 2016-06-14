import java.util.Scanner;


public class ifcond {

	public static void main(String[] args) 
	{
//		int a=300;
//		int b=2000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println(a);
		
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println(b);
				
		
		if (a > b) 
		{
			System.out.println("A is greater");
			
		}
		else
		{
			System.out.println("B is greater");
		}

	}

}
