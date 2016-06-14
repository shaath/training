package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class windowhandlingeg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		
//		driver.findElement(By.linkText("Terms of Service")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		while (it.hasNext())
		{
			String windowid=it.next();
			System.out.println(windowid);
			
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
//			driver.findElement(By.linkText("Terms of Service")).click();
			Sleeper.sleepTightInSeconds(5);
			try 
			{
				driver.findElement(By.linkText("Browser requirements")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				break;
			}
			catch (Exception e)
			{
//				System.out.println(e.getMessage());
				System.out.println("Browser requirements link not available in this page");
			}
		}


	}

}
