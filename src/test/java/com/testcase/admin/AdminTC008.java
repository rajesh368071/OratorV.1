package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC008 extends AllScenario {
	
	public void verifyCategoryDisplayed() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		category.clickCategory();
		
		assertEquals(ElementDisplayed(category.L_category_title), true);
	}
	
}
