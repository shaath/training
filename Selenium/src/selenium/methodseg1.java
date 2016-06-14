package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class methodseg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().to("http://gmail.com");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();

	}

}
