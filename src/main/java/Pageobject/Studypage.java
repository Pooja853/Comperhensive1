package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.StudyUi;

public class Studypage {

	WebDriver driver; 

	public Studypage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void study() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().back();//driver.navigate().back();
	
	driver.findElement(StudyUi.stu).click();
	driver.findElement(StudyUi.lamp).click();
	driver.findElement(StudyUi.brand).click();
	driver.findElement(StudyUi.orange).click();
	
	if(driver.getPageSource().contains("Orange")) {
		System.out.println("text is verified");
	}
	
	}
}
