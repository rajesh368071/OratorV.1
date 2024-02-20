package com.testcase.agent;

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

import com.Agent.RoutedChatPage;
import com.BasePackage.Base_Class;
import com.Utility.ExcelReader;
import com.Utility.FakeData;
import com.Utility.Log;
import com.Webchat.WebchatPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.common.ProfilePage;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;


public class AllScenario extends Base_Class{
	
	TestListener TestListener;
	Base_Class Base_Class;
	Log log;
	SoftAssert softAssertion;
	FakeData fakedata = new FakeData();
	com.Utility.ScreenShot screenShot;
	ExcelReader excel;
	
	ProfilePage profile = new ProfilePage();
	RoutedChatPage routedchat = new RoutedChatPage();
	WebchatPage webchat = new WebchatPage();

	AgentTC001 tc001;
	AgentTC002 tc002;
	AgentTC003 tc003;
	AgentTC004 tc004;
	AgentTC005 tc005;
	AgentTC006 tc006;
	AgentTC007 tc007;
	AgentTC008 tc008;
	AgentTC009 tc009;
	AgentTC010 tc010;
	AgentTC011 tc011;
	AgentTC012 tc012;
	AgentTC013 tc013;
	AgentTC014 tc014;
	AgentTC015 tc015;
	AgentTC016 tc016;
	
	public void KillChrome() throws IOException, InterruptedException {
		Process process = Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		int exitCode = process.waitFor();
		if(exitCode ==0) {
		}else {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		}
	}
	
	
	@BeforeClass
	public void reference() throws InterruptedException, IOException {
		excel = new ExcelReader("Agent");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		softAssertion = new SoftAssert();
		
		tc001 = new AgentTC001();
		tc002 = new AgentTC002();
		tc003 = new AgentTC003();
		tc004 = new AgentTC004();
		tc005 = new AgentTC005();
		tc006 = new AgentTC006();
		tc007 = new AgentTC007();
		tc008 = new AgentTC008();
		tc009 = new AgentTC009();
		tc010 = new AgentTC010();
		tc011 = new AgentTC011();
		tc012 = new AgentTC012();
		tc013 = new AgentTC013();
		tc014 = new AgentTC014();
		tc015 = new AgentTC015();
		tc016 = new AgentTC016();
		
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
					tc001.verifyChatRequestReceived();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC002":
					context.setAttribute("fileName", "Login");
					Login();
					tc002.verifyChatRequestReceived();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC003":
					context.setAttribute("fileName", "Login");
					Login();
					tc003.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC004":
					context.setAttribute("fileName", "Login");
					Login();
					tc004.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC005":
					context.setAttribute("fileName", "Login");
					Login();
					tc005.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC006":
					context.setAttribute("fileName", "Login");
					Login();
					tc006.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC007":
					context.setAttribute("fileName", "Login");
					Login();
					tc007.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC008":
					context.setAttribute("fileName", "Login");
					Login();
					tc008.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC009":
					context.setAttribute("fileName", "Login");
					Login();
					tc009.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC010":
					context.setAttribute("fileName", "Login");
					Login();
					tc010.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC011":
					context.setAttribute("fileName", "Login");
					Login();
					tc011.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC012":
					context.setAttribute("fileName", "Login");
					Login();
					tc012.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC013":
					context.setAttribute("fileName", "Login");
					Login();
					tc013.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC014":
					context.setAttribute("fileName", "Login");
					Login();
					tc014.verify();
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC015":
					context.setAttribute("fileName", "Login");
					Login();
					tc015.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				case "TC016":
					context.setAttribute("fileName", "Login");
					Login();
					tc016.verify(testdata);
					Logout();
					context.setAttribute("fileName", "Logout");
				break;
				
				/*case "TC017":
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
				break;*/
				
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
		KillChrome();
		ExtentTestManager.getTest().log(Status.PASS, "Browser Closed");
		ExtentManager.getInstance().flush();
	}
	
	
	public void Login() throws InterruptedException, IOException {
		try {
			Base_Class.SetUp("Agent");
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
