package com.common.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;

public class CommonTC001 extends AllScenario {
	
	public void verifyProfilePage(Map<Object, Object> map) throws IOException {
		
		profile.clickUsernameDropdown();
		profile.clickProfileOption();
		
		WaitForElementToBeVisible(By.xpath("//div[contains(@class,'profile__email')]/span"));
		
		assertEquals(GetElementText(By.xpath("//div[contains(@class,'profile__email')]/span")), configloader().getProperty("Agent_UserName"));
		
	}

}
