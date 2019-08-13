package communications

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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable

public class Projects {
	@Keyword
	def Create_Project(String comm_name, String comm_desc, String comm_type) {
		WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_ New Project'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/select_Communication'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_Next'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_CommunicationName'), comm_name,
				FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/textarea_CommunicationDescript'), comm_desc,
				FailureHandling.CONTINUE_ON_FAILURE)

		switch(comm_type) {
			case "Batch":
				WebUI.check(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_batchComm'), FailureHandling.CONTINUE_ON_FAILURE)
				break
			case "Interractive":
				WebUI.check(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/input_interactiveComm'), FailureHandling.CONTINUE_ON_FAILURE)
				break
			case "On_Demand":
				break
			default:
				KeywordUtil.markFailedAndStop("You have entered the wrong communication type")
				break
		}

		WebUI.delay(1)

		WebUI.click(findTestObject('Projects_Communications/Page_Projects - Projects - EOS/button_Finish'))

		WebUI.delay(2)

		WebUI.back()
	}
}
