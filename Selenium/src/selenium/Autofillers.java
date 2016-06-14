package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autofillers {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.com");
		
		driver.findElement(By.id("txtSource")).sendKeys("H");
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
		
		for (int i = 0; i < list.size(); i++)
		{
			String city=list.get(i).getText();
			System.out.println(city);
			if (city.equalsIgnoreCase("hyderabad")) 
			{
				list.get(i).click();
				break;
				
			}
		}

	}

}
