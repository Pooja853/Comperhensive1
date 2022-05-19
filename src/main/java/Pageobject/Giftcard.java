package Pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.GiftUi;

public class Giftcard {

	WebDriver driver; 

	public Giftcard(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void gift() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(GiftUi.gift).click();
	
	if(driver.getPageSource().contains("STARTS AT")) {
		System.out.println("text is verified");
	}
	}
}

