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

WebUI.delay(4)

not_run: WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Components_Button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement_ExpandButton'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Text'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Text Area'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Label'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Separator'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Radio'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Dropdown'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Checkbox'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Number'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Currency'))

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Group_Selector'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

