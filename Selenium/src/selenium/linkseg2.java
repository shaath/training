package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkseg2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		//method1
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		
		//method2
//		Sleeper.sleepTightInSeconds(5);
//		List<WebElement> links=driver.findElements(By.linkText("Home"));
//		links.get(1).click();
		
		//method3
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			Sleeper.sleepTightInSeconds(5);
			if (links.get(i).getText().equalsIgnoreCase("home"))
			{
				links.get(i).click();
				break;
			}
			
		}
	}

}
