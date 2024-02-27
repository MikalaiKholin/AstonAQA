package ru.aston.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.aston.Model.MainPage;

public class BaseTest {
  protected static AndroidDriver<AndroidElement> driver;
  //protected MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

  @BeforeClass
  public static void beforeMethod() {
    driver = Driver.getDriver();
  }

  @AfterClass
  public static void afterMethod() {
    Driver.quit();
  }
}
