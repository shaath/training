package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttoneg2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		Thread.sleep(5000);
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		List<WebElement> group1=block.findElements(By.name("group1"));
		
		List<WebElement> group2=block.findElements(By.name("group2"));
//		for (int i = 0; i < radios.size(); i++)
//		{
////			System.out.println(radios.get(i).getAttribute("value"));
//			if (radios.get(i).getAttribute("value").equalsIgnoreCase("cheese"))
//			{
//				group1.get(i).click();
//				
//			}
//			else if (radios.get(i).getAttribute("value").equalsIgnoreCase("wine")) 
//			{
//				group2.get(i).click();
//				
//			}
//			
//			
//		}
		for (int i = 0; i < group1.size(); i++)
		{
			if (group1.get(i).getAttribute("value").equalsIgnoreCase("cheese"))
				{
					group1.get(i).click();
					break;
				}
		}
		
		for (int i = 0; i < group2.size(); i++)
		{
			if (group2.get(i).getAttribute("value").equalsIgnoreCase("wine"))
				{
					group2.get(i).click();
					break;
				}
		}
		
		
	}

}
