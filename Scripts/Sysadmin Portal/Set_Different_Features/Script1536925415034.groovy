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

not_run: WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Sysadmin Portal/a_Environments'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/Environments Page/select_1_Develop_Env'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Environments - EOS/select_FeatureSet'), 'eossi', true)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/Environments Page/Page_Environments - ConfigSearch/button_Ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Sysadmin Portal/Environments Page/select_2_Experience_Env'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Environments - EOS/select_FeatureSet'), 'eoscem', true)

not_run: WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Sysadmin Portal/Environments Page/Page_Environments - ConfigSearch/button_Ok'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/Environments Page/select_3_Custom_Env'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Environments - EOS/select_FeatureSet'), 'eoscustom', true)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/Environments Page/Page_Environments - ConfigSearch/button_Ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

