package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class AdminTC006 extends AllScenario {

	public void verifyEditWorks(Map<Object, Object> map) throws InterruptedException {
		
		usermanagement.clickUserManagementMenu();
		usermanagement.clickNewUser();
		
		String firstname = fakedata.getFirstName();
		
		usermanagement.enterFirstName(firstname);
		usermanagement.enterLastName(fakedata.getLastname());
		usermanagement.enterEmail(fakedata.getEmail());
		usermanagement.selectRole(map.get("Role").toString());
		usermanagement.enterPhone(fakedata.getPhone());
		usermanagement.selectGroup(map.get("Group").toString());
		usermanagement.selectBusinessHours(map.get("Business_hours").toString());
		usermanagement.selectHolidayGroup(map.get("Holiday_group").toString());
		usermanagement.clickSubmit();
		
		ToastDisplayed("User Created");
		
		usermanagement.enterSearch(firstname);
		usermanagement.clickSearch();
		
		usermanagement.clickEdit(firstname);
		String editFirstname = fakedata.getFirstName();
		usermanagement.enterFirstName(editFirstname);
		usermanagement.clickSubmit();
		
		usermanagement.enterSearch(editFirstname);
		usermanagement.clickSearch();
		
		assertEquals(ToastDisplayed("User Updated"), true);
		
		assertEquals(usermanagement.userDisplayed(editFirstname), true);
	}
	
}
