package com.qa.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.yatra.base.BasePage;
import com.qa.yatra.utils.ElementUtil;

public class SelectSeatPage extends BasePage {

	private WebDriver driver;
	ElementUtil elementUtil;

	// By Locator

	By seat = By.xpath("//*[@id=\"tab-lower\"]/div/div/div[2]/ul[4]/li[5]");
	By board = By.xpath("//*[@id=\"city\"]/div/div/div[1]/div/select");
	By drop = By.xpath("//*[@id=\"city\"]/div/div/div[2]/div/select");
	By confirm = By.xpath("//*[@id=\"city\"]/div/div/button/div");

	// constructor of the page class:
	public SelectSeatPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	// By Actions / Methods
	
	public ReviewBookingPage selectSeat(){
		
		elementUtil.doClick(seat);
		elementUtil.doSelectValuesByIndex(board, 1);
		elementUtil.doSelectValuesByIndex(drop, 2);
		elementUtil.doClick(confirm);
		
		return new ReviewBookingPage(driver);
		
	}

}
