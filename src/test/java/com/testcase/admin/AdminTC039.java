package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class AdminTC039 extends AllScenario {
	
	public void VerifyeEditBusinessHours(Map<Object, Object> map) throws InterruptedException {
		commonoption.clickSetting();
		commonoption.clickGeneral();
		
		businessHours.clickBusinessHoursMenu();
		businessHours.clickNew();
		String companyName = fakedata.getCompany();
		businessHours.enterBusinessHoursGroup(companyName);
		businessHours.selectTimeZone(map.get("Time Zone").toString());
		businessHours.selectStatus(map.get("Status").toString());
		businessHours.enterStartTime(map.get("Start_Time").toString());
		businessHours.enterEndTime(map.get("End_Time").toString());
		businessHours.selectFrom(map.get("From").toString());
		businessHours.selectTo(map.get("to").toString());
		businessHours.clickSubmit();
		
		assertEquals(ToastDisplayed("Business Hours Created"), true);
		
		assertEquals(businessHours.businessHoursDisplayed(companyName), true);
		
		businessHours.clickEdit("Smart");
		String newCompanyName = fakedata.getCompany();
		businessHours.enterBusinessHoursGroup(newCompanyName);
		businessHours.clickSubmit();
		
		assertEquals(ToastDisplayed("Business Hours Updated"), true);
		
		assertEquals(businessHours.businessHoursDisplayed(newCompanyName), true);
		
	}

}
