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

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_Projects'))

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_NewProject'))

WebUI.click(findTestObject('email_editor/Create_Email_Proj/select_EmailBlastResponsive'))

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_Next'))

WebUI.setText(findTestObject('email_editor/Create_Email_Proj/textbox_Name'), 'Test')

WebUI.setText(findTestObject('email_editor/Create_Email_Proj/textbox_Description'), 'Test!@#$%^&*()|"}{:?><!~')

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_Browse'))

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_NewFolder'))

WebUI.setText(findTestObject('email_editor/Create_Email_Proj/textbox_FolderName'), 'Test')

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_CreateNewFolder'))

not_run: WebUI.click(findTestObject('email_editor/Create_Email_Proj/select_testFolder'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_Ok_Destination Folder'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('email_editor/Create_Email_Proj/button_Finish'))

