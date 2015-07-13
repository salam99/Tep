package Tep;
//package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactUs {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = false;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.tepeople.com";
    long millis = 0;
	Thread.sleep(millis);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Contact US")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("tep");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("salam");
    driver.findElement(By.name("phone_no")).clear();
    driver.findElement(By.name("phone_no")).sendKeys("9732225562");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("salam99@gmail.com");
    driver.findElement(By.name("training_program")).clear();
    driver.findElement(By.name("training_program")).sendKeys("selenium2");
    driver.findElement(By.name("comment")).clear();
    driver.findElement(By.name("comment")).sendKeys("I wanted to learn Selenium.");
    driver.findElement(By.cssSelector("div.btn > input[type=\"submit\"]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
