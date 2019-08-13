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

not_run: WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl(GlobalVariable.url_sysadmin, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Sysadmin Portal/Domain/Page_Welcome - EOS/a_Domain'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/Domain/Links/button_Amazon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Amazon/input_AWS access key'), GlobalVariable.AmazonAccessKeyID, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Sysadmin Portal/Domain/Page_Amazon/message_Saved_AWSAccesKey'), 'Saved', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sysadmin Portal/Domain/Page_Amazon/input_AWS secret access key'), GlobalVariable.AWSSecretAccessKey, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Sysadmin Portal/Domain/Page_Amazon/message_Saved_AWSSecretKey'), 'Saved', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Sysadmin Portal/Domain/Page_Amazon/select_Region'), 'USEast1', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

