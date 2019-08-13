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

WebUI.openBrowser(GlobalVariable.url_sysadmin, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Main Login Page/input_userName'), GlobalVariable.Username_Admin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Main Login Page/input_password'), GlobalVariable.Password_Admin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Main Login Page/Multiple environments/Environment Selector'), FailureHandling.OPTIONAL)) {
    not_run: WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('Main Login Page/Multiple environments/button_Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Main Login Page/Multiple environments/Environment Selector'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Main Login Page/Multiple environments/button_Continue'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Main Login Page/Multiple environments/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/button_MenuAccordeon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Main Login Page/Promotions_options'), 5)

WebUI.verifyElementVisible(findTestObject('Main Login Page/Promotions_options'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/Select_MultipleEnvironments/Page_Welcome - EOS/droptdown_Environments_MainPage'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/Select_MultipleEnvironments/Page_Welcome - EOS/select_environment_Custom'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'), 5)

WebUI.verifyElementVisibleInViewport(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'), 2)

not_run: WebUI.click(findTestObject('Main Login Page/button_MenuAccordeon'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementNotVisibleInViewport(findTestObject('Main Login Page/Promotions_options'), 0)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/Select_MultipleEnvironments/Page_Welcome - EOS/droptdown_Environments_MainPage'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/Select_MultipleEnvironments/Page_Welcome - EOS/select_environment_Experience'), 
    FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Develop_InitiialGuide/a_Next'), FailureHandling.OPTIONAL)) {
    WebUI.delay(1, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Develop_InitiialGuide/a_Next'), FailureHandling.OPTIONAL)

    WebUI.delay(1, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Develop_InitiialGuide/a_Next'), FailureHandling.OPTIONAL)

    WebUI.delay(1, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Develop_InitiialGuide/a_Next'), FailureHandling.OPTIONAL)

    WebUI.delay(1, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Develop_InitiialGuide/a_Finish'), FailureHandling.OPTIONAL)

    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.verifyElementNotPresent(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'), 2)

WebUI.closeBrowser()

