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

WebUI.waitForElementClickable(findTestObject('Admin/SettingsChannels/div_Channels'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsChannels/div_Channels'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsChannels/button_New Channel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/SMS/select_SMSQueue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Channels/Email/input_name'), '3_TesT_SMSConneCTIon1!@', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Channels/Email/textarea_description'), 'This is a SMS connection that connects a SMS. !@#$1234{}][;\'\\:"|<>?/.,)(*&^%+_-=ÆØÅ', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/Channels/Email/button_Cancel_channels'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/Channels/Email/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

