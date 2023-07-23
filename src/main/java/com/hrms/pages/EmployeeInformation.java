package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeInformation extends CommonUsage{

    //===Data & Objects==//
    public static By btn_ADD = By.xpath("//input[@value = 'Add']");
    public static By btn_Delete = By.xpath("//input[@value = 'Delete']");
    public static By btn_Search= By.xpath("//input[@value = 'Search']");
    public static By btn_Reset= By.xpath("//input[@value = 'Reset']");
    public static By drpdwn_select= By.id("loc_code");
    public static By searchbar =By.name("loc_name");
    public static By adminmodule =By.linkText("Admin");
    public static By pimmodule =By.linkText("PIM");
    public static By Leavemodule =By.linkText("Leave");
    public static By Timemodule =By.linkText("Time");
    public static By Benfitsmodule = By.linkText("Benefits");
    public static By Recruitmentmodule = By.linkText("Recruitment");
    public static By Performancemodule = By.linkText("Performance");
    public static By Reportsmodule = By.linkText("Reports");
    public static By BugTracker = By.linkText("Bug Tracker");
    public static By Helpmodule = By.linkText("Help");
    public  static By link_next = By.linkText("Next");

    //=========FUNCTIONS=============//

    public static void add(){
        driver.switchTo().frame("rightMenu");
        driver.findElement(btn_ADD).click();
    }
    public  static void delete(){
        driver.findElement(btn_Delete).click();
    }
    public static void search(String searchdetails){
        driver.findElement(searchbar).sendKeys(searchdetails);
        driver.findElement(btn_Search).click();
    }
    public static void reset(){
        driver.findElement(btn_Reset).click();
    }
    public static void select(int indexnum){
        driver.switchTo().frame("rightMenu");

         WebElement dropdown = driver.findElement(drpdwn_select);
        Select obj = new Select(dropdown);
        obj.selectByIndex(indexnum);
    }
    public static void next(){
        driver.findElement(link_next).click();

    }










}
