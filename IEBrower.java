package Tep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrower {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Selenium\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(); 
		
		
		driver.manage().window().maximize();
		 driver.get("http://www.webloadmpstore.com");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("LOGIN")).sendKeys(Keys.ENTER);
		// driver.findElement(By.linkText("LOGIN")).click();
		 
		// driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).sendKeys(Keys.ENTER);
		  driver.findElement(By.linkText("LOGIN")).sendKeys(Keys.ENTER);
		 driver.findElement(By.linkText("Register")).click();
		long currentTime = System.currentTimeMillis();
		
		 driver.findElement(By.name("name")).clear();
		 driver.findElement(By.name("name")).sendKeys("Mo");
		 driver.findElement(By.name("email")).clear();
		 driver.findElement(By.name("email")).sendKeys("salam99@gmail.com");
		 driver.findElement(By.name("phone")).clear();
		 driver.findElement(By.name("phone")).sendKeys("9732225562");
		 driver.findElement(By.name("login")).clear();
		 driver.findElement(By.name("login")).sendKeys("clifton" + currentTime);
		 Thread.sleep(6000);
		 driver.findElement(By.name("password")).clear();
		 driver.findElement(By.name("password")).sendKeys("paterson1");
		 driver.findElement(By.name("password2")).clear();
		 driver.findElement(By.name("password2")).sendKeys("paterson1");
		  
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("The test is passed. ");
		 System.out.println("Selenium is awesome!");
		 Thread.sleep(2000);
		 driver.close();
		 

	}

}



