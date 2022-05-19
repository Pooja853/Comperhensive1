package Pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.LoginUi;
import Uistore.SearchUi;
import utility.ExcelDataProvider;

public class Login {

	WebDriver driver; 

	public Login(WebDriver driver) {
		
		this.driver=driver;
	}
	public void login() {
		
		
		//driver.navigate().back();
		
		ExcelDataProvider excel=new ExcelDataProvider();
		@SuppressWarnings("unused")
		String data=excel.getStringData("Input", 0, 0);
		
		//driver.findElement(SearchUi.input).sendKeys(data);
		driver.findElement(LoginUi.click1).click();
		
		driver.findElement(LoginUi.clickligin).click();
		driver.findElement(LoginUi.username).sendKeys("poojapruthvi1@gmail.com");
		driver.findElement(LoginUi.password).sendKeys("Pooja@123");
		driver.findElement(LoginUi.login).click();
		
		
		}

	
}
