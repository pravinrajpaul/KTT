import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ERP_Next_Test.common.createNewProjectInERPApp as createNewProjectInERPApp
import truetest.ERP_Next_Test.common.logoutFromERPApp as logoutFromERPApp
import truetest.ERP_Next_Test.custom.TrueTestScripts as TrueTestScripts
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

'Step 1: Navigate to /app/home'
TrueTestScripts.navigate('/app/home')

WebUI.callTestCase(findTestCase('AI-Generated/Modules/Login'), [('input_email') : 'Administrator', ('input_password') : 'Pravin@1234'], FailureHandling.STOP_ON_FAILURE)

'Step 2: Navigate to projects and create a new project in the ERP app.'
createNewProjectInERPApp.execute(data_path_0, Integer.valueOf(index_0))

'Step 3: Click on button save'
WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on button save.png')
'Step 4: Access user menu and log out from the ERP application.'
logoutFromERPApp.execute()

'Step 5: Take full page screenshot as checkpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Create New Project and Logout from ERP Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.SetUp
def setup() {
    WebUI.openBrowser('')

    WebUI.setViewPortSize(1920, 1080)
}

@com.kms.katalon.core.annotation.TearDown
def teardown() {
    WebUI.closeBrowser()
}

