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

WebUI.openBrowser(GlobalVariable.url_sysadmin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Login Page/button_Forgot Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Sysadmin Login Page/Forgot Password Window/Title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sysadmin Login Page/Forgot Password Window/label_Email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sysadmin Login Page/Forgot Password Window/Email textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sysadmin Login Page/Forgot Password Window/Cancel_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sysadmin Login Page/Forgot Password Window/Close window X button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Login Page/Forgot Password Window/Email textbox'), 'asdasdw123@asd.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Login Page/Forgot Password Window/Send_button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Sysadmin Login Page/Forgot Password Window/message_InvalidUser'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sysadmin Login Page/Forgot Password Window/message_InvalidUser'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Forgot Password Window/message_InvalidUser'), 'Password cannot be reset. Invalid user.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Login Page/Forgot Password Window/Email textbox'), GlobalVariable.Email_Admin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Login Page/Forgot Password Window/Send_button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Sysadmin Login Page/Forgot Password Window/message_Email Sent'), 40)

WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Forgot Password Window/message_Email Sent'), 'Email sent with instructions on how to reset your password. Check your inbox.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Forgot Password Window/button_OK'), 'OK', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Login Page/Forgot Password Window/button_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

