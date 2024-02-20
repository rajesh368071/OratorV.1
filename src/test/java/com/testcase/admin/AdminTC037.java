package com.testcase.admin;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

public class AdminTC037 extends AllScenario {
	
	public void verifyConfigurationEmoji(Map<Object, Object> map) throws InterruptedException, IOException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		configuration.clickConfigurationMenu();
		configuration.clickEmojiEdit();
		if(!isCheckBoxChecked(configuration.L_emoji_switch_input)) {
			configuration.clickEmojiSwitch();
			log.info("True");
		}
		configuration.clickCancel();
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		String firstname = fakedata.getFirstName();
		String email = fakedata.getEmail();
		
		webchat.enterFirstName(firstname);
		webchat.enterEmail(email);
		webchat.clickSubmit();
		
		
	}

}
