package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class demo {

	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://google.com");
		if (driver.findElement(By.linkText("Gmail")).isDisplayed())
		{
			System.out.println("Pass");
			
		}
	}

}
