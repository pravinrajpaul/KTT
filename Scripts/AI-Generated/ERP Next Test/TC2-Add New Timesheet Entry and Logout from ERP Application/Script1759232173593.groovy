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

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link projects - Navigate to page appprojects.png')

"Step 4: Click on div timesheetLink -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_timesheetLink'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on div timesheetLink - Navigate to page apptimesheet.png')

"Step 5: Click on button addTimesheet -> Navigate to page '/app/timesheet/new-timesheet-qiplohenmz'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_addTimesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button addTimesheet - Navigate to page apptimesheetnew-timesheet-qiplohenmz.png')

"Step 6: Click on input textField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_textField'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on input textField.png')

"Step 7: Click on div optionPvin"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_optionPvin'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on div optionPvin.png')

"Step 8: Click on input linkField1"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_linkField1'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on input linkField1.png')

"Step 9: Click on div optionAbc"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_optionAbc'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on div optionAbc.png')

"Step 10: Click on input linkField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_linkField2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on input linkField2.png')

"Step 11: Enter input value in input linkField2"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_linkField2'), input_linkField2)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Enter input value in input linkField2.png')

"Step 12: Click on div optionUsd"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_optionUsd'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on div optionUsd.png')

"Step 13: Click on input textField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_textField2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on input textField2.png')

"Step 14: Click on div optionAbcsGear"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_optionAbcsGear'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on div optionAbcsGear.png')

"Step 15: Click on input textField3"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_textField3'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on input textField3.png')

"Step 16: Click on div optionEmployee"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_optionEmployee'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on div optionEmployee.png')

"Step 17: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on div object.png')

"Step 18: Click on div optionPlanning"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_optionPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on div optionPlanning.png')

"Step 19: Click on input fromTime"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_fromTime'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on input fromTime.png')

"Step 20: Click on div datepickerCell"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_datepickerCell'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on div datepickerCell.png')

"Step 21: Click on input hrs"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_hrs'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on input hrs.png')

"Step 22: Enter input value in input hrs"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_hrs'), input_hrs)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Enter input value in input hrs.png')

"Step 23: Click on div object2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on div object2.png')

"Step 24: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on input checkbox.png')

"Step 25: Click on button addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/button_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on button addRow.png')

"Step 26: Click on div dataRowCell"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_dataRowCell'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on div dataRowCell.png')

"Step 27: Click on div selectResearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_selectResearch'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on div selectResearch.png')

"Step 28: Click on input fromTime2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_fromTime2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on input fromTime2.png')

"Step 29: Click on div day8"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/div_day8'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on div day8.png')

"Step 30: Click on input hoursField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_hoursField'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on input hoursField.png')

"Step 31: Enter input value in input hoursField"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_hoursField'), input_hoursField)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Enter input value in input hoursField.png')

"Step 32: Click on input checkbox2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/input_checkbox2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on input checkbox2.png')

"Step 33: Click on button save -> Navigate to page '/app/timesheet/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_qiplohenmz/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on button save - Navigate to page apptimesheet.png')

"Step 34: Click on link timesheet -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/link_timesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on link timesheet - Navigate to page apptimesheet.png')

"Step 35: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Click on button userMenu.png')

"Step 36: Click on button logOut -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_logOut'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Click on button logOut - Navigate to page login.png')

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Add New Timesheet Entry and Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}