import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl(GlobalVariable.url_enterprise, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'))

not_run: WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/button_ContextualMenu'))

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/ImportProject/option_ImportProject'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/ImportProject/upload_Project'), 
    GlobalVariable.ExportProject_Path)

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/ImportProject/dropdown_SelectWorkspace'))

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/ImportProject/select_Workspace'))

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/ImportProject/button_ImportProject'))

