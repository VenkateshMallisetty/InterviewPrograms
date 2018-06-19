package SamplePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Meda pramod Reddy\\Desktop\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.google.com");

	}

}
