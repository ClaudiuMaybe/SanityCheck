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

WebUI.openBrowser(GlobalVariable.url_sysadmin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sysadmin Login Page/button_Forgot Password'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Sysadmin Login Page/h2_Please sign in'))

WebUiBuiltInKeywords.setText(findTestObject('Sysadmin Login Page/input_userName'), 'sysadmin')

WebUiBuiltInKeywords.setText(findTestObject('Sysadmin Login Page/input_password'), 'sys')

WebUI.click(findTestObject('Sysadmin Login Page/button_Sign in'))

WebUI.waitForElementVisible(findTestObject('Sysadmin Login Page/Invalid user or password error message'), 5)

WebUiBuiltInKeywords.verifyElementVisible(findTestObject('Sysadmin Login Page/Invalid user or password error message'))

WebUiBuiltInKeywords.verifyTextPresent('Could not sign in. Invalid user name or password.', false)

WebUiBuiltInKeywords.setText(findTestObject('Sysadmin Login Page/input_userName'), 'sysadmin', FailureHandling.CONTINUE_ON_FAILURE)

WebUiBuiltInKeywords.setText(findTestObject('Sysadmin Login Page/input_password'), 'sysadmin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Login Page/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Sysadmin Login Page/Change_Password_Window/Textbox_Confirm_Password'), FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Change_Password_Window/Change_Password_Title'), 'Please change password', 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Change_Password_Window/Confirm_Pass_Text'), 'Confirm Password', 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Change_Password_Window/New_Pass_Text'), 'New Password', 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Change_Password_Window/Old_Pass_Text'), 'Old Password', 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Change_Password_Window/Button_OK'), 'OK', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementText(findTestObject('Sysadmin Login Page/Change_Password_Window/Button_Close'), 'Close', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('Sysadmin Login Page/Change_Password_Window/Button_Close'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Login Page/Change_Password_Window/Textbox_Old_Pass'), 'sysadmin', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Login Page/Change_Password_Window/Textbox_New_Pass'), 'sysadmin', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Login Page/Change_Password_Window/Textbox_Confirm_Password'), 'sysadmin', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Sysadmin Login Page/Change_Password_Window/Button_OK'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.waitForElementVisible(findTestObject('Sysadmin Login Page/Environments card'), 5, FailureHandling.CONTINUE_ON_FAILURE)

