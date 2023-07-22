package com.hrms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class CommonUsage {
    public static WebDriver driver;
    public static void openHrmsapp(){
        driver=new ChromeDriver();
        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    }
    public void close(){
        driver.close();
    }
}
