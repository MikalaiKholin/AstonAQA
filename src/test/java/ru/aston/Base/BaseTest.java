package ru.aston.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  public static final long IMPLICITLY_WAIT = 5;
  public static final long PAGE_LOAD_TIMEOUT = 5;
  public static final long SCRIPT_RUN_TIMEOUT = 5;

  private WebDriver driver;

  public WebDriver getDriver() {
    return driver;
  }

  public WebDriver createDriver() {
    ChromeOptions options = new ChromeOptions();
    //options.addArguments("--headless");
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
    //driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(SCRIPT_RUN_TIMEOUT, TimeUnit.SECONDS);
    return driver;
  }

  @BeforeTest
  protected void beforeMethod() {
    if (driver == null) driver = createDriver();
    getDriver().get("https://www.wildberries.ru/");
  }

  @AfterTest
  protected void afterMethod() {
    //driver.close();
    //driver.quit();
  }
}
