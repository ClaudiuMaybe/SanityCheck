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

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement_ExpandButton'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/New_Label'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_Label_Options/Text_Area'), 'tEST_Page!', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uncheck(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_Label_Options/IsVisible_Checkbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_Label_Options/IsVisible_Checkbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Pages_Font'), 'Lucida Console, Monaco, monospace', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Pages_FontSize'), '16px', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Pages_Select_Color'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Pages_PickupColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Pages_Select_text_Color'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Pages_PickupTextColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Captions_Select_Font'), 'Impact, Charcoal, sans-serif', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Captions_FontSize'), '16px', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Captions_SelectoColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Captions_PickupColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Captions_BoldText'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Captions_ItalicText'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_SelectFont'), 'Tahoma, Geneva, sans-serif', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_SelectFontSize'), '72px', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_SelectBackround'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_PickupBackroundColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_SelectBorderColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_PickupBorderColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_SelectTextColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_PickupTextColor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_Bold'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Navigation_Italic'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Main_Form/Form_Pages_Selector_2nd page'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Main_Form/Form_Pages_Selector_3rd Page'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Components_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_3rd_Element'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_ NewPage_Options/Caption_TextArea'), 'TeSt_PagE!@#$%^&*()_+', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_ NewPage_Options/Name_TextArea'), 'TeSt_PagE!@#$%^&*()_+', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

