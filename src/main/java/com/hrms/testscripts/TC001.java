package com.hrms.testscripts;

import com.hrms.pages.CommonUsage;
import com.hrms.pages.LoginPage;
import org.junit.Test;

public class TC001 {
    // Test loginfunctionality
    @Test
    public void tc001(){
        CommonUsage.openHrmsapp();
        LoginPage.login("nareshit" ,"nareshit");
    }
}
