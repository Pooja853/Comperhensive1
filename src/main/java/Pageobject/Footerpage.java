package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Footerpage {

	WebDriver driver; 

	public Footerpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@SuppressWarnings("deprecation")
	public void footer() {
	driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	if(driver.getPageSource().contains("We Accept")) {
		System.out.println("text is verified");
	}
	
	}
}