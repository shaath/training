import java.util.Scanner;


public class stringops {

	public static void main(String[] args) 
	{
//		 String course="selenium";
//		 String s="Selenium";
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter course value:");
		 String course=sc.next();
		 
		 System.out.println("Enter s value:");
		 
		 String s=sc.next();
		 
		 if (course.equalsIgnoreCase(s))
		 {
			 System.out.println("Two strings are same "+course+" "+s );
			
		}
		 else
		 {
			 System.out.println("Two Strings are not same");
		 }

	}

}
