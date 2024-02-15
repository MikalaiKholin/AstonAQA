package ru.aston.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MtsStartPage extends BaseModel{
    @FindBy(xpath = "//div[@class='pay__form']//div[@class='select__wrapper']")
    private WebElement onlinePayments;

    @FindBy(xpath = "//div[@class='pay__forms']/form/div/input[@class='phone']")
    private WebElement payFormPhoneNumber;

    @FindBy(xpath = "//div[@class='pay__forms']/form/div/input[@class='total_rub']")
    private WebElement payFormTotalRub;

    @FindBy(xpath = "//div[@class='pay__forms']/form/div/input[@class='email']")
    private WebElement payFormEmail;

    @FindBy(xpath = "//div[@class='pay__forms']/form/button")
    private WebElement payFormButton;

    public void inputPayFormPhone(String phone){
        payFormPhoneNumber.sendKeys(phone);
    }

    public void inputPayFormTotalRub(String phone){
        payFormTotalRub.sendKeys(phone);
    }

    public void inputPayFormEmail(String phone){
        payFormEmail.sendKeys(phone);
    }

    public void payFormButtonClick(){
        payFormButton.click();
    }

    public MtsStartPage(WebDriver driver) {
        super(driver);
    }
}
