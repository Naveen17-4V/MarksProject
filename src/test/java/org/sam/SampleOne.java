package org.sam;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleOne extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		launchBroweser();
		window();
		send("https://www.amazon.in/");
		WebElement search = Sev.findElement(By.xpath("//input[@dir='auto']"));
		sendkey("iphone", search);
		KeyAct();
		Screen();
		//WebElement Cli = Sev.findElement(By.xpath("//input[@type='submit']"));
		//Cli.click();
		//Break();
		//title();
		//url();
		//close();
	}
}
