import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button userMenu.png')

"Step 4: Click on button logOut -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/button_logOut'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on button logOut - Navigate to page login.png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-User Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}