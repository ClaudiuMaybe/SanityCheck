package communications

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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable


public class Run_Communication {
	@Keyword
	def create_Communication (String Run_Comm) {
		WebUI.waitForElementVisible(findTestObject('Projects_Communications/Page_Communications - Communication/button_New Communication'),
				15, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_New Communication'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

		switch (Run_Comm) {
			case "Batch":
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_DefaultWorkspace'),
				FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation1_Batch'),
				FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'),
						10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1)
				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'),
						10, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)
				break

			case "Interractive":
			WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_DefaultWorkspace'),
				FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation2_Interractive'),
				FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/span_Search for a contact'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_Contact'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.setText(findTestObject('Projects_Communications/Page_Communications - Communication/textbox_Sender'), 'Mr. QA', FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_InterractiveFinishButton'),
						FailureHandling.CONTINUE_ON_FAILURE)
				break

			case "On_Demand":
			WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_DefaultWorkspace'),
				FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation3_OnDemand'),
				FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/span_Search for a contact'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_Contact'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Save_OnDemand'))

				WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Results/Summaru_Tab'))
				break
			case "From_Workflow":
			WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_DefaultWorkspace'),
				FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation4_FromWk4_Batch'),
				FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'),
						15)
				WebUI.delay(1)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'),
						4, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'),
						10, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)
				break

			case "Imported":
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_SecondWorkspace'),
				FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/select_testcommuncation1_Batch'),
						FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'),
						10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1)
				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/button_Run'), FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.delay(1)
				WebUI.waitForElementClickable(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'),
						10, FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.click(findTestObject('Projects_Communications/Page_Communications - Communication/OK_Confirmation_Batch'), FailureHandling.CONTINUE_ON_FAILURE)

				WebUI.switchToWindowIndex('1', FailureHandling.CONTINUE_ON_FAILURE)
				break

			default:
				KeywordUtil.markFailedAndStop("You have entered the wrong communication type")
				break
		}

		WebUI.waitForElementVisible(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'),
				15, FailureHandling.CONTINUE_ON_FAILURE)

		if (WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'),
		' Finished', FailureHandling.OPTIONAL) == false) {
			WebUI.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

			WebUI.verifyElementText(findTestObject('Projects_Communications/Page_Communications - Results/communication_Finished'),
					' Finished', FailureHandling.CONTINUE_ON_FAILURE)
		}

		WebUI.closeWindowIndex('1')

		WebUI.switchToWindowIndex('0', FailureHandling.CONTINUE_ON_FAILURE)
	}
}
