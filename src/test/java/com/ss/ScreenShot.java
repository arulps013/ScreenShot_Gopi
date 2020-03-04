package com.ss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUL\\eclipse-workspace\\ScreenShot\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot s=(TakesScreenshot)driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\ARUL\\eclipse-workspace\\ScreenShot\\ss\\gopi.png");
		try {
			FileUtils.copyFile(screenshotAs, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
