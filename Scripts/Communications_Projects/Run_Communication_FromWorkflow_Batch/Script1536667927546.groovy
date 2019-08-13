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

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Communications'))

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/button_New Communication'), 
    15, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_New Communication'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation4_FromWk4_Batch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), 
    15)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'), 
    4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'), 
    15, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'), 
    ' Finished', FailureHandling.OPTIONAL) == false) {
    WebUI.delay(6)

    WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'), 
        ' Finished')
}

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0', FailureHandling.STOP_ON_FAILURE)

