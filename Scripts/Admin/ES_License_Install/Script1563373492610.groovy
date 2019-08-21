import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Admin/a_Admin'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/div_Licensing'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_Add License'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)



if (WebUI.verifyElementVisible(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_Sign-In'), FailureHandling.OPTIONAL) == true) 
{
	WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_Sign-In'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.setText(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/input_Username_Username'), GlobalVariable.LicenseAcc_Username,
		FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.setText(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/input_Password_Password'), GlobalVariable.LicenseAcc_Password,
		FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_OkSignInWindow'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/input_selectLicense'), 3)

WebUI.check(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/input_selectLicense'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_Install 1 licenses'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/contextual_Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_AssignLicense'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_OK_SelectUser'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/AssignedTo - Text'), GlobalVariable.Username_Admin, 
    FailureHandling.CONTINUE_ON_FAILURE)

