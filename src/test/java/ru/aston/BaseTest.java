package ru.aston;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static final long IMPLICITLY_WAIT = 15;
    public static final long PAGE_LOAD_TIMEOUT = 15;
    public static final long SCRIPT_RUN_TIMEOUT = 15;

    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod() throws InterruptedException {
        driver.get("https://www.mts.by/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT,
                TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,
                TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(SCRIPT_RUN_TIMEOUT,
                TimeUnit.SECONDS);
    }

    @AfterMethod
    protected void afterMethod() throws InterruptedException {
        driver.quit();
    }
}
