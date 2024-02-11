package ru.aston;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  public static final long IMPLICITLY_WAIT = 10;
  public static final long PAGE_LOAD_TIMEOUT = 10;
  public static final long SCRIPT_RUN_TIMEOUT = 10;

  private WebDriver driver;

  public WebDriver getDriver() {
    return driver;
  }

  public WebDriver createDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    options.addArguments("--window-size=1920x1080");
    driver = new ChromeDriver(options);
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(SCRIPT_RUN_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    return driver;
  }

  @BeforeMethod
  protected void beforeMethod() {
    driver = createDriver();
    getDriver().get("https://www.mts.by/");
    WebElement cookieButton =
        getDriver().findElement(By.xpath("//button[@class ='btn btn_black cookie__ok']"));
    cookieButton.click();
  }

  @AfterMethod
  protected void afterMethod() {
    driver.quit();
  }
}
