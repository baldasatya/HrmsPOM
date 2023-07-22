package com.hrms.pages;

import org.openqa.selenium.By;

public class LogOutPage extends  CommonUsage{
    //===Objects &DATA===/
    public static By link_logout = By.linkText("Logout");

    public void logout (){
        driver.findElement(link_logout).click();
    }
}
