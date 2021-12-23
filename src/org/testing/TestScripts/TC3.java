package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../FB_Project/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.name("email")).sendKeys("jhalakkhurana06@gmail.com");
		d.findElement(By.name("pass")).sendKeys("Attra@555");
		d.findElement(By.name("login")).click();
		d.manage().window().maximize();
		Thread.sleep(9000);
		d.findElement(By.xpath("//div[@aria-label ='Account']")).click();
		Thread.sleep(9000);
		d.findElement(By.xpath("//span[@class = 'd2edcug0 hpfvmrgz qv66sw1b c1et5uql rrkovp55 a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v knj5qynh m9osqain hzawbc8m']")).click();
	System.out.print("Sucessfully opened the profile");
	Thread.sleep(9000);
	d.findElement(By.xpath("//div[@aria-label ='Account']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//span[contains(text(), 'Log Out')]")).click();
	System.out.println("Sucessfully logged Out");
	d.close();
	
	}

}
