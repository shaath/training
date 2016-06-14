package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class alerts {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		
		driver.findElement(By.id("loginbutton")).click();
		Sleeper.sleepTightInSeconds(5);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Sleeper.sleepTightInSeconds(5);
		alt.accept();
	}

}
