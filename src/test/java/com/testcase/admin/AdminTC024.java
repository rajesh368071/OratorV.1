package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

public class AdminTC024 extends AllScenario {
	
	public void verifyNewFieldAddToDataCaptureForm() throws IOException, InterruptedException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		if(!isCheckBoxChecked(welcome.L_datacapture_checkbox_input)) {
			welcome.clickDataCaptureCheckBox();
		}
		
		welcome.clickAddIcon();
		String fieldname = fakedata.getRandomWord();
		welcome.enterFieldName(fieldname);
		welcome.selectFieldType("Text");
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		By path = By.xpath("//input[@data-placeholder='"+fieldname+"']");
		
		assertEquals(ElementDisplayed(path), true);
		
		SwitchToTab(0);
		
		welcome.clickDeleteIcon();
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
	}

}
