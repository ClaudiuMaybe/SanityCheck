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

WebUI.callTestCase(findTestCase('Sysadmin Portal/Create Multiple Environments'), [('Develop_env') : findTestData('Environment Names').getValue(
            1, 1), ('Username') : GlobalVariable.Username_Admin, ('Experience_Env') : findTestData('Environment Names').getValue(
            1, 2), ('Custom_Env') : findTestData('Environment Names').getValue(1, 3)], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sysadmin Portal/Set_NoOfThreads'), [('EnvName') : 'QaTest', ('Username') : 'Ere'], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sysadmin Portal/Domain/StorageCompacting'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sysadmin Portal/Help/Sysadmin_Ask a question_Window'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sysadmin Portal/Domain/EmailConnection/Set_Email_Connection'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sysadmin Portal/Domain/AmazonConnection/Create_Amazon_Connection'), [('variable') : GlobalVariable.url_sysadmin], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sysadmin Portal/Edit Account/Edit Account'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sysadmin Login Page/Reset password'), [:], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'windowsCommands.taskKill.kill_service'()

