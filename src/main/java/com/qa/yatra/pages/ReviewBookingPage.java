package com.qa.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.yatra.base.BasePage;
import com.qa.yatra.utils.ElementUtil;

public class ReviewBookingPage extends BasePage{
	
	private WebDriver driver;
	ElementUtil elementUtil;
	
	//By Locator
	
	By email = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[1]/div[2]/div/div[1]/div/p[1]/input");
	By mobile = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/input");
	By name = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[2]/div/div/div/div[2]/div/div[1]/div/div/input");
	By gender = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[2]/div/div/div/div[2]/div/div[2]/select");
	By age = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[2]/div/div/div/div[2]/div/div[3]/select");
	By proceed = By.xpath("//*[@id=\"busDesktop\"]/div/div[3]/div/button/div");
	
	// constructor of the page class:
		public ReviewBookingPage(WebDriver driver){
			this.driver = driver;
			elementUtil = new ElementUtil(this.driver);
		}
	
	//By Actions / Methods	
	public void reviewBooking() {
		elementUtil.doSendKeys(email, "hello@gmails.com");
		elementUtil.doSendKeys(mobile, "83292382349");
		elementUtil.doSendKeys(name, "sciripappa");
		elementUtil.doSelectValuesByIndex(gender, 1);
		elementUtil.doSelectValuesByVisibleText(age, "19");
		elementUtil.doClick(proceed);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	

}
