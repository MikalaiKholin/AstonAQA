package ru.aston;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.aston.Base.BaseTest;

import java.time.Duration;

public class AppTest extends BaseTest {
  private final String PHONE = "297777777";
  private final String PAYSUM = "10.05";
  private final String EMAIL = "tt@gmail.com";

  @DataProvider(name = "onlinePayForms")
  public String[][] onlinePayForms() {
    return new String[][] {
      {"Услуги связи", "Номер телефона", "Сумма", "E-mail для отправки чека"},
      {"Домашний интернет", "Номер абонента", "Сумма", "E-mail для отправки чека"},
      {"Рассрочка", "Номер счета на 44", "Сумма", "E-mail для отправки чека"},
      {"Задолженность", "Номер счета на 2073", "Сумма", "E-mail для отправки чека"}
    };
  }

  @Test(dataProvider = "onlinePayForms")
  public void testOnlinePayForms(
      String payment, String placeholder1, String placeholder2, String placeholder3) {
    getDriver()
        .findElement(By.xpath("//div[@class='pay__form']//div[@class='select__wrapper']"))
        .click();
    getDriver()
        .findElement(
            By.xpath(
                String.format("//div[@class='pay__form']//p[contains(text(), '%s')]", payment)))
        .click();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//form[@class='pay-form opened']/div[1]/input"))
            .getAttribute("placeholder"),
        placeholder1);
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//form[@class='pay-form opened']/div[2]/input"))
            .getAttribute("placeholder"),
        placeholder2);
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//form[@class='pay-form opened']/div[3]/input"))
            .getAttribute("placeholder"),
        placeholder3);
    softAssert.assertAll();
  }

  @Test
  public void testOnlinePayDetailsOnHeader() {
    addPaymentData();
    WebElement paymentDetails =
        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
            .until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//app-payment-container/app-header")));
    Assert.assertEquals(
        paymentDetails.getText(),
        String.format("%s BYN\nОплата: Услуги связи Номер:375%s", PAYSUM, PHONE));
  }

  @Test
  public void testOnlinePaySummOnButton() {
    addPaymentData();
    WebElement paymentDetails =
        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
            .until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='card-page__card']/button")));
    Assert.assertEquals(paymentDetails.getText(), String.format("Оплатить %s BYN", PAYSUM));
  }

  @Test
  public void testOnlinePayCardPlaceholders() {
    addPaymentData();
    new WebDriverWait(getDriver(), Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-card-input")));
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//input[@id='cc-number']/following-sibling::label"))
            .getText(),
        "Номер карты");
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//input[@autocomplete='cc-exp']/following-sibling::label"))
            .getText(),
        "Срок действия");
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//input[@autocomplete='cc-csc']/following-sibling::label"))
            .getText(),
        "CVC");
    softAssert.assertEquals(
        getDriver()
            .findElement(By.xpath("//input[@autocomplete='cc-name']/following-sibling::label"))
            .getText(),
        "Имя держателя (как на карте)");
    softAssert.assertAll();
  }

  @DataProvider(name = "paySystems")
  public String[][] paySystems() {
    return new String[][] {
      {"assets/images/payment-icons/card-types/mastercard-system.svg"},
      {"assets/images/payment-icons/card-types/visa-system.svg"},
      {"assets/images/payment-icons/card-types/belkart-system.svg"},
      {"assets/images/payment-icons/card-types/mir-system-ru.svg"},
      {"assets/images/payment-icons/card-types/maestro-system.svg"}
    };
  }

  @Test(dataProvider = "paySystems")
  public void testOnlinePayPaySystems(String paySystemLogoAdr) {
    addPaymentData();
    WebElement paySystemLogo =
        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
            .until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath(String.format("//img[@src = '%s']", paySystemLogoAdr))));
    Assert.assertTrue(paySystemLogo.isDisplayed());
  }

  public void addPaymentData() {
    getDriver()
        .findElement(By.xpath("//div[@class='pay__forms']/form/div/input[@class='phone']"))
        .sendKeys(PHONE);
    getDriver()
        .findElement(By.xpath("//div[@class='pay__forms']/form/div/input[@class='total_rub']"))
        .sendKeys(PAYSUM);
    getDriver()
        .findElement(By.xpath("//div[@class='pay__forms']/form/div/input[@class='email']"))
        .sendKeys(EMAIL);
    getDriver().findElement(By.xpath("//div[@class='pay__forms']/form/button")).click();
    WebElement frame = getDriver().findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
    getDriver().switchTo().frame(frame);
  }
}
