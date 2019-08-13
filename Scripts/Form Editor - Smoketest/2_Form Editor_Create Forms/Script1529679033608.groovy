import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/a_Workspaces'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Workspaces - EOS/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/button_ New Folder'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/button_ New Folder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/input_folder_Name'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/input_newFolderBtn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Form Editor Smoketest/Page_Recent Files - Files - EOS/Folder_exists_ERROR'), 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Form Editor Smoketest/Page_Recent Files - Files - EOS/Close_button'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)

    WebUI.waitForElementClickable(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/Test_folder'), 3)

    WebUI.click(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/Test_folder'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/button_New_Droptdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/a_Form'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/input_FormName'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/input_okBtn_FormName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex('0', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/button_New_Droptdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/a_Form'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/input_FormName'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/input_FormName'), 'Test2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Test - Files - EOS/input_okBtn_FormName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_PreviewFile - EOS/button_Edit_PreviewForm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

