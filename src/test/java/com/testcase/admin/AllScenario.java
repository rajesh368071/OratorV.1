package com.testcase.admin;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Map;


import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Admin.BusinessHoursPage;
import com.Admin.CategoryPage;
import com.Admin.ConfigurationPage;
import com.Admin.FAQPage;
import com.Admin.HolidayGroupPage;
import com.Admin.QuickReplyPage;
import com.Admin.ThemesPage;
import com.Admin.UserManagementPage;
import com.Admin.WelcomePage;
import com.BasePackage.Base_Class;
import com.Utility.ExcelReader;
import com.Utility.FakeData;
import com.Utility.Log;
import com.Webchat.WebchatPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.common.AdminCommonPage;
import com.common.ProfilePage;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.google.gson.Gson;
import com.listeners.TestListener;


public class AllScenario extends Base_Class{
	
	TestListener TestListener;
	Base_Class Base_Class;
	Log log;
	SoftAssert softAssertion;
	FakeData fakedata = new FakeData();
	com.Utility.ScreenShot screenShot;
	ExcelReader excel;
	
	AdminCommonPage commonoption = new AdminCommonPage();
	ProfilePage profile = new ProfilePage();
	UserManagementPage usermanagement = new UserManagementPage();
	CategoryPage category = new CategoryPage();
	QuickReplyPage quickreply = new QuickReplyPage();
	ConfigurationPage configuration = new ConfigurationPage();
	WelcomePage welcome = new WelcomePage();
	HolidayGroupPage holidaygroup = new HolidayGroupPage();
	BusinessHoursPage businessHours = new BusinessHoursPage();
	FAQPage faqbank = new FAQPage();
	WebchatPage webchat = new WebchatPage();
	ThemesPage theme = new ThemesPage();
	

	AdminTC001 tc001;
	AdminTC002 tc002;
	AdminTC003 tc003;
	AdminTC004 tc004;
	AdminTC005 tc005;
	AdminTC006 tc006;
	AdminTC007 tc007;
	AdminTC008 tc008;
	AdminTC009 tc009;
	AdminTC010 tc010;
	AdminTC011 tc011;
	AdminTC012 tc012;
	AdminTC013 tc013;
	AdminTC014 tc014;
	AdminTC015 tc015;
	AdminTC016 tc016;
	AdminTC017 tc017;
	AdminTC018 tc018;
	AdminTC019 tc019;
	AdminTC020 tc020;
	AdminTC021 tc021;
	AdminTC022 tc022;
	AdminTC023 tc023;
	AdminTC024 tc024;
	AdminTC025 tc025;
	AdminTC026 tc026;
	AdminTC027 tc027;
	AdminTC028 tc028;
	AdminTC029 tc029;
	AdminTC030 tc030;
	AdminTC031 tc031;
	AdminTC032 tc032;
	AdminTC033 tc033;
	AdminTC034 tc034;
	AdminTC035 tc035;
	AdminTC037 tc037;
	AdminTC038 tc038;
	AdminTC039 tc039;
	AdminTC040 tc040;
	AdminTC041 tc041;
	AdminTC042 tc042;
	
