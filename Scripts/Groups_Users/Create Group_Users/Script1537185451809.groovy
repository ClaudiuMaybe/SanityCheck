import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_enterprise)

WebUI.click(findTestObject('Groups_Users/Page_Welcome - EOS/a_Admin'))

WebUI.click(findTestObject('Groups_Users/Page_Settings - EOS/div_Users'))

WebUI.click(findTestObject('Groups_Users/Page_Users - Settings - EOS/button_New User'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_emailTxtName'), GlobalVariable.email_NonAdmin)

WebUI.click(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_userNext'))

WebUI.delay(1)

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_loginTxtName'), GlobalVariable.username_NonAdmin)

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Object Repository/Groups_Users/Page_Users - Settings - EOS/input_autoPasswordChkBox'), 
    0)

WebUI.delay(1)

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_passwordTxtName'), GlobalVariable.password_NonAdmin)

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_confirmPasswordTxtName'), GlobalVariable.password_NonAdmin)

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_firstName'), findTestData('NonAdminUser_Data').getValue(
        1, 1))

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_lastName'), findTestData('NonAdminUser_Data').getValue(
        1, 2))

WebUI.setText(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_jobTitle'), findTestData('NonAdminUser_Data').getValue(
        1, 3))

WebUI.check(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_enabledChkBox'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Groups_Users/Page_Users - Settings - EOS/input_ok'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Groups_Users/Page_Settings - EOS/div_Groups'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/button_New Group'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Groups_Users/Page_Groups - Settings - EOS/input_groupName'), GlobalVariable.GroupName_NonAdmin)

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/button_Add'))

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/user_Dropdown'))

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/select_User2'))

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/button_AddUser_Ok'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Groups_Users/Page_Groups - Settings - EOS/button_AddWorkspace'), 3)

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/button_AddWorkspace'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/button_AddWorkspace_Ok'))

WebUI.delay(2)

WebUI.check(findTestObject('Groups_Users/Page_Groups - Settings - EOS/input_access_Default'))

WebUI.click(findTestObject('Groups_Users/Page_Groups - Settings - EOS/input_editGroupOk'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Groups_Users/Page_Users - Settings - EOS/a_Ere'))

WebUI.delay(1)

WebUI.click(findTestObject('Groups_Users/Page_Users - Settings - EOS/a_Logout'))

WebUI.waitForElementVisible(findTestObject('Main Login Page/input_userName'), 15)

WebUI.setText(findTestObject('Main Login Page/input_userName'), GlobalVariable.username_NonAdmin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Main Login Page/input_password'), GlobalVariable.password_NonAdmin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Groups_Users/Page_Welcome - EOS/a_Admin'), 0)

WebUI.closeBrowser()

