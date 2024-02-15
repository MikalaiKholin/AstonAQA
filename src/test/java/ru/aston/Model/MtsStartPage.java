package ru.aston.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MtsStartPage extends BaseModel{
    @FindBy(xpath = "//div[@class='pay__form']//div[@class='select__wrapper']")
    private WebElement onlinePayments;

    public MtsStartPage(WebDriver driver) {
        super(driver);
    }
}
