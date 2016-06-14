package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		Thread.sleep(5000);
		
		List<WebElement> radios=driver.findElements(By.xpath("html/body/section[2]/div/div/div/form/nav/ul/li"));
		
		for (int i = 0; i < radios.size(); i++)
		{
			System.out.println(radios.get(i).getText());
			
			if (radios.get(i).getText().equalsIgnoreCase("round trip"))
			{
				radios.get(i).click();
				break;
			}
			
		}
		

	}

}
