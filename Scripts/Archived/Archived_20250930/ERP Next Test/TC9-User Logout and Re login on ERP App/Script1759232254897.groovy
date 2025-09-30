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

assert 1 == 1

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link uh"

WebUI.enhancedClick(findTestObject('Archived/Archived_20250930/ERP Next Test/Page_home/link_uh'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link uh.png')

"Step 3: Click on link logOut"

WebUI.enhancedClick(findTestObject('Archived/Archived_20250930/ERP Next Test/Page_home/link_logOut'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link logOut.png')

"Step 4: Click on link home"

WebUI.enhancedClick(findTestObject('Archived/Archived_20250930/ERP Next Test/Page_home/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link home.png')

"Step 5: Login into Application"

TrueTestScripts.login()

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-User Logout and Re login on ERP App_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}