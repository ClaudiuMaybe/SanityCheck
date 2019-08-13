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

WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Project_Ideas/Page_Welcome - EOS/a_Developer'))

WebUI.click(findTestObject('Project_Ideas/Page_Developer - EOS/a_Project Ideas'))

WebUI.click(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/button_ContextualMenu'))

WebUI.delay(1)

WebUI.click(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/a_Install all'))

WebUI.waitForElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Financial_Successfully installed'), 
    120)

WebUI.waitForElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Insurance_Successfully installed'), 
    120)

WebUI.waitForElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Retail_Successfully installed'), 
    120)

WebUI.waitForElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Telecom_Successfully installed'), 
    120)

WebUI.verifyElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Financial_Successfully installed'))

WebUI.verifyElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Insurance_Successfully installed'))

WebUI.verifyElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Retail_Successfully installed'))

WebUI.verifyElementVisible(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Telecom_Successfully installed'))

WebUI.verifyElementText(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Financial_Successfully installed'), 
    'Successfully installed samples in workspace: Default')

WebUI.verifyElementText(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Insurance_Successfully installed'), 
    'Successfully installed samples in workspace: Default')

WebUI.verifyElementText(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Retail_Successfully installed'), 
    'Successfully installed samples in workspace: Default')

WebUI.verifyElementText(findTestObject('Project_Ideas/Page_ProjectIdeas - Developer - EOS/span_Telecom_Successfully installed'), 
    'Successfully installed samples in workspace: Default')

WebUI.closeBrowser()

