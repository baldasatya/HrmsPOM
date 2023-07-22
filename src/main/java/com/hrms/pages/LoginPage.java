package com.hrms.pages;

import org.openqa.selenium.By;

public class LoginPage extends CommonUsage {
    //objects and data
    public static  By txt_username = By.name("txtUserName");
    public static By txt_pas =By.name("txtPassword");
    public static By btn_login =By.name("Submit");
    public static By btn_clear = By.name("clear");
    //functions
    public static void login(String un,String pas){
        driver.findElement(txt_username).sendKeys(un);
        driver.findElement(txt_pas).sendKeys(pas);
        driver.findElement(btn_login).click();
    }
       
}
