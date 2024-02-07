package ru.aston;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest extends BaseTest{
    @DataProvider(name = "onlinePayForms")
    public String[][] onlinePayForms() {
        return new String[][] {
                { "Услуги связи", "Номер телефона", "Сумма", "E-mail для отправки чека"},
                { "Домашний интернет", "Номер абонента", "Сумма", "E-mail для отправки чека"},
                { "Рассрочка", "Номер счета на 44", "Сумма", "E-mail для отправки чека"},
                { "Задолженность", "Номер счета на 2073", "Сумма", "E-mail для отправки чека"}
        };
    }
    @Test(dataProvider = "onlinePayForms")
    public void testOnlinePayForms(String payment, String placeholder1, String placeholder2, String placeholder3) {
        getDriver().findElement(By.xpath("//div[@class='pay__form']//div[@class='select__wrapper']")).click();
        getDriver().findElement(By.xpath(String.format("//div[@class='pay__form']//p[contains(text(), '%s')]", payment))).click();
        Assert.assertEquals(getDriver().findElement(By.xpath("//form[@class='pay-form opened']/div[1]/input")).getAttribute("placeholder"), placeholder1);
        Assert.assertEquals(getDriver().findElement(By.xpath("//form[@class='pay-form opened']/div[2]/input")).getAttribute("placeholder"), placeholder2);
        Assert.assertEquals(getDriver().findElement(By.xpath("//form[@class='pay-form opened']/div[3]/input")).getAttribute("placeholder"), placeholder3);
    }


}
