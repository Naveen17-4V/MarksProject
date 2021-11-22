package org.sam;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTwo extends BaseClass {
	
	public static void main(String[] args) {
	
		launchBroweser();
		window();
		send("https://www.redbus.in/");
		WebElement san = Sev.findElement(By.xpath("(//input[@class='db'])[1]"));
		sendkey("Salem", san);
		title();
		url();
	}
	
	
}
