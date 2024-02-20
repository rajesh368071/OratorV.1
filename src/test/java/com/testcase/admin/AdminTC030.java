package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC030 extends AllScenario {
	
	public void verifyHolidayGroupInfo() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		
		holidaygroup.clickHolidayGroupMenu();
		
		WaitForElementToBeVisible(holidaygroup.L_holiday_group_title);
		
		holidaygroup.hoverInfo();
		
		assertEquals(ElementDisplayed(holidaygroup.L_tooltip), true);
		
	}

}