	public void KillChrome() throws IOException, InterruptedException {
		driver.quit();
		Process process = Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		int exitCode = process.waitFor();
		if(exitCode ==0) {
		}else {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		}
	}
	
	
	@BeforeClass
	public void reference() throws InterruptedException, IOException {
		excel = new ExcelReader("Admin");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		softAssertion = new SoftAssert();
		
		tc001 = new AdminTC001();
		tc002 = new AdminTC002();
		tc003 = new AdminTC003();
		tc004 = new AdminTC004();
		tc005 = new AdminTC005();
		tc006 = new AdminTC006();
		tc007 = new AdminTC007();
		tc008 = new AdminTC008();
		tc009 = new AdminTC009();
		tc010 = new AdminTC010();
		tc011 = new AdminTC011();
		tc012 = new AdminTC012();
		tc013 = new AdminTC013();
		tc014 = new AdminTC014();
		tc015 = new AdminTC015();
		tc016 = new AdminTC016();
		tc017 = new AdminTC017();
		tc018 = new AdminTC018();
		tc019 = new AdminTC019();
		tc020 = new AdminTC020();
		tc021 = new AdminTC021();
		tc022 = new AdminTC022();
		tc023 = new AdminTC023();
		tc024 = new AdminTC024();
		tc025 = new AdminTC025();
		tc026 = new AdminTC026();
		tc027 = new AdminTC027();
		tc028 = new AdminTC028();
		tc029 = new AdminTC029();
		tc030 = new AdminTC030();
		tc031 = new AdminTC031();
		tc032 = new AdminTC032();
		tc033 = new AdminTC033();
		tc034 = new AdminTC034();
		tc035 = new AdminTC035();
		tc037 = new AdminTC037();
		tc038 = new AdminTC038();
		tc039 = new AdminTC039();
		tc040 = new AdminTC040();
		tc041 = new AdminTC041();
		tc042 = new AdminTC042();
	}

	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata,ITestContext context) throws Throwable {
		
		try {
			String TestScenario = testdata.get("Test_ID").toString();
			if (testdata.get("Run").toString().equalsIgnoreCase("Yes") && TestScenario.contains("TC")) {
				ExtentTestManager.startTest(testdata.get("Description").toString());
				System.out.println("\n");
				System.out.println("<--------------------------------------- START NEW TESTCASE --------------------------------------------------------->");
				ExtentSuccessMessage("*** Running test method " + TestScenario + "...");
				Log.info("*** Running test method " + TestScenario + "...");
 
				switch (TestScenario) {
				
				case "TC001":
					context.setAttribute("fileName", "Login");
					Login();
					tc001.verifyUserManagementDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC002":
					context.setAttribute("fileName", "Login");
					Login();
					tc002.verifyCreateNewUserPopUp(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC003":
					context.setAttribute("fileName", "Login");
					Login();
					tc003.verifyCreatedUserDisplayedInTable(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC004":
					context.setAttribute("fileName", "Login");
					Login();
					tc004.verifyStatusChangePopUp();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC005":
					context.setAttribute("fileName", "Login");
					Login();
					tc005.verifyGeneratePassword();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC006":
					context.setAttribute("fileName", "Login");
					Login();
					tc006.verifyEditWorks(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC007":
					context.setAttribute("fileName", "Login");
					Login();
					tc007.verifyInfoDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC008":
					context.setAttribute("fileName", "Login");
					Login();
					tc008.verifyCategoryDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC009":
					context.setAttribute("fileName", "Login");
					Login();
					tc009.verifyCreateNewCategory();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC010":
					context.setAttribute("fileName", "Login");
					Login();
					tc010.verifyCategoryUpdate();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC011":
					context.setAttribute("fileName", "Login");
					Login();
					tc011.verifyCategoryTooltip();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC012":
					context.setAttribute("fileName", "Login");
					Login();
					tc012.verifyQuickReplyDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC013":
					context.setAttribute("fileName", "Login");
					Login();
					tc013.verifyNewQuickReplyCreated();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC014":
					context.setAttribute("fileName", "Login");
					Login();
					tc014.verifyQuickReplyUpdate();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC015":
					context.setAttribute("fileName", "Login");
					Login();
					tc015.verifyQuickReplyTooltip();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC016":
					context.setAttribute("fileName", "Login");
					Login();
					tc016.verifyWelcomePageDisplaye();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC017":
					context.setAttribute("fileName", "Login");
					Login();
					tc017.verifyFAQIsDisplayedIfEnabled();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC018":
					context.setAttribute("fileName", "Login");
					Login();
					tc018.verifyFAQNotDisplayedIfDisabled();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC019":
					context.setAttribute("fileName", "Login");
					Login();
					tc019.verifyOpeningMessage();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC020":
					context.setAttribute("fileName", "Login");
					Login();
					tc020.verifyDataCaptureFormDisplayedIfEnabled();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC021":
					context.setAttribute("fileName", "Login");
					Login();
					tc021.verifyDataCaptureNotDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC022":
					context.setAttribute("fileName", "Login");
					Login();
					tc022.verifyGoAnonymousDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC023":
					context.setAttribute("fileName", "Login");
					Login();
					tc023.verifyGoAnonymousNotDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC024":
					context.setAttribute("fileName", "Login");
					Login();
					tc024.verifyNewFieldAddToDataCaptureForm();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC025":
					context.setAttribute("fileName", "Login");
					Login();
					tc025.verifyClickWrapDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC026":
					context.setAttribute("fileName", "Login");
					Login();
					tc026.verifyClickwrapContentSame();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC027":
					context.setAttribute("fileName", "Login");
					Login();
					tc027.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC028":
					context.setAttribute("fileName", "Login");
					Login();
					tc028.verifyNewHolidayGroupCreatedAndDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC029":
					context.setAttribute("fileName", "Login");
					Login();
					tc029.verifyHolidayGroupUpdate();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC030":
					context.setAttribute("fileName", "Login");
					Login();
					tc030.verifyHolidayGroupInfo();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC031":
					context.setAttribute("fileName", "Login");
					Login();
					tc031.verifyFAQBankPageDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC032":
					context.setAttribute("fileName", "Login");
					Login();
					tc032.verifyFAQBankPageDisplayed();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC033":
					context.setAttribute("fileName", "Login");
					Login();
					tc033.verifyFAQEdit();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC034":
					context.setAttribute("fileName", "Login");
					Login();
					tc034.verifyFAQSearchWorks();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC035":
					context.setAttribute("fileName", "Login");
					Login();
					tc035.verifyFAQInfo();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC037":
					context.setAttribute("fileName", "Login");
					Login();
					tc037.verifyConfigurationEmoji(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC038":
					context.setAttribute("fileName", "Login");
					Login();
					tc038.VerifyCreateNewBusinessHours(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC039":
					context.setAttribute("fileName", "Login");
					Login();
					tc039.VerifyeEditBusinessHours(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC040":
					context.setAttribute("fileName", "Login");
					Login();
					tc040.verifyBusinessHoursInfo(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC041":
					context.setAttribute("fileName", "Login");
					Login();
					tc041.verifyApplyThemes(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC042":
					context.setAttribute("fileName", "Login");
					Login();
					tc042.verifyBrandLogo(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				default:
					break;
				}
 
				// EndTest
				System.out.println(("*** Test Suite " + TestScenario + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + TestScenario + " ending ***");
 
			}
 
		} catch (Exception e) {
 
			System.out.println("<----------------Failed--- Test execution " + testdata.get("Test_ID").toString()
					+ " ---Failed ---------------->");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");
 
			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("Test_ID").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception NoSuchWindowException) {
				System.out.println("Catch File not found error");
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
 
			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("Test_ID").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("Test_ID").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("Test_ID").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("Test_ID").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");
 
			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("Test_ID").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception NoSuchWindowException) {
				System.out.println("File not found error");
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
 
			// EndTest
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("************************ Test Suite " + testdata.get("Test_ID").toString()
					+ " ending ****************************");
 
		} finally {
			if (driver != null)
				KillChrome();
 
		}
	}
	
	public void Logout() throws AWTException, IOException, InterruptedException {
		ElementDisplayed(L_profile);
		try {
			if(ElementDisplayed(L_profile)) {
				profile.clickUsernameDropdown();
				profile.clickLogout();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			} else {
				Log.error("Logout Not Visiable");
			}
			//driver.quit();
			//killExcel();
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	@AfterSuite
	public void CloseAllBrowser() throws InterruptedException, IOException {
		driver.quit();
		ExtentTestManager.getTest().log(Status.PASS, "Browser Closed");
		ExtentManager.getInstance().flush();
	}
	
	
	public void Login() throws InterruptedException, IOException {
		try {
			Base_Class.SetUp("Admin");
			ExtentTestManager.getTest().log(Status.PASS, "Application Login " + Base_Class.Pagetitle);
			ExtentSuccessMessage("Login successful !");
		} catch (IOException e) {
			ExtentTestManager.startTest("Orator Logout");
			e.printStackTrace();
			ExtentTestManager.getTest().log(Status.FAIL, "Application fail to Login " + "With error ");
			ExtentErrorMessage("Issue while login into the application ");
		} catch (InterruptedException e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Application fail to Login With error");
			ExtentErrorMessage("Issue while login into the application");
			e.printStackTrace();
		}
	}
	
	@DataProvider(name = "TestData")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;

	}
	
}
