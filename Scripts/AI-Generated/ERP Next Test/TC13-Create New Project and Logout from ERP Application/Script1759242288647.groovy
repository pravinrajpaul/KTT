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

"Step 1: Navigate to /app/home"

TrueTestScripts.navigate("/app/home")

"Step 2: Navigate to projects and create a new project in the ERP app."

createNewProjectInERPApp.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on button save.png')

"Step 4: Access user menu and log out from the ERP application."

logoutFromERPApp.execute()

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Create New Project and Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}