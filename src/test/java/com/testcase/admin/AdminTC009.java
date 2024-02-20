package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC009 extends AllScenario {
	
	public void verifyCreateNewCategory() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		category.clickCategory();
		category.clickNewCategory();
		
		String categoryName = fakedata.getRandomWord();
		category.enterCategoryName(categoryName);
		category.enterSubCategoryName(fakedata.getRandomWords(3));
		category.clickSubmit();
		
		assertEquals(ToastDisplayed("Category Created"), true);
		
		assertEquals(category.categoryDisplayed(categoryName), true);
	}

}
