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

"Step 3: Click on link projects -> Navigate to page '/app/projects'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/link_projects'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link projects - Navigate to page appprojects.png')

"Step 4: Click on div timesheetLink -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_timesheetLink'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on div timesheetLink - Navigate to page apptimesheet.png')

"Step 5: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on input checkbox.png')

"Step 6: Click on button actions"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_actions'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button actions.png')

"Step 7: Click on link delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/link_delete'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link delete.png')

"Step 8: Click on button confirmYes"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_confirmYes'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button confirmYes.png')

"Step 9: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button userMenu.png')

"Step 10: Click on button logOut -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_logOut'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button logOut - Navigate to page login.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Delete Timesheet Entry and Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}