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

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link projects - Navigate to page appprojects.png')

"Step 4: Click on div timesheetLink -> Navigate to page '/app/timesheet'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_timesheetLink'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on div timesheetLink - Navigate to page apptimesheet.png')

"Step 5: Click on button addTimesheet -> Navigate to page '/app/timesheet/new-timesheet-skzrbnfsvc'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet/button_addTimesheet'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button addTimesheet - Navigate to page apptimesheetnew-timesheet-skzrbnfsvc.png')

"Step 6: Click on input linkField3"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_linkField3'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input linkField3.png')

"Step 7: Click on div optionPvin"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_optionPvin'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div optionPvin.png')

"Step 8: Click on input object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_object'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on input object.png')

"Step 9: Click on div selectOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_selectOption'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on div selectOption.png')

"Step 10: Click on input object2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input object2.png')

"Step 11: Enter input value in input object2"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_object2'), input_object2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input object2.png')

"Step 12: Click on div selectUsd"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_selectUsd'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on div selectUsd.png')

"Step 13: Click on input textField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_textField'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on input textField.png')

"Step 14: Click on div optionHremp"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_optionHremp'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on div optionHremp.png')

"Step 15: Click on input textField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_textField2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input textField2.png')

"Step 16: Click on div optionAbcsGear"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_optionAbcsGear'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div optionAbcsGear.png')

"Step 17: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on div object.png')

"Step 18: Click on div optionResearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_optionResearch'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on div optionResearch.png')

"Step 19: Click on input fromTime"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_fromTime'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on input fromTime.png')

"Step 20: Enter input value in input fromTime"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_fromTime'), input_fromTime)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Enter input value in input fromTime.png')

"Step 21: Click on div addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on div addRow.png')

"Step 22: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on input checkbox.png')

"Step 23: Click on button addRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/button_addRow'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on button addRow.png')

"Step 24: Click on div dataRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_dataRow'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on div dataRow.png')

"Step 25: Click on input activityType"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_activityType'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on input activityType.png')

"Step 26: Click on div selectPlanning"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_selectPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on div selectPlanning.png')

"Step 27: Click on input hoursField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_hoursField'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on input hoursField.png')

"Step 28: Enter input value in input hoursField"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_hoursField'), input_hoursField)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Enter input value in input hoursField.png')

"Step 29: Click on div gridField"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_gridField'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on div gridField.png')

"Step 30: Click on div staticAreaZero"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_staticAreaZero'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on div staticAreaZero.png')

"Step 31: Click on input hoursField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_hoursField2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on input hoursField2.png')

"Step 32: Enter input value in input hoursField2"

WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_hoursField2'), input_hoursField2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Enter input value in input hoursField2.png')

"Step 33: Click on div gridField2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_gridField'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on div gridField2.png')

"Step 34: Click on div staticArea"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_staticArea'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on div staticArea.png')

"Step 35: Click on input checkbox2"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/input_checkbox2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on input checkbox2.png')

"Step 36: Click on div totalWorkingHours"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/div_totalWorkingHours'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on div totalWorkingHours.png')

"Step 37: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on button save.png')

"Step 38: Click on button modalAction"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/button_modalAction'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on button modalAction.png')

"Step 39: Click on button userMenu"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/button_userMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on button userMenu.png')

"Step 40: Click on button logOut -> Navigate to page '/login'"

WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_timesheet_new_timesheet_skzrbnfsvc/button_logOut'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on button logOut - Navigate to page login.png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Add Timesheet Entry with Activity Types and Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}