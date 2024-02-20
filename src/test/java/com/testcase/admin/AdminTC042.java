package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class AdminTC042 extends AllScenario {
	
	public void verifyBrandLogo(Map<Object, Object> map) throws InterruptedException {
		
		commonoption.clickSetting();
		theme.clickSystem();
		theme.clickTheme();
		//ascdacscsccx csdcsd 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
		theme.uploadBrandLogo("C:\\Users\\rajesh.ganesh\\Downloads\\Orator\\cms_User\\src\\test\\resources\\BrandLogo.png");
		theme.clickApplyChanges();
		
		assertEquals(ToastDisplayed("Logo updated successfully. Kindly refresh page."), true);
		assertEquals(ToastDisplayed("Changes applied successfully. Kindly refresh page and check."), true);
		
	}

}
