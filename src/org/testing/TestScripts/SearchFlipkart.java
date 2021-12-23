package org.testing.TestScripts;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SearchFlipkart{

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "../FB_Project/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
  driver.get("http://www.flipkart.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  Actions act = new Actions(driver);
  WebElement mainmenu= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
  act.moveToElement(mainmenu).build().perform();//taking mouse
  WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
  mobiles.click();//clicking on mobiles
 
}}