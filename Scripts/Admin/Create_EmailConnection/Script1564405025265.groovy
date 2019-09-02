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

WebUI.click(findTestObject('Admin/SettingsSysinternals/a_Email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/h2_Email Connections'), 'Email Connections', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/span_Create and manage email c'), 'Create and manage email connections.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/span_Create and manage email c'), 'Create and manage email connections.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/th_Name'), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/th_Status'), 'Status', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/th_Type'), 'Type', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/td_No items'), 'No items', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Admin/SettingsSysinternalsEmail/button_New Connection'), 'title', 'New Connection', 
    2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_New Connection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/h4_New Email Connection'), 'New Email Connection', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternalsEmail/input_connectionNameTxt'), 'test_email_123!@#$QWE@#', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Admin/SettingsSysinternalsEmail/select_SMTP'), 'ses', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Admin/SettingsSysinternalsEmail/select_SMTP'), 'email', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/SettingsSysinternalsEmail/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Cancel'), 'Cancel', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Continue'), 'Continue', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/label_From'), 'From', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/label_Password'), 'Password', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/label_Username'), 'Username', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/label_Port'), 'Port', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/label_Server Name'), 'Server Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/strong_Encrypt Connection'), 'Encrypt Connection', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Test Connection'), 'Test Connection', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Cancel'), 'Cancel', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Back'), 'Back', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Ok'), 'Ok', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/SettingsSysinternalsEmail/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/SettingsSysinternalsEmail/button_Back'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternalsEmail/input_smtpUserNameTxt'), 'test.notifications@ecrion.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternalsEmail/input_ServerName'), 'smtp.office365.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternalsEmail/input_passwordTxt'), '3cr1oN1!2@3#', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternalsEmail/input_smtpFromTxt'), 'test.notifications@ecrion.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternalsEmail/input_smtpPortTxt'), '587', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Admin/SettingsSysinternalsEmail/input_EncryptCOnnection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_Test Connection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/SettingsSysinternalsEmail/Connection_Succeeded_Message'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternalsEmail/Connection_Succeeded_Message'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/Connection_Succeeded_Message'), 'Connection Succeeded', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternalsEmail/button_Test Connection'), 'Connection succeeded', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Admin/SettingsSysinternalsEmail/button_Test Connection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

