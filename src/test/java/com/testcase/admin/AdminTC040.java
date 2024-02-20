package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class AdminTC040 extends AllScenario {
	
	public void verifyBusinessHoursInfo(Map<Object, Object> map) throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		
		businessHours.clickBusinessHoursMenu();
		
		WaitForElementToBeVisible(businessHours.L_new_business_hours);
		
		businessHours.hoverInfo();
		
		assertEquals(ElementDisplayed(businessHours.L_tooltip), true);
		
	}

}
