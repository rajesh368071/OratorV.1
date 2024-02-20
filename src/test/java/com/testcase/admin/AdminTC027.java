package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC027 extends AllScenario {
	
	public void verify() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		holidaygroup.clickHolidayGroupMenu();
		
		WaitForElementToBeVisible(holidaygroup.L_holiday_group_title);
		
		assertEquals(ElementDisplayed(holidaygroup.L_holiday_group_title), true);
		
		/*
		
		holidaygroup.enterName(holidayName);
		holidaygroup.selectRegion();
		holidaygroup.searchInTable("Streich and Sons");*/
		
		
	}

}
