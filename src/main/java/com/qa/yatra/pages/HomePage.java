package com.qa.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.yatra.base.BasePage;
import com.qa.yatra.utils.ElementUtil;

public class HomePage extends BasePage {

	private WebDriver driver;
	ElementUtil elementUtil;

	// By Locator

	By header = By.xpath("//*[@id=\"themeSnipe\"]/section/div[1]/div/div[1]/section/div/span");
	By buses = By.xpath("//*[@id=\"booking_engine_buses\"]");
	By from = By.xpath("//*[@id=\"BE_bus_from_station\"]");
	By fromClick = By
			.xpath("//*[@id=\"booking_engine_modues\"]/div/div[1]/div[2]/ul[1]/li[1]/div/div/ul/div/div/div/li[5]");
	By to = By.xpath("//*[@id=\"BE_bus_to_station\"]");
	By toClick = By
			.xpath("//*[@id=\"booking_engine_modues\"]/div/div[1]/div[2]/ul[1]/li[3]/div/div/ul/div/div/div/li[2]");
	By date = By.id("BE_bus_depart_date");
	By search = By.id("BE_bus_search_btn");
	By cookies = By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[1]/button");

	// constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	// By Actions / Methods

	public String getHomePageHeader() {

		return elementUtil.doGetText(header);
	}

	public SelectBusPage DeeptFromAndTo() {

		elementUtil.doClick(from);
		elementUtil.clickWhenReady(fromClick, 5);

		elementUtil.doClick(to);

		elementUtil.clickWhenReady(toClick, 5);
		elementUtil.doClick(search);

		return new SelectBusPage(driver);
	}
}
