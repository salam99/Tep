package Tep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("open the FF Browser");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Please wait for 5 minute");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		System.out.println("close the FF Browser");
		System.out.println("The test passed");
		
		driver.close();
		

	}

}
