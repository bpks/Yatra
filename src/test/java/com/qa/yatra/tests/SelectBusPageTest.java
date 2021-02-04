package com.qa.yatra.tests;

import org.testng.annotations.Test;

import com.qa.yatra.base.BaseTest;
import com.qa.yatra.pages.SelectBusPage;

public class SelectBusPageTest extends BaseTest{
	
	@Test
	
	public void selectBus() {
		
		selectBusPage.selectBus();
	}
	

}
