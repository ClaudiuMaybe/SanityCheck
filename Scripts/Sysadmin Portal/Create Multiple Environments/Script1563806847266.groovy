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

WebUI.callTestCase(findTestCase('Sysadmin Login Page/login_Sysadmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sysadmin Portal/a_Environments'), FailureHandling.CONTINUE_ON_FAILURE)

	while (WebUI.verifyElementVisible(findTestObject('Page_Environments - EOS/delete_Environment'), FailureHandling.OPTIONAL) == true)
	{
		WebUI.click(findTestObject('Page_Environments - EOS/delete_Environment'))
	
		WebUI.delay(1)
	
		WebUI.click(findTestObject('Page_Environments - EOS/button_ConfirmDeleteEnv'))
		
		WebUI.delay(1)
	
		WebUI.refresh()
	
		WebUI.delay(1)
	}

'Feature Set options: eossi = Develop, eosccm - Converse, eoscem = Experience, eoscustom = Custom'
CustomKeywords.'sysadmin.Environment.Create_env'('1_Develop', 'eossi')

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'sysadmin.Environment.Create_env'('2_Experience_Env', 'eoscem')

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'sysadmin.Environment.Create_env'('3_Custom_Env', 'eoscustom')

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'sysadmin.Environment.Create_env'('4_Converse_Env', 'eosccm')

