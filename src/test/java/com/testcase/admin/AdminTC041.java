package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.By;

public class AdminTC041 extends AllScenario {
	
	public void verifyApplyThemes(Map<Object, Object> map) throws InterruptedException {
		
		commonoption.clickSetting();
		theme.clickSystem();
		theme.clickTheme();
		
		String index = map.get("Theme").toString();
		
		theme.clickSelectTheme(index);
		
		theme.clickApplyTheme();
		
		refresh();
		
		String value = GetBackgroundColor(By.xpath("//div[@class='notification__count']"));
		
		if(index.equals("1")) {
			assertEquals(value, "#feba12");
		} else {
			assertEquals(value, "#e21818");
		}
		
		
	}

}
