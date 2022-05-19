package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.KidsUi;

public class Kidsroom {

	WebDriver driver; 

	public Kidsroom(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void kid() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(KidsUi.kid).click();
	driver.findElement(KidsUi.play).click();
	
	if(driver.getPageSource().contains("Kids Play Tables")) {
		System.out.println("text is verified");
	}


	}
}