package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlelaunchcheck {

	public static void main(String[] args)
	{
		String exptitle="google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");

		String acttitle=driver.getTitle();
		System.out.println(acttitle);
//		if (exptitle.equalsIgnoreCase(acttitle)) 
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		if ((exptitle.toUpperCase()).equals(acttitle.toUpperCase()))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
