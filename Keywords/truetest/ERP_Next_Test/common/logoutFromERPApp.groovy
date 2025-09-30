package truetest.ERP_Next_Test.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class logoutFromERPApp {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projects -> Navigate to page '/app/projects'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/link_projects'))
        
        "Step 2: Click on div project -> Navigate to page '/app/project'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_projects/div_project'))
        
        "Step 3: Click on button userMenu"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/button_userMenu'))
        
        "Step 4: Click on button logOut -> Navigate to page '/login'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_app_project/button_logOut'))
        
        "Step 5: Click on div loginContent"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ERP Next Test/Page_login/div_loginContent'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

