package Uistore;

import org.openqa.selenium.By;

public class LoginUi {

	public static By click1=By.xpath("//span[@class='header-icon-link user-profile-icon']");
	public static By clickligin=By.linkText("Log In");
	public static By username=By.xpath("//form[@name='login_form']/descendant::input[@type='email']");
	public static By password=By.xpath("//form[@name='login_form']/descendant::input[@type='password']");
	public static By login=By.xpath("//*[@id=\"ul_site_login\"]");
}
