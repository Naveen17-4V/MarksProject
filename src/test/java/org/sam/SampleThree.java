package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleThree {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Sev = new ChromeDriver();
	}
	

}
