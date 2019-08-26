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

WebUI.navigateToUrl(GlobalVariable.url_enterprise, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Welcome - EOS/a_Contacts'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/button_New'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/a_Contact'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_FirstName'), 'TestContact', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_LAstName'), 'TestContactLM', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_email'), GlobalVariable.Email_Admin, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_Phone'), '02123456789', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_contactNO'), '13', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_mobile'), '0712345678', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Contacts/Page_Contacts/input_PrimaryContact'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/a_Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_Street'), 'QA Street', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_ZipPostalCode'), '777', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_City'), 'QA City', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_State'), 'QA State', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_Country'), 'QA Country', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/a_Demographics'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_DateOfBirth'), '010186', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/a_Sales'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_Company'), 'QA Inc Ltd', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_Title'), 'Mr. QA', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_Industry'), 'QA', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Contacts/Page_Contacts/input_LeadSource'), 'Automation', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/input_modalOkBtn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Contacts/Page_Contacts/verify_Createdcontact'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Contacts/Page_Contacts/verify_Createdcontact'), FailureHandling.CONTINUE_ON_FAILURE)

