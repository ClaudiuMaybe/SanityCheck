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

not_run: WebUI.callTestCase(findTestCase('Main Login Page/login_Enterprise'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_enterprise)

WebUI.click(findTestObject('Workspaces/a_Workspaces'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Workspaces/button_New Workspace'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Workspaces/Verifications/Verifications_CreateWorkspace'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Workspaces/input_Workspace Name_workspace_Name'), GlobalVariable.Workspace_Name, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Workspaces/textarea_Description_workspace_Description'), 'This is the second workspace', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Workspaces/button_createWorkspaceBtn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Workspaces/verify_CreatedWorkspace'))

WebUI.verifyElementVisible(findTestObject('Workspaces/verify_JobsActiviry'))

WebUI.verifyElementVisible(findTestObject('Workspaces/verify_Schedules'))

WebUI.verifyElementVisible(findTestObject('Workspaces/verify_Triggers'))

WebUI.verifyElementText(findTestObject('Workspaces/verify_CreatedWorkspace'), GlobalVariable.Workspace_Name)

