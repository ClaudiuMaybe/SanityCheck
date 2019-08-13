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

WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'), FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'communications.Projects.Create_Project'('1_Batch_Comm', 'Batch communication !@#$%^&*()_+}{"|:<>?/.,\\\';][', 
    'Batch')

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'communications.Projects.Create_Project'('2_Interractive_Com', 'Interractive_Communication !@#$%^&*()_+}{"|:<>?/.,\\\';][', 
    'Interractive')

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'communications.Projects.Create_Project'('3_OnDemand Comm', 'OnDemand communication !@#$%^&*()_+}{"|:<>?/.,\\\';][', 
    'On_Demand')

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Communications_Projects/Create_Project_FromWorkflow_Batch'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Communications_Projects/Export_Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Communications_Projects/Import_Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

