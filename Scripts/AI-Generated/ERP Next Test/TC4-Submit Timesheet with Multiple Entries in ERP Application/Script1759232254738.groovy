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

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link projects - Navigate to page appprojects.png')

"Step 3: Click on div timesheetLink -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_timesheetLink'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on div timesheetLink - Navigate to page apptimesheet.png')

"Step 4: Click on button addTimesheet -> Navigate to page '/app/timesheet/new-timesheet-isdeovpcae'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_addTimesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button addTimesheet - Navigate to page apptimesheetnew-timesheet-isdeovpcae.png')

"Step 5: Click on input linkField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_linkField'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on input linkField.png')

"Step 6: Click on div optionPvin"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_optionPvin'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on div optionPvin.png')

"Step 7: Click on input textField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_textField'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on input textField.png')

"Step 8: Click on div abcOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_abcOption'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on div abcOption.png')

"Step 9: Click on input linkField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_linkField2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on input linkField2.png')

"Step 10: Enter input value in input linkField2"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_linkField2'), input_linkField2)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Enter input value in input linkField2.png')

"Step 11: Click on div usdOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_usdOption'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on div usdOption.png')

"Step 12: Click on input textField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_textField2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on input textField2.png')

"Step 13: Click on div abcOption2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_abcOption2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on div abcOption2.png')

"Step 14: Click on input feedback"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_feedback'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on input feedback.png')

"Step 15: Click on div optionHrEmp00001"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_optionHrEmp00001'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on div optionHrEmp00001.png')

"Step 16: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on div object.png')

"Step 17: Click on input textField3"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_textField3'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on input textField3.png')

"Step 18: Enter input value in input textField3"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_textField3'), input_textField3)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Enter input value in input textField3.png')

"Step 19: Click on input object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_object'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on input object.png')

"Step 20: Click on div day15"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_day15'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on div day15.png')

"Step 21: Click on input feedback2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_feedback2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on input feedback2.png')

"Step 22: Click on div dynamicObject (object2)"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet_new_timesheet_isdeovpcae/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet_new_timesheet_isdeovpcae/div_dynamicObject', ['div_dynamicObject_divNthChild': div_dynamicObject_divNthChild, 'div_dynamicObject_divNthChild_1': div_dynamicObject_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on div dynamicObject object2.png')

"Step 23: Click on input textField4"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_textField4'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on input textField4.png')

"Step 24: Click on button object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on button object.png')

"Step 25: Click on button addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/button_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Click on button addRow.png')

"Step 26: Click on div dataRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_dataRow'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on div dataRow.png')

"Step 27: Click on div optionPlanning"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_optionPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on div optionPlanning.png')

"Step 28: Click on input fromTime"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_fromTime'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 28-Click on input fromTime.png')

"Step 29: Click on div dynamicObject (day8)"

// Bind values to the variables in the locators of "AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet_new_timesheet_isdeovpcae/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Dynamic Objects/Page_app_timesheet_new_timesheet_isdeovpcae/div_dynamicObject', ['div_dynamicObject_divNthChild': div_dynamicObject_divNthChild_1, 'div_dynamicObject_divNthChild_1': div_dynamicObject_divNthChild_1_1]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on div dynamicObject day8.png')

"Step 30: Click on input hours"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_hours'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 30-Click on input hours.png')

"Step 31: Enter input value in input hours"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_hours'), input_hours)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 31-Enter input value in input hours.png')

"Step 32: Click on div addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/div_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 32-Click on div addRow.png')

"Step 33: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 33-Click on input checkbox.png')

"Step 34: Click on button save -> Navigate to page '/app/timesheet/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_isdeovpcae/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 34-Click on button save - Navigate to page apptimesheet.png')

"Step 35: Click on button submit"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_submit'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 35-Click on button submit.png')

"Step 36: Click on button confirmNo"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_confirmNo'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 36-Click on button confirmNo.png')

"Step 37: Click on link timesheet -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/link_timesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 37-Click on link timesheet - Navigate to page .png')

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Submit Timesheet with Multiple Entries in ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}