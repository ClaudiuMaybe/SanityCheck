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

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternals/Configuration_text'), 'Configuration', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternals/Connections_text'), 'Connections', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternals/Warning_text'), 'Warning: Use only when instructed by Ecrion Technical Support. Using Sysinternals incorrectly may result in serious problems and data loss.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/SettingsSysinternals/Workspaces_text'), 'Workspaces', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Email'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Amazon S3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Audit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Custom Paths'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Database'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Document DB'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Docusign'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Environment Variables'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Facebook'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Forms'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_FTPFTPS'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Microsoft Dynamics CRM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Portal'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Profiles'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Salesforce'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_SFTP'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Sharepoint'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_SMS'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_SSO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Tags'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Tasks'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/a_Views'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/a_Execution Log'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/a_Jobs'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/a_Schedules'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/a_Sync Log'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/a_Triggers'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Admin/SettingsSysinternals/Page_Sysinternals - Workspaces/input_Show Activities_showActivities'), 
    FailureHandling.CONTINUE_ON_FAILURE)

