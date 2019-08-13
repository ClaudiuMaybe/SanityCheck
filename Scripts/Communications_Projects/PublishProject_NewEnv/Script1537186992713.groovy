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

WebUI.navigateToUrl(GlobalVariable.url_enterprise, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/ContextualMenu_1_TestBatch'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/a_Versions'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_New Version'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/input_Name_snapshotName'), 
    '1_TestBatch12')

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/textarea_Comment_snapshotComme'), 
    'asdsd123sasead!@#@!%!@#^&#*)_{}|":<>?/.,\'\\\';]\\]')

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_Ok_NewVersion'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/contextualMenu_Snapshot'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/a_Publish'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/input_Environment_environment'), 
    '3_Custom_Env')

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/input_Password_password_login'), 
    GlobalVariable.Password_Admin)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_Next_LogInCredentials'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_Publish'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/h4_Snapshot has been published'), 
    10)

WebUI.verifyElementVisible(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/h4_Snapshot has been published'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/h4_Snapshot has been published'), 
    'Snapshot has been published')

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_Close_snapshotPublished'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_CloseVersionm'), 
    5)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/Publish_OtherEnv/Page_Projects - Projects - EOS/button_CloseVersionm'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Main Login Page/switch_Environments_Custom'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Communications'))

WebUI.delay(2)

CustomKeywords.'communications.Run_Communication.create_Communication'('Batch')

not_run: WebUI.closeBrowser()

