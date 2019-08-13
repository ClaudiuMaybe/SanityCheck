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

WebUI.openBrowser('http://localhost:8094/EOS/Login#http://localhost:8094/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Main Login Page/h2_Please sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Main Login Page/button_Forgot Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Main Login Page/input_userName'), 'Ere', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Main Login Page/input_password'), 'ere123', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

'Verifies if there are multiple environments present. If so, it selects the second environment and presses continue, if not, it goes to the main page\r\n'
if (WebUI.verifyElementVisible(findTestObject('Main Login Page/Multiple environments/Environment Selector'), FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('Main Login Page/Multiple environments/button_Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Main Login Page/Multiple environments/Environment Selector'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Main Login Page/Multiple environments/button_Continue'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Main Login Page/Multiple environments/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Main Login Page/a_Workspaces'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Workspaces - EOS/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

'Creates a new folder\r\n'
WebUI.waitForElementVisible(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/button_ New Folder'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/button_ New Folder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/input_folder_Name'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/Page_Recent Files - Files - EOS/input_newFolderBtn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'If there is already a folder with the Name Test, it verifies if the Error appears and pressses Cancel and moves on\r\n'
if (WebUI.verifyElementVisible(findTestObject('Object Repository/Form Editor Smoketest/Page_Recent Files - Files - EOS/Folder_exists_ERROR'), 
    FailureHandling.CONTINUE_ON_FAILURE)) {
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

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Page'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Subform'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Group'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Text'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Separator'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Label'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Separator'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Contact Field'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Radio'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Checkbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Currency'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Select Subform (2nd element)'
WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_2ndElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Style_Subform_Options/Browse_subform'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Style_Subform_Options/Subform Properties/Subform Browse window/Select New Subform'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Style_Subform_Options/Subform Properties/Subform Browse window/Ok Button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Style_Subform_Options/Subform Properties/input_name_subform'), 
    'test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uncheck(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Style_Subform_Options/Subform Properties/input_visible'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Style_Subform_Options/Subform Properties/input_visible'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Components_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Ecrion_Authentication'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/File_Picker'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Google_Address'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Google_Map'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Image_Picker'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Password'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Rating'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Repeating_Section'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Rich_text'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Script'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Structured_Data'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Time'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_More'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/XML_Field'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/More_Options/Insert_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

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

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_ NewPage_Options/Caption_TextArea'), 'TeSt_PagE!@#$%^&*()_+', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Styles/Styles_ NewPage_Options/Name_TextArea'), 'TeSt_PagE!@#$%^&*()_+', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Languages_Button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Add_Language_Button'))

WebUI.setText(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Language_DropDown_Search'), 'Ro')

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Language_Romanian'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/New_Added_Language'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Language_Table_2ndRow_TranslationCell'), 
    30)

WebUI.executeJavaScript('arguments[0].value=\'Pagina Noua\';', Arrays.asList(element))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Language_table_OkButton'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.refresh()

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Form_Languages_Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Languages/Form_Languages_Dropdown_SelectRO'))

WebUI.delay(1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

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

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Components_Button'))

WebUI.delay(2)

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

WebUI.delay(3)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Form_1stElement_ExpandButton'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 1)

WebUI.delay(1)

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Text'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Text Area'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Label'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Separator'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Radio'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Dropdown'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Checkbox'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Number'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Currency'))

CustomKeywords.'js_Actions.JS_Click.clickUsingJS'(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Repeating_Selector'), 
    1)

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Plus button'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Components/Form/Page_Options_buttons/button_Date'))

WebUI.click(findTestObject('Form Editor Smoketest/FORM EDITOR/Contextual_Toolbar/Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

