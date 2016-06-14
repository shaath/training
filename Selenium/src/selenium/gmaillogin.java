package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		//findElement
		
		WebElement email=driver.findElement(By.id("Email"));
		//entering text into the text box
		email.sendKeys("sharathqedge449");
//		Sleeper.sleepTightInSeconds(5);
		//clear text inthe text box
//		email.clear();
		Sleeper.sleepTightInSeconds(5);
		//click on the textbox
		
//		email.click();
		
		
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		
	}

}
