import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ERP_Next_Test.common.createNewProjectInERPApp
import truetest.ERP_Next_Test.common.logoutFromERPApp
import truetest.ERP_Next_Test.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_home/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on input email.png')

"Step 3: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_home/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Enter input value in input email.png')

"Step 4: Click on input password"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_home/input_password'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on input password.png')

"Step 5: Enter input value in input password"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_home/input_password'), input_password)

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Enter input value in input password.png')

"Step 6: Click on button login"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_home/button_login'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button login.png')

"Step 7: Navigate to projects and create a new project in the ERP app."

createNewProjectInERPApp.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button save.png')

"Step 9: Click on link project"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/link_project'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on link project.png')

"Step 10: Click on link project"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/link_project'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on link project.png')

"Step 11: Access user menu and log out from the ERP application."

logoutFromERPApp.execute()

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Create Project and Verify Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}