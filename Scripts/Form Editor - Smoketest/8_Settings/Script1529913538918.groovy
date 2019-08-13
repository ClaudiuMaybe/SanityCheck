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

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:8094/EOS/FormEditor/#workspace/Default/Test/Test.efd')

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Settings_Button'))

not_run: WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Form_Name'), 'TesT1234')

WebUI.doubleClick(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Form_Name'))

WebUI.sendKeys(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Form_Name'), Keys.chord(Keys.BACK_SPACE))

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Form_Name'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'TesTPage123\';', Arrays.asList(element1))

WebUI.check(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Checkbox_Required Fields'))

WebUI.check(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Checkbox_Hide lookup button'))

WebUI.check(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Checkbox_Validate before next page'))

not_run: WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Droptdown_Pagination Type'), 
    'tabs', false)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Droptdown_Pagination Type'), 'simpletabs', 
    false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Settings/Droptdown_Pagination Type'), 'none', 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

