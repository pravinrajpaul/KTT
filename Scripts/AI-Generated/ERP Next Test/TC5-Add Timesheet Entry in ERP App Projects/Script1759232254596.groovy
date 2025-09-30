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

"Step 1: Navigate to /app/home"

TrueTestScripts.navigate("/app/home")

"Step 2: Click on link projects -> Navigate to page '/app/projects'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/link_projects'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link projects - Navigate to page appprojects.png')

"Step 3: Click on div timesheetLink -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_timesheetLink'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on div timesheetLink - Navigate to page apptimesheet.png')

"Step 4: Click on button addTimesheet -> Navigate to page '/app/timesheet/new-timesheet-mewgittmag'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_addTimesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button addTimesheet - Navigate to page apptimesheetnew-timesheet-mewgittmag.png')

"Step 5: Click on input textField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_textField'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on input textField.png')

"Step 6: Click on div optionPvin"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_optionPvin'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on div optionPvin.png')

"Step 7: Click on input feedback"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_feedback'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on input feedback.png')

"Step 8: Click on div abcOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_abcOption'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on div abcOption.png')

"Step 9: Click on input feedback2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_feedback2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on input feedback2.png')

"Step 10: Enter input value in input feedback2"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_feedback2'), input_feedback2)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Enter input value in input feedback2.png')

"Step 11: Click on div optionUsd"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_optionUsd'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on div optionUsd.png')

"Step 12: Click on input linkField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_linkField'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on input linkField.png')

"Step 13: Click on div abcGearOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_abcGearOption'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on div abcGearOption.png')

"Step 14: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on div object.png')

"Step 15: Click on div researchOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_researchOption'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on div researchOption.png')

"Step 16: Click on input fromTime"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_fromTime'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on input fromTime.png')

"Step 17: Click on div object2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on div object2.png')

"Step 18: Click on input hours"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_hours'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on input hours.png')

"Step 19: Enter input value in input hours"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_hours'), input_hours)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Enter input value in input hours.png')

"Step 20: Click on div addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on div addRow.png')

"Step 21: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on input checkbox.png')

"Step 22: Click on button addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/button_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on button addRow.png')

"Step 23: Click on div object3"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on div object3.png')

"Step 24: Click on div planningOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_planningOption'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on div planningOption.png')

"Step 25: Click on input fromTime2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_fromTime2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on input fromTime2.png')

"Step 26: Click on div day8"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/div_day8'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on div day8.png')

"Step 27: Click on input hrs"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_hrs'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on input hrs.png')

"Step 28: Enter input value in input hrs"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_hrs'), input_hrs)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Enter input value in input hrs.png')

"Step 29: Click on input checkbox2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/input_checkbox2'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on input checkbox2.png')

"Step 30: Click on button save -> Navigate to page '/app/timesheet/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_mewgittmag/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on button save - Navigate to page apptimesheet.png')

"Step 31: Click on link timesheet -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/link_timesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on link timesheet - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add Timesheet Entry in ERP App Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}