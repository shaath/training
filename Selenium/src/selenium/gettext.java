package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettext {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		String gmail=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmail);
		
		String href=driver.findElement(By.linkText("Gmail")).getAttribute("data-ved");
		System.out.println(href);
	}

}
