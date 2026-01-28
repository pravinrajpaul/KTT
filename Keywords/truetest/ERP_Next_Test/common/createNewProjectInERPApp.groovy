package truetest.ERP_Next_Test.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class createNewProjectInERPApp {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projects2 -> Navigate to page '/app/projects'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_home/link_projects2'))
        
        "Step 2: Click on div project -> Navigate to page '/app/project'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_project'))
        
        "Step 3: Click on button addProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/button_addProject'))
        
        "Step 4: Click on input object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/input_object'))
        
        "Step 5: Enter input value in input object"
        
        WebUI.setText(findTestObject('AI-Generated/ERP Next Test/Page_app_project/input_object'), data['input_object'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_object'] = testData.getValue('input_object', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_object'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

