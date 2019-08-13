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

WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/a_Admin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsHome/Home_Text'), 'General', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsHome/Advanced_text'), 'Advanced', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsHome/Timezone_text'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsHome/Show Internals_text'), FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementNotChecked(findTestObject('Admin/SettingsHome/input_showSysinternals'), 1, FailureHandling.OPTIONAL)) {
    WebUI.check(findTestObject('Admin/SettingsHome/input_showSysinternals'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.click(findTestObject('Admin/SettingsHome/Sysinternals_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Admin/verifyElements_Sysinternals'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementNotChecked(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/input_Show Activities_showActivities'), 1, FailureHandling.OPTIONAL)) {
	WebUI.check(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/input_Show Activities_showActivities'), 
    FailureHandling.STOP_ON_FAILURE)
}
