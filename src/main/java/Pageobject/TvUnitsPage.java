package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utility.ExcelDataProvider;

import Uistore.TvUi;

public class TvUnitsPage {

	WebDriver driver; 

	public TvUnitsPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
@SuppressWarnings("deprecation")
public void tvUnits() {
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.navigate().back();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,0)");
	
	ExcelDataProvider excel=new ExcelDataProvider();
	String data=excel.getStringData("Input", 1, 0);
	
	driver.findElement(TvUi.input).sendKeys(data);
	driver.findElement(TvUi.click).click();
	
	if(driver.getPageSource().contains("Tv Unit"))
	{
		System.out.println("text verified");
	}
	
	}
}

