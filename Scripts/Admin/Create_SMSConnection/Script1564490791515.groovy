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

not_run: WebUI.callTestCase(findTestCase('Admin/Login_sysinternals'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternals/a_SMS'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_New Connection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/input_Connection Name_SMS'), GlobalVariable.SMSConnection, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/button_Save_SmsConnection'), FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/text_Connection_AlreadyExists'), 
    FailureHandling.OPTIONAL) == false)
 {
	    WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/verify_ConnectionPresent'), 
	        FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.click(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/verify_ConnectionPresent'), FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
		
	    WebUI.click(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/button_DeleteConnection'), FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.click(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/button_ConfirmDeleteConnection'), FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.verifyElementNotPresent(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/verify_ConnectionPresent'), 
	        2, FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_New Connection'), FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.setText(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/input_Connection Name_SMS'), GlobalVariable.SMSConnection, 
	        FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.click(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/button_Save_SmsConnection'), FailureHandling.CONTINUE_ON_FAILURE)
	
	    WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/verify_ConnectionPresent'), 
	        FailureHandling.CONTINUE_ON_FAILURE)
}
	else 
	{
		WebUI.click(findTestObject('Admin/SettingsSysinternals/Page_SMSConnection/button_CancelConnection'), FailureHandling.CONTINUE_ON_FAILURE)
	}
