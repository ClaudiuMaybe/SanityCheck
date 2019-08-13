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

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/button_ContextualMenu'))

WebUI.delay(1)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/button_CreateFromWorkflow'))

WebUI.selectOptionByValue(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/select_InteractiveBatchOn-Dema'), 
    'Batch', false)

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/input_Name'), 
    '4_TestBatch_FromWorkflow')

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/textarea_Description'), 
    'FromWk4_Batch communication!@#$%^&*()_+}{"|:<>?/.,\\\';][')

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/button_Browse'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/select_BatchFolder'))

WebUI.delay(2)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/select_Workflow'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/button_SelectWorkflow_OK'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/CreateFromWorkflow MEnus/button_NewProject_OK'))

WebUI.delay(2)

WebUI.back()

