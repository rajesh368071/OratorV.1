package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

public class AdminTC029 extends AllScenario {
	
	public void verifyHolidayGroupUpdate() throws InterruptedException {
		
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
		
		ToastDisplayed("Holiday Group Created");
		
		holidaygroup.getPage();
		holidaygroup.clickEdit(holidayName);
		
		String holidayName2 = fakedata.getCountry();
		clear(holidaygroup.L_name);
		holidaygroup.enterName(holidayName2);
		holidaygroup.clickSubmit();
		
		assertEquals(ToastDisplayed("Holiday Group Updated"), true);
		Thread.sleep(2000);
		
		By record = By.xpath("//td[normalize-space()='"+holidayName2+"']/../td[5]//button[contains(.,'edit')]");
		
		assertEquals(ElementDisplayed(record), true);
		
	}

}
