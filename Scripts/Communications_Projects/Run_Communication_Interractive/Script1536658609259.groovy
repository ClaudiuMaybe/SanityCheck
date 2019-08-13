import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Communications'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/button_New Communication'), 
    15, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_New Communication'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex('1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation2_Interractive'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/span_Search for a contact'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_Contact'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Projects_Communications/Page_Communications - Communication/textbox_Sender'), 'Mr. QA', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_InterractiveFinishButton'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'), 
    15, FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'), 
    ' Finished', FailureHandling.OPTIONAL) == false) {
    WebUI.delay(5)

    WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'), 
        ' Finished')
}

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0', FailureHandling.STOP_ON_FAILURE)

