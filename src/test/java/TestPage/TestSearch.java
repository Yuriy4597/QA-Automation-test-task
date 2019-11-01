package TestPage;


import Page.GoogleSearch;
import WebDriver.WebDriverContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TestSearch {

    @Test(description = " QA-Automation-test-task ")
    public void setTest() {

        WebDriverContext.loadURL("https://www.google.com.ua/");
        GoogleSearch test = new GoogleSearch();

        WebDriverContext.captureScreen();
        test.setSearchInput("");
        WebDriverContext.captureScreen();
    }




    @AfterMethod
    public void tearDown() {
        WebDriverContext.stop();
    }




}
