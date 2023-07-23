package com.hrms.pages;

import org.openqa.selenium.By;

import static com.hrms.pages.CommonUsage.driver;

public class AddEmp {
    //= Objects & data==//
    public static By txt_firstname = By.name("txtEmpFirstName");
    public static By txt_lasttname = By.name("txtEmpLastName");
    public static By txt_middlename = By.name("txtEmpMiddleName");
    public static By txt_nickname = By.name("txtEmpNickName");
    public static By photo = By.id("photofile");
    public static By btn_save =By.id("btnEdit");
    public static By btn_Reset = By.className("resetbutton");
    public static By btn_Back = By.className("backbutton");




    //==========Functions========//


    public static void empdetails(AddEmpNames emp)
    {
        driver.findElement(txt_firstname).sendKeys(emp.getFirstName());
        driver.findElement(txt_lasttname).sendKeys(emp.getLastName());
        driver.findElement(txt_middlename).sendKeys(emp.getMiddleName());
        driver.findElement(txt_nickname).sendKeys(emp.getNickName());

    driver.findElement(btn_save).click();

    }







}
