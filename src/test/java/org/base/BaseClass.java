package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver Sev;
		
	public static void launchBroweser() {
		WebDriverManager.chromedriver().setup();
		Sev = new ChromeDriver();
	}
	
	public static void window() {
	Sev.manage().window().maximize();
	}
	
	public static void send(String Url) {
		Sev.get(Url);
	}
	
	public static void title() {
	String title = Sev.getTitle();
	System.out.println(title);
	}
	public static void url() {
	String url = Sev.getCurrentUrl();
	System.out.println(url);
	}
	
	public static void sendkey(String txt, WebElement als) {
		als.sendKeys(txt);	}
	
	public static void close() {
	Sev.close();		
	}
	
	public static void Break() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void KeyAct() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void Screen() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)Sev;
		File Cl = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\91812\\eclipse-workspace\\MavenOnes\\Screenshot\\Amazon.png");
		FileUtils.copyFile(f, Cl);
	}

}
