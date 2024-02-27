package ru.aston.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WildberriesCartPageModel extends BaseModel {
    public WildberriesCartPageModel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='accordion__list-item list-item j-b-basket-item']//span[@class='good-info__good-name']")
    private List<WebElement> productsInCartNames;

    @FindBy(xpath = "//div[@class='accordion__list-item list-item j-b-basket-item']//span[@class='good-info__good-brand ']")
    private List<WebElement> productsInCartBrands;

    @FindBy(xpath = "//div[@class='accordion__list-item list-item j-b-basket-item']//div[@class='list-item__price-wallet']")
    private List<WebElement> productsInCartPricesWB;

    @FindBy(xpath = "//div[@class='accordion__list-item list-item j-b-basket-item']//div[@class='list-item__price-new wallet']")
    private List<WebElement> productsInCartPrices;

    @FindBy(xpath = "//div[@class='basket-order__b-top b-top']//span[@class='b-right']")
    private WebElement priceSumm;

    @FindBy(xpath = "//div[@class='basket-order__b-top b-top']")
    private WebElement quantityAndSumm;

    public String getPriceSumm(){
        return priceSumm.getText();
    }

    public String getQuantityAndSumm(){
        return quantityAndSumm.getText();
    }

    public List<WebElement> getProductsInCartNames(){
        return productsInCartNames;
    }

    public List<WebElement> getProductsInCartBrands(){
        return productsInCartBrands;
    }

    public List<WebElement> getProductsInCartPricesWB() {
        return productsInCartPricesWB;
    }

    public List<WebElement> getProductsInCartPrices() {
        return productsInCartPrices;
    }
}
