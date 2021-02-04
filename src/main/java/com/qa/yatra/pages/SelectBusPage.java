package com.qa.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.yatra.base.BasePage;
import com.qa.yatra.utils.ElementUtil;

public class SelectBusPage extends BasePage {

	private WebDriver driver;
	ElementUtil elementUtil;

	// By Locator

	By Selectseat = By.xpath("//*[@id=\"busDesktop\"]/div/div[6]/div[3]/div/div[6]/button/div");

	// constructor of the page class:
	public SelectBusPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	// By Actions / Methods

	public SelectSeatPage selectBus() {
		elementUtil.clickWhenReady(Selectseat, 5);
		return new SelectSeatPage(driver);
	}
}
