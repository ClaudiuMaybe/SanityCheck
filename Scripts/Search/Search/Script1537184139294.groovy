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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Search/button_searchbar'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Search/textbox_Searchbar'), 'OnDemand')

WebUI.sendKeys(findTestObject('Search/textbox_Searchbar'), Keys.chord(Keys.ENTER))

WebUI.switchToWindowIndex('1')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Search/button_FilesFilter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Search/searchResult_3_TestOnDemand'), 'href', GlobalVariable.Search_Result_Link, 
    0)

WebUI.closeBrowser()

