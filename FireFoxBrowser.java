package Tep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	

	 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.out.println("open the FF Browser");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("wait 5 minutes before close browser");
		driver.manage().window().maximize();
		driver.get("http://www.webloadmpstore.com");  
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("salam");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[2]/td[2]/input")).sendKeys("Tep Selenium");
		driver.findElement(By.name("email")).clear();
		//driver.findElement(By.name("email")).sendKeys("salam@msn.com");
		
		driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td[2]/input")).sendKeys("salam@msn.com");
		
		Thread.sleep(2000);
		 driver.findElement(By.name("phone")).clear();
		 driver.findElement(By.name("phone")).sendKeys("9737773404");
		
		//driver.findElement(By.name("Phone")).clear();
		//driver.findElement(By.name("phone")).sendKeys("9732225562");
		//driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[4]/td[2]/input")).sendKeys("9732225562");
		
		 driver.findElement(By.name("login")).clear();
		 driver.findElement(By.name("login")).sendKeys("Tep11");  
	     driver.findElement(By.name("password")).clear();
	     driver.findElement(By.name("password")).sendKeys("aqibsalam1");
		 driver.findElement(By.name("password2")).clear();
		 driver.findElement(By.name("password2")).sendKeys("aqibsalam1");
	     driver.findElement(By.name("Submit")).click();
 
		
		
		driver.close();
		
		//Thread.sleep(2000);
		//System.out.println("close the FF Browser");
		System.out.println("The test passed");
		
		//Thread.sleep(2000);
		
		//driver.quit();

	}

}
