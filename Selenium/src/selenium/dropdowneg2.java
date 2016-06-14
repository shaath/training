package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg2 {

	public static void main(String[] args)
    {
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		
		WebElement drop=driver.findElement(By.id("fromCity"));
		WebElement to=driver.findElement(By.id("toCity"));
		Select s=new Select(drop);
		
		Select p=new Select(to);
//		s.selectByValue("11|Mumbai");
		
//		s.selectByVisibleText("Mumbai");
		
		List<WebElement> fcity=s.getOptions();
		
		
		
		System.out.println(fcity.size());
		
		for (int i = 0; i < fcity.size(); i++)
		{
			s.selectByIndex(i);
//			System.out.println(fcity.get(i).getText());
			String fcitytext=fcity.get(i).getText();
			List<WebElement> tcity=p.getOptions();
			
			for (int j = 0; j < tcity.size(); j++)
			{
				p.selectByIndex(j);
//				System.out.println(tcity.get(j).getText());
				String tcitytext=tcity.get(j).getText();
				if (fcitytext.equalsIgnoreCase(tcitytext))
				{
					flag=true;
					break;
				}
				
			}
			if (flag)
			{
				System.out.println("Fromcity available in tocity");
				break;
				
			}
			
			
		}

	}

}
