package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC011 extends AllScenario {
	
	public void verifyCategoryTooltip() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		category.clickCategory();
		
		WaitForElementToBeVisible(category.L_category_title);
		
		category.hoverInfo();
		
		assertEquals(ElementDisplayed(category.L_tooltip), true);
		
	}
	
}
