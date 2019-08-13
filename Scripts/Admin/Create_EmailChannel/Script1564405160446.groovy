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

WebUI.click(findTestObject('Admin/Channels/Email/select_EmailQueue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('Admin/Channels/Email/div_No connection defined. Ple'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Channels/Email/input_name'), '1_TesT_Email_ConneCTIon1!@', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Channels/Email/textarea_description'), 'This is an email connection that connects an email. !@#$1234{}][;\'\\:"|<>?/.,)(*&^%+_-=ÆØÅ', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Channels/Email/label_Name'), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Channels/Email/label_Description'), 'Description', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Channels/Email/label_Email connection'), 'Email connection', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Channels/Email/label_Track Email Read'), 'Track Email Read', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/Channels/Email/button_Cancel_channels'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/Channels/Email/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Admin/Channels/Email/input_trackEmailRead'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/button_Send test email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), 'Send', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementAttributeValue(findTestObject('Admin/Channels/Email/Send_Test_Mail/input_subject'), 'value', 
    'Test: Samples Email Queue', 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/textarea_This is a message to'), ' This is a message to test that the Samples Email Queue is working correctly.', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/label_Email Body'), 'Email Body', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/label_Subject'), 'Subject', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/label_To'), 'To', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementNotClickable(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), 'Email send failed', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/button_Send test email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Channels/Email/Send_Test_Mail/input_name'), GlobalVariable.Email_Admin, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Admin/Channels/Email/Send_Test_Mail/input_subject'), '!@#$%^&*()_+=-0', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Admin/Channels/Email/Send_Test_Mail/textarea_This is a message to'), ' This is a message to test that the Samples Email Queue is working correctly. !@#$%^^&&*()_+=-0987654321{}:"|?><,./;\'\\][', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementAttributeValue(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), 'Text', 'Email sent', 
    10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Send'), 'Email sent', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/Send_Test_Mail/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/Channels/Email/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (WebUI.verifyElementNotPresent(findTestObject('Admin/Channels/Email/Channel_Contextual Menu'), 2, FailureHandling.OPTIONAL)) {
    TestObject contextual_menu = findTestObject('Admin/Channels/Email/Channel_Contextual Menu')

    contextual_menu.setSelectorValue(SelectorMethod.CSS, '#grid > div > div.jsgrid-grid-body > table > tbody > tr:nth-child(1) > td > div')

    WebUI.click(contextual_menu, FailureHandling.OPTIONAL)
} else {
    not_run: WebUI.click(findTestObject('Admin/Channels/Email/Channel_Contextual Menu'), FailureHandling.OPTIONAL)
}

not_run: WebUI.verifyElementClickable(findTestObject('Admin/Channels/Email/Contextual_Delete'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Contextual_Delete'), 'Delete', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Admin/Channels/Email/Contextual_Properties'), 'Properties', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Admin/Channels/Email/Contextual_Properties'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Admin/Channels/Email/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

