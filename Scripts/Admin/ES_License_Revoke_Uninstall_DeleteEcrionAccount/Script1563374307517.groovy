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

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/contextual_Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_RevokeLicense'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_OK_RevokeLicense'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/contextual_Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_UninstallLicenese'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_OK_UninstallLicense'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/NoLicenses_Text'), 'No items', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/toggle_EcrionAccount'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_Sign-In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_ Delete_SignInWindow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_OkButton_deleteAccountConnecction'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/a_Sign-In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/input_Username_Username'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsHome/Settings_ES_LicensingPage/button_Cancel_SignInWindow'), FailureHandling.CONTINUE_ON_FAILURE)

