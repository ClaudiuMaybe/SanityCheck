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

not_run: WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Sysadmin Portal/Help Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Sysadmin Portal/Help Dropdown (1)/a_Ask a Question'))

WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_attachment1'), 
    5)

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_attachment1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_attachment2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_attachment3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_attachment4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_attachment1'), GlobalVariable.FilePath_SupportTicket)

WebUI.click(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/select_NormalUrgentHighLow'))

WebUI.selectOptionByValue(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/select_NormalUrgentHighLow'), 
    'Low', false)

WebUI.verifyOptionSelectedByValue(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/select_NormalUrgentHighLow'), 
    'Low', false, 4)

WebUI.setText(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_Name'), 'QA Test')

WebUI.setText(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_Subject'), 'QA Test')

WebUI.setText(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_EmailAddress'), 'QATest@ecrion.com')

WebUI.setText(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/textarea_Description'), 'This is a test !@#$%^&*()_+}{][:"|\\\';<>?/.,`~')

WebUI.click(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/input_submitBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/p_A separate confirmation emai'), 
    15)

WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/p_A separate confirmation emai'))

WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/p_IMPORTANT If you dont receiv'))

WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/p_Our working hours are'))

WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/p_Your message has been sent a'))

WebUI.verifyElementClickable(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/button_OK'))

WebUI.click(findTestObject('Sysadmin Portal/Help Dropdown (1)/Ask a question window/Confirmation Message Page/button_OK'))

not_run: WebUI.closeBrowser()

