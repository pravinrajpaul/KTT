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

"Step 1: Navigate to /app/home"

TrueTestScripts.navigate("/app/home")

"Step 2: Click on link projects -> Navigate to page '/app/projects'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/link_projects'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link projects - Navigate to page appprojects.png')

"Step 3: Click on div timesheetLink -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_timesheetLink'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on div timesheetLink - Navigate to page apptimesheet.png')

"Step 4: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on input checkbox.png')

"Step 5: Click on span object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on span object.png')

"Step 6: Click on link actionOptions (delete)"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/link_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/link_actionOptions', ['link_actionOptions_liNthChild': link_actionOptions_liNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on link actionOptions delete.png')

"Step 7: Click on button confirmYes"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_confirmYes'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on button confirmYes.png')

"Step 8: Click on link cancel"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/link_cancel'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on link cancel.png')

"Step 9: Click on button object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on button object.png')

"Step 10: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on input checkbox.png')

"Step 11: Click on button actions"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_actions'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on button actions.png')

"Step 12: Click on link actionOptions (cancel2)"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/link_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/link_actionOptions', ['link_actionOptions_liNthChild': link_actionOptions_liNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on link actionOptions cancel2.png')

"Step 13: Click on button confirmationYes (yes)"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/button_confirmationYes"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/button_confirmationYes', ['button_confirmationYes_nth': button_confirmationYes_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on button confirmationYes yes.png')

"Step 14: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on input checkbox.png')

"Step 15: Click on button actions"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_actions'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on button actions.png')

"Step 16: Click on link actionOptions (delete)"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/link_actionOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/link_actionOptions', ['link_actionOptions_liNthChild': link_actionOptions_liNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on link actionOptions delete.png')

"Step 17: Click on button confirmationYes (yes2) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/button_confirmationYes"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet/button_confirmationYes', ['button_confirmationYes_nth': button_confirmationYes_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on button confirmationYes yes2 - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Manage Timesheet Actions in ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}