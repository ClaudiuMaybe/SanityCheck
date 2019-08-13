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

WebUI.openBrowser('http://localhost:8094/EOS/Login#http://localhost:8094/')

WebUI.maximizeWindow()

WebUI.verifyElementClickable(findTestObject('Main Login Page/button_Forgot Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/button_Forgot Password'))

WebUI.verifyElementVisible(findTestObject('Main Login Page/Reset Password Window/h4_Forgot Password Title'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Main Login Page/Reset Password Window/label_Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Main Login Page/Reset Password Window/p_Enter your email address to reset password. text'), 
    0)

WebUI.verifyElementClickable(findTestObject('Main Login Page/Reset Password Window/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Main Login Page/Reset Password Window/Send Button'), 'value', 'Send', 
    5)

WebUI.setText(findTestObject('Main Login Page/Reset Password Window/Email textbox'), 'Engagement@mail')

WebUI.verifyElementVisible(findTestObject('Main Login Page/Reset Password Window/Invalid email feedback'))

WebUI.setText(findTestObject('Main Login Page/Reset Password Window/Email textbox'), 'bogdan.eremia@ecrion.com')

WebUI.verifyElementVisible(findTestObject('Main Login Page/Reset Password Window/valid email feedback'))

WebUI.click(findTestObject('Main Login Page/Reset Password Window/Send Button'))

WebUI.verifyElementNotVisible(findTestObject('Main Login Page/Reset Password Window/Message wrong mail'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/Email Sent title'), 
    15)

WebUI.verifyElementText(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/Email Sent title'), 
    'Email Sent')

WebUI.verifyElementText(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/Text box_with text'), 
    'Instructions on how to reset the password were sent to the email address associated with your account. Please check your Inbox.')

WebUI.verifyElementClickable(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/X button to close'))

WebUI.click(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/button_OK'))

WebUI.waitForElementNotVisible(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/Text box_with text'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Main Login Page/Reset Password Window/Email Sent Confirmation window/Text box_with text'), 
    FailureHandling.STOP_ON_FAILURE)

