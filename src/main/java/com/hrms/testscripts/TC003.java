package com.hrms.testscripts;

import com.hrms.pages.CommonUsage;
import com.hrms.pages.EmployeeInformation;
import com.hrms.pages.LoginPage;
import org.junit.Test;

public class TC003 {
    @Test
    public void tc03(){
        CommonUsage.openHrmsapp();
        LoginPage.login("nareshit","nareshit");
        EmployeeInformation.select(2);
    }
}
