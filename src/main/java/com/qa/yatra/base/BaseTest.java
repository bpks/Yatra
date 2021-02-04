package com.qa.yatra.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.yatra.pages.HomePage;
import com.qa.yatra.pages.ReviewBookingPage;
import com.qa.yatra.pages.SelectBusPage;
import com.qa.yatra.pages.SelectSeatPage;



public class BaseTest {

	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public SelectBusPage selectBusPage;
	public SelectSeatPage selectSeatPage;
	public HomePage homePage;
	public ReviewBookingPage reviewBookingPage;

	@Parameters("browser")
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		homePage = new HomePage(driver);
		selectBusPage = homePage.DeeptFromAndTo();
		selectSeatPage = selectBusPage.selectBus();
		reviewBookingPage = selectSeatPage.selectSeat();
	} 

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

