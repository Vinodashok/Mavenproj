package com.jenkins.testing.Jenkinstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void first()
    {
    	//System.setProperty("webdriver.chrome.driver","E:\\CTS\\Jenkins and Git\\Jenkinstest\\Drivers\\chromedriver.exe" );
		WebDriverManager.chromedriver().setup();
    	WebDriver d=new ChromeDriver();
    	d.get("https://www.google.co.in/");
    }
    
}
