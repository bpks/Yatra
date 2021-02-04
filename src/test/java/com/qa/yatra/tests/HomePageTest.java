package com.qa.yatra.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.yatra.base.BaseTest;
import com.qa.yatra.utils.Constants;

public class HomePageTest extends BaseTest {

	@Test
	public void verifyHomePageHeaderTest() {
		String header = homePage.getHomePageHeader();
		System.out.println("home page header is : " + header);
		Assert.assertEquals(header, Constants.HOME_PAGE_HEADER);

	}

	@Test

	public void verifyDeptandTobuses() {

		homePage.DeeptFromAndTo();

	}
}