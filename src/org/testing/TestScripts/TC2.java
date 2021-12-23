package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
import org.testing.pages.Login;
import org.testing.screenshots.CaptureScreenshots;
import org.testng.annotations.Test;

public class TC2 extends BaseClass {
@Test
public void tc2() throws InterruptedException, IOException
{
Login l = new Login(d,pr);
l.signup("jhalakkhurana06@gmail.com", "Attra@555");
		//d.findElement(By.name("email")).sendKeys("jhalakkhurana06@gmail.com");
		//d.findElement(By.name("pass")).sendKeys("Attra@555");
		d.findElement(By.name("login")).click();
		Thread.sleep(9000);
		d.findElement(By.xpath("//div[@aria-label ='Account']")).click();
		Thread.sleep(5000);
		d.findElement(By.linkText("Jhalak Khurana Diwan")).click();
	System.out.print("Sucessfully opened the profile");
	Thread.sleep(9000);
	d.findElement(By.linkText("Bangalore, India")).click();
	d.findElement(By.xpath("//div[@aria-label ='Account']")).click();
	CaptureScreenshots.takeScreenshot(d, "C:\\Users\\Ishan\\Desktop\\Java_Selenium_setup\\Screenshots\\ScreenShot1.png");

}

}
