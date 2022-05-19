package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.Newui;

public class Bedroom {

	WebDriver driver; 

	public Bedroom(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@SuppressWarnings("deprecation")
	public void newArrival() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(Newui.bed).click();
		driver.findElement(Newui.Allnew).click();
		driver.findElement(Newui.close).click();
		
		if(driver.getPageSource().contains("All New Arrivals")) {
			System.out.println("text is verified");
		}
			
		
	}
}
