package com.hrms.testscripts;

import com.hrms.pages.*;
import org.junit.Test;

public class TC002 {
    @Test
    public void tc02(){
        CommonUsage.openHrmsapp();
        LoginPage.login("nareshit","nareshit");
        EmployeeInformation.add();
        AddEmpNames hru = new AddEmpNames();
        hru.setLastName("Balda");
        hru.setFirstName("Hrudhay Venkata");
        hru.setMiddleName("Surya satyanarayana");
        hru.setNickName("BHVSS");

        AddEmp.empdetails(hru);
//        LogOutPage.logout();
//        CommonUsage.close();
    }
}
