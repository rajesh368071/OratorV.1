package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC010 extends AllScenario {
	
	public void verifyCategoryUpdate() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		category.clickCategory();
		category.clickNewCategory();
		
		String categoryName = fakedata.getRandomWord();
		category.enterCategoryName(categoryName);
		category.enterSubCategoryName(fakedata.getRandomWords(3));
		category.clickSubmit();
		ToastDisplayed("Category Created");
		
		String categoryNewName = fakedata.getRandomWord();
		category.clickEdit(categoryName);
		category.enterCategoryName(categoryNewName);
		category.clickSubmit();
		
		assertEquals(ToastDisplayed("Category Updated"), true);
		
		assertEquals(category.categoryDisplayed(categoryNewName), true);
		
	}
	
}
