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

WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Sysadmin Portal/Sysadmin dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Sys_Dropdown_Edit Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/input_userNameTxt'), 
    'readonly', 'true', 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Welcome - EOS/button_Change Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/input_oldPasswordTxt'), 'sysadmi', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/input_newPasswordTxt'), 'sysadmin', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/input_confirmPasswordTxt'), 'sysadmin', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Welcome - EOS/button_OK_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Welcome - EOS/button_OK_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/message_OldPassError'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/message_OldPassError'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/message_OldPassError'), 'Cannot change password. The old password does not match the one you have entered.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/input_oldPasswordTxt'), 'sysadmin', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Welcome - EOS/button_OK_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/input_emailTxtName'), GlobalVariable.Email_Admin, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/Sysadmin_dropdown/Edit Account Window/button_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

