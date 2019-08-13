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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Welcome - EOS/a_Projects'))

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_ New Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/select_Communication'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_CommunicationName'), '2_Test_Interractive', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/textarea_CommunicationDescript'), 'Interractive communication !@#$%^&*()_+}{"|:<>?/.,\\\';][', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_interactiveComm'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_selectFolder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_New Folder'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_folder_Name'), 'Test2', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_CreateFolder'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/select_TestFolder2'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_OK_DestinationFolder'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_Finish'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

