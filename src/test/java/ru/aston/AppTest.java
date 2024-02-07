package ru.aston;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppTest extends BaseTest{

    @Test
    public void testOnlinePayFormVisibility() {
        WebElement onlinePayFormText = getDriver().findElement(By.xpath("//section[@class='pay']/div[@class='pay__wrapper']/h2"));
        Assert.assertEquals(onlinePayFormText.getText(), "Онлайн пополнение\nбез комиссии");
    }

    @DataProvider(name = "paySystems")
    public String[][] paySystems() {
        return new String[][] {
                { "Visa" },
                { "Verified By Visa" },
                { "MasterCard" },
                { "MasterCard Secure Code" },
                { "Белкарт" },
                { "МИР" }
        };
    }
    @Test(dataProvider = "paySystems")
    public void testPaySystemLogo(String paySystem) {
        WebElement paySystemLogo = getDriver().findElement(By.xpath(String.format("//div[@class='pay__partners']/ul/li/img[@alt = '%s']", paySystem)));
        Assert.assertTrue(paySystemLogo.isDisplayed());
    }

    @Test
    public void testMoreDetailsLink() {
        WebElement moreDetailsButton = getDriver().findElement(By.xpath("//section[@class='pay']/div[@class='pay__wrapper']" +
                "/a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"));
        moreDetailsButton.click();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Test
    public void testOnlinePayForm() {
        String phone = "297777777";
        String paySum = "10.05";
        String email = "tt@gmail.com";
        getDriver().findElement(By.xpath("//div[@class='pay__forms']/form/div/input[@class='phone']")).sendKeys(phone);
        getDriver().findElement(By.xpath("//div[@class='pay__forms']/form/div/input[@class='total_rub']")).sendKeys(paySum);
        getDriver().findElement(By.xpath("//div[@class='pay__forms']/form/div/input[@class='email']")).sendKeys(email);
        getDriver().findElement(By.xpath("//div[@class='pay__forms']/form/button")).click();

        WebElement frame = getDriver().findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        getDriver().switchTo().frame(frame);
        WebElement paymentDetails = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath("//div[@class='app-wrapper__content']/app-payment-container/app-header")));
        Assert.assertEquals(paymentDetails.getText(), String.format("%s BYN\nОплата: Услуги связи Номер:375%s", paySum, phone));
    }
}
