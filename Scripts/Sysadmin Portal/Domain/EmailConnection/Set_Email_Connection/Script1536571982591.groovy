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

not_run: WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_sysadmin)

WebUI.delay(2)

WebUI.click(findTestObject('Sysadmin Portal/Domain/Page_Welcome - EOS/a_Domain'))

WebUI.delay(2)

WebUI.click(findTestObject('Sysadmin Portal/Domain/Links/button_Email'))

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Email/input_smtpUserNameTxt'), 'test.notifications@ecrion.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Email/input_smtpHostTxt'), 'smtp.office365.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Email/input_smtpPasswordTxt'), '3cr1oN123456', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Email/input_smtpFromTxt'), 'test.notifications@ecrion.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Email/input_smtpPortTxt'), '587')

WebUI.check(findTestObject('Sysadmin Portal/Domain/Page_Email/input_smtpSSL'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin/SettingsSysinternalsEmail/button_Test Connection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Domain/Page_Email/alert_Connection_Ok'))

