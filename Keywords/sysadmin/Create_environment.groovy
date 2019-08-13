package sysadmin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Environment {
	@Keyword
	//Feature Set options: eossi = Develop, eosccm - Converse, eoscem = Experience, eoscustom = Custom

	def Create_env (String env_Name, String featureSet)
	{
		WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Environments Page/button_New Environment'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Sysadmin Portal/Environments Page/button_New Environment'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.waitForElementVisible(findTestObject('Sysadmin Portal/Environments Page/input_environmentName'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		'Variable that imputs 3 different userna,es\r\n'
		WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_environmentName'), env_Name, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_administratorName'), GlobalVariable.Username_Admin,
				FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.uncheck(findTestObject('Main Login Page/checkbox_GeneratePassworf'))

		WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_administratorPassword'), GlobalVariable.Password_Admin,
				FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_confirmAdministratorPass'), GlobalVariable.Password_Admin,
				FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Sysadmin Portal/Environments Page/input_administratorEmail'), GlobalVariable.Email_Admin,
				FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Sysadmin Portal/Environments Page/createNewEnv_button'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

		if (WebUI.verifyElementVisible(findTestObject('Sysadmin Portal/Environments Page/createNewEnv_button'),
		FailureHandling.OPTIONAL) ==  true)
		{
			WebUI.waitForElementNotVisible(findTestObject('Sysadmin Portal/Environments Page/createNewEnv_button'), 15)
		}
		else
		{
			WebUI.waitForElementVisible(findTestObject('Page_Environments - EOS/select_FeatureSet'), 15)
			WebUI.selectOptionByValue(findTestObject('Page_Environments - EOS/select_FeatureSet'), featureSet, true)

			WebUI.click(findTestObject('Sysadmin Portal/Environments Page/Ok button_Edit Environment'), FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
}

