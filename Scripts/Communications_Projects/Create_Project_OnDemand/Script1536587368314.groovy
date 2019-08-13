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

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_ New Project'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/select_Communication'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_Next'))

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_CommunicationName'), '3_TestOnDemand')

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/textarea_CommunicationDescript'), 'On Demand communication !@#$%^&*()_+}{"|:<>?/.,\\\';][')

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_selectFolder'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_New Folder'))

not_run: WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_folder_Name'), 'Test')

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_CreateFolder'))

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/select_TestFolder'))

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_OK_DestinationFolder'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_Finish'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

