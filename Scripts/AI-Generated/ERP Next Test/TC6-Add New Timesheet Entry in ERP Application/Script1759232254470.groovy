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

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link projects -> Navigate to page '/app/projects'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/link_projects'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link projects - Navigate to page appprojects.png')

"Step 4: Click on link dailyTimesheetSummary -> Navigate to page '/app/query-report/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/link_dailyTimesheetSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link dailyTimesheetSummary - Navigate to page appquery-report.png')

"Step 5: Click on link projects -> Navigate to page '/app/projects'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_query_report/link_projects'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link projects - Navigate to page appprojects.png')

"Step 6: Click on link timesheet -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/link_timesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link timesheet - Navigate to page apptimesheet.png')

"Step 7: Click on button addTimesheet2 -> Navigate to page '/app/timesheet/new-timesheet-zbpicrvntf'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_addTimesheet2'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button addTimesheet2 - Navigate to page apptimesheetnew-timesheet-zbpicrvntf.png')

"Step 8: Click on input text"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_text'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on input text.png')

"Step 9: Click on div pvinOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_pvinOption'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on div pvinOption.png')

"Step 10: Click on input text2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_text2'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on input text2.png')

"Step 11: Click on div optionAbcAbc"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_optionAbcAbc'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div optionAbcAbc.png')

"Step 12: Click on input text3"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_text3'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on input text3.png')

"Step 13: Enter input value in input text3"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_text3'), input_text3)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Enter input value in input text3.png')

"Step 14: Click on div optionUsd"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_optionUsd'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on div optionUsd.png')

"Step 15: Click on input text4"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_text4'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on input text4.png')

"Step 16: Click on div optionAbcsGearProj0001"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_optionAbcsGearProj0001'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on div optionAbcsGearProj0001.png')

"Step 17: Click on input text5"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_text5'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on input text5.png')

"Step 18: Click on div optionHrEmp00001"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_optionHrEmp00001'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on div optionHrEmp00001.png')

"Step 19: Click on div dataRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_dataRow'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on div dataRow.png')

"Step 20: Click on div executionOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_executionOption'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on div executionOption.png')

"Step 21: Click on input fromTime"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_fromTime'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on input fromTime.png')

"Step 22: Click on div datePickerDay15"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_datePickerDay15'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on div datePickerDay15.png')

"Step 23: Click on input hrs"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_hrs'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Click on input hrs.png')

"Step 24: Enter input value in input hrs"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/input_hrs'), input_hrs)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Enter input value in input hrs.png')

"Step 25: Click on div addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/div_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Click on div addRow.png')

"Step 26: Click on button save -> Navigate to page '/app/timesheet/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_zbpicrvntf/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on button save - Navigate to page apptimesheet.png')

"Step 27: Click on link timesheet -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/link_timesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on link timesheet - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Add New Timesheet Entry in ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}