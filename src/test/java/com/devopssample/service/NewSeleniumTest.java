package com.devopssample.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewSeleniumTest {

  WebDriver driver;

  @Test()
  public void amazonTest() {
System.setProperty("webdriver.chrome.driver",
        System.getProperty("user.dir") + "/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String text = driver.findElement(By.xpath("//*[@class='sg-col-inner']/div/span[3]")).getText();
    Assert.assertEquals(text, "phone");
  }
}
