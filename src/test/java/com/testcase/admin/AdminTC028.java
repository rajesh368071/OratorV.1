package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class AdminTC028 extends AllScenario {
	
	public void verifyNewHolidayGroupCreatedAndDisplayed() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		holidaygroup.clickHolidayGroupMenu();
		
		WaitForElementToBeVisible(holidaygroup.L_holiday_group_title);
		
		holidaygroup.clickNew();
		String holidayName = "Holiday_"+fakedata.getCountry();
		holidaygroup.enterName(holidayName);
		holidaygroup.selectRegion("Africa");
		List<String> roles = new ArrayList<String>();
		roles.add("Agent");
		roles.add("Supervisor");
		Thread.sleep(1000);
		holidaygroup.selectRole(roles);
		holidaygroup.clickSubmit();
		
		assertEquals(ToastDisplayed("Holiday Group Created"), true);
		
		holidaygroup.searchInTable(holidayName);
	}

}
