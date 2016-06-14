package selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ielaunch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		
		InternetExplorerDriver d=new InternetExplorerDriver();
		
		d.get("http://google.com");
		

	}

}
