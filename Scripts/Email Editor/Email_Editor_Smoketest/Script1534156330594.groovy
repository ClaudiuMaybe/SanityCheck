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
//import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Email Editor/Create_NewEmailBlastProj'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl('http://192.168.1.53:8094/EOS/EmailEditor/Default/Test/Test/Email.ehtml')

WebUI.delay(3)

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/select_Button'))

WebUI.click(findTestObject('email_editor/Editor/Styles/button_Styles'))

WebUI.delay(1)

not_run: WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/email_editor/Editor/Styles/Button/Action/textbox_Action URL'), 
    30)

not_run: WebUI.executeJavaScript('arguments[0].value=\'https://www.youtube.com/\';', Arrays.asList(element))

WebUI.setText(findTestObject('email_editor/Editor/Styles/Button/Action/textbox_Action URL'), 'www.youtube.com')

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/Content/dropdown_Font Family'))

arialoption = WebUI.modifyObjectProperty(findTestObject('Object Repository/email_editor/Editor/Styles/Button/Content/fontfamily_List'), 
    'css', 'equals', '[role="listbox"] > li:nth-child(4)', true)

WebUI.click(arialoption)

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/Content/dropdown_Background Color'))

WebUI.setText(findTestObject('email_editor/Editor/Styles/Button/Content/change_Color'), '#9B1CAD')

WebUI.sendKeys(findTestObject('email_editor/Editor/Styles/Button/Content/change_Color'), Keys.chord(Keys.ESCAPE))

WebUI.delay(1)

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/Content/dropdown_TextColor'))

WebUI.setText(findTestObject('email_editor/Editor/Styles/Button/Content/change_Color'), '#00C345')

WebUI.sendKeys(findTestObject('email_editor/Editor/Styles/Button/Content/change_Color'), Keys.chord(Keys.ESCAPE))

WebUI.delay(2)

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/Content/droptdown_Font Size Numeric'))

px13option = WebUI.modifyObjectProperty(findTestObject('Object Repository/email_editor/Editor/Styles/Button/Content/fontfamily_List'), 
    'css', 'equals', '[role="menu"] > li:nth-child(5)', true)

WebUI.click(px13option)

WebUI.delay(1)

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/Content/dropdown_Font Size'))

fontsizetexttype = WebUI.modifyObjectProperty(findTestObject('Object Repository/email_editor/Editor/Styles/Button/Content/fontfamily_List'), 
    'css', 'equals', '[role="listbox"] > li:nth-child(2)', true)

WebUI.click(fontsizetexttype)

WebUI.click(findTestObject('email_editor/Editor/Styles/Button/Content/button_Right Allign'))

WebUI.click(findTestObject('email_editor/Editor/Upper Bar/button_Save'))

