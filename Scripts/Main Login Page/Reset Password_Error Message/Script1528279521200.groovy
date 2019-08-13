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

WebUI.verifyElementVisible(findTestObject('Main Login Page/Reset Password Window/p_Enter your email address to reset password. text'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Main Login Page/Reset Password Window/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Main Login Page/Reset Password Window/Send Button'), 'value', 'Send', 
    5)

WebUI.setText(findTestObject('Main Login Page/Reset Password Window/Email textbox'), 'bogdan.eremia@ecrion.com')

WebUI.click(findTestObject('Main Login Page/Reset Password Window/Send Button'))

WebUI.waitForElementVisible(findTestObject('Main Login Page/Reset Password Window/Message wrong mail'), 0)

WebUI.verifyElementNotClickable(findTestObject('Main Login Page/Reset Password Window/Send Button'))

WebUI.click(findTestObject('Main Login Page/Reset Password Window/Close window X button'))

