package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver_Setup {

        public WebDriver driver;


        @BeforeSuite
        public void OpenBrowser(){
            driver = new ChromeDriver();
        }


        @AfterSuite
        public void CloseBrowser(){
            driver.quit();

        }
    }

