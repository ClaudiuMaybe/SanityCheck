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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testdata.InternalData as InternalData
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/a_Environments'), FailureHandling.CONTINUE_ON_FAILURE)

//for (def index : (1..data.getRowNumbers() - 1)) {
for (i = 4500; i < 5000; i++) {
	
	
    WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Environments Page/button_New Environment'), 15, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('Sysadmin Portal/Environments Page/button_New Environment'), 15, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)

    WebUI.click(findTestObject('Sysadmin Portal/Environments Page/button_New Environment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Environments Page/input_environmentName'), 5, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_environmentName'), 'testenv' + String.valueOf(
            i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_administratorName'), GlobalVariable.Username_Admin + String.valueOf(i), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.uncheck(findTestObject('Main Login Page/checkbox_GeneratePassworf'))

    WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_administratorPassword'), GlobalVariable.Password_Admin, 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_confirmAdministratorPass'), GlobalVariable.Password_Admin, 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_administratorEmail'), "test" + String.valueOf(i) + "@test.com", 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Sysadmin Portal/Environments Page/createNewEnv_button'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Page_Environments - EOS/select_FeatureSet'), 20, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(3)
	
	WebUI.sendKeys(findTestObject('Page_Environments - EOS/select_FeatureSet'), Keys.chord(Keys.ESCAPE), FailureHandling.CONTINUE_ON_FAILURE)
   
}

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

