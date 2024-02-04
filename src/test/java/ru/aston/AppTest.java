package ru.aston;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseTest{

    @Test
    public void testOnlinePayForm() {
        WebElement onlinePayFormText = getDriver().findElement(By.xpath("//section[@class='pay']/div[@class='pay__wrapper']/h2"));
        Assert.assertEquals(onlinePayFormText.getText(), "Онлайн пополнение\nбез комиссии");
    }
}
