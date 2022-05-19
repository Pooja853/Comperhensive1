package runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobject.Bedroom;
import Pageobject.CollectionPage;
import Pageobject.Footerpage;
import Pageobject.Giftcard;
import Pageobject.Kidsroom;
import Pageobject.Livingpage;
import Pageobject.Login;
import Pageobject.SearchPage;
import Pageobject.Studypage;
import Pageobject.TvUnitsPage;
import Pageobject.verifysofatext;
import utility.BaseClass;
import utility.Log4j;


public class TestCase extends BaseClass {
	@Test(priority=1)
		public void loginpage() {
		logger=report.createTest("login-We open");
		Login page=PageFactory.initElements(driver,Login.class);
		logger.info("Login 'We Accept' text in the login page");
		page.login();
		logger.pass("success");
	}
	@Test(priority=2)
	public void page1() {
		
		logger=report.createTest("Bedroom-AllNewArrivals");
		Bedroom page=PageFactory.initElements(driver,Bedroom.class);
		logger.info("Verifying 'AllNewArrivals'under bedroom page");
		page.newArrival();
		logger.pass("success");
	}
	
	@Test(priority=3)
	public void page2() throws InterruptedException {
		
		logger=report.createTest("Footer-We Accept");
		Footerpage page=PageFactory.initElements(driver,Footerpage.class);
		logger.info("searching 'We Accept' text in the footer page test");
		page.footer();
		logger.pass("success");
	}
	
	@Test(priority=4)
	public void page3() {
		
		logger=report.createTest("Gift-STARTS AT");
		Giftcard page=PageFactory.initElements(driver,Giftcard.class);
		logger.info("verify 'STARTS AT' text in giftcard page test");
		page.gift();
		logger.pass("text verified");
	}
	
	@Test(priority=5)
	public void page4() {
		
		logger=report.createTest("KidsRoom-KidsPlay Tables");
		Kidsroom page=PageFactory.initElements(driver,Kidsroom.class);
		logger.info("verify 'KidsPlay Tables' text in result page test");
		page.kid();
		logger.pass("text verified");
		
	}
	
	@Test(priority=6)
	public void page5() {
		
		logger=report.createTest("living-250 Products");
		Livingpage page=PageFactory.initElements(driver,Livingpage.class);
		logger.info("verify '250 Products' text under the top of heading test");
		page.room();
		logger.pass("text verified");
		
	}
	
	@Test(priority=7)
	public void page6() {
		
		logger=report.createTest("Search-Showcases");
		SearchPage page=PageFactory.initElements(driver,SearchPage.class);
		logger.info("verify the result of Showcases is opened ");
		page.search();
		logger.pass("text verified");
		
	}
	
	@Test(priority=8)
	public void page7() {
		
		logger=report.createTest("Study-Tablecolor");
		Studypage page=PageFactory.initElements(driver,Studypage.class);
		logger.info("verify 'Orange' text is displayed");
		page.study();
		logger.pass("text verified");
		
	}
	
	@Test(priority=9)
	public void page8() {
		
		logger=report.createTest("TvUnits-searchbox");
		TvUnitsPage page=PageFactory.initElements(driver,TvUnitsPage.class);
		logger.info("verify 'Tv unit' text is displayed in heading test");
		page.tvUnits();
		logger.pass("text verified");
		
	}
	
	@Test(priority=10)
	public void page9() {
		
		logger=report.createTest("sale-sofa");
		verifysofatext page=PageFactory.initElements(driver,verifysofatext.class);
		logger.info("verify 'kowloon' text is present in the high price sofa test");
		page.sofa();
		logger.pass("text verified");
	}
	
	@Test(priority=11)
	public void page10() {
		
		logger=report.createTest("Collections-exclusive");
		CollectionPage page=PageFactory.initElements(driver,CollectionPage.class);
		logger.info("verify 'UL Picks' text is present in the page");
		page.collection();
		logger.pass("text verified");
		Log4j.createLog();
	}
	
	
}

