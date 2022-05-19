package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.RoomUi;

public class Livingpage {

	WebDriver driver; 

	public Livingpage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void room() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();
	
	driver.findElement(RoomUi.room).click();
	driver.findElement(RoomUi.table).click();
	
	if(driver.getPageSource().contains("250 Products")) {
		System.out.println("text is verified");
	}
	
	}
}