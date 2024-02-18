package ru.aston.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WildberriesStartPageModel extends BaseModel {
  @FindBy(xpath = "//article[@data-target-url='MI']")
  private List<WebElement> products;

  @FindBy(xpath = "//a[@data-wba-header-name='Cart']")
  private WebElement cartButton;

  public List<WebElement> getProducts() {
    return products;
  }

  public void clickOpenCartButton(){
    cartButton.click();
  }

  public void productAddToCart(int num) {
    cartButtonWait();
    getDriver()
        .findElement(
            By.xpath(
                String.format(
                    "//article[@data-target-url='MI' and @data-nm-id='%s']//a[@class='product-card__add-basket j-add-to-basket btn-main']",
                    getId(num))))
        .click();
  }

  public String getId(int num) {
    return products.get(num).getAttribute("data-nm-id");
  }

  public String getPrice(String id) {
    return getDriver()
        .findElement(
            By.xpath(
                String.format(
                    "//article[@data-target-url='MI' and @data-nm-id='%s']//ins[@class='price__lower-price wallet-price']",
                    id)))
        .getText();
  }

  public String getBrand(String id) {
    return getDriver()
            .findElement(
                    By.xpath(
                            String.format(
                                    "//article[@data-target-url='MI' and @data-nm-id='%s']//span[@class='product-card__brand-container']",
                                    id)))
            .getText();
  }

  public String getProductName(String id) {
    return getDriver()
            .findElement(
                    By.xpath(
                            String.format(
                                    "//article[@data-target-url='MI' and @data-nm-id='%s']//span[@class='product-card__name']",
                                    id)))
            .getText();
  }

  public void cartButtonWait() {
    List<WebElement> cartButton =
        getDriver()
            .findElements(
                By.xpath("//a[@class='product-card__add-basket j-add-to-basket btn-main']"));
    while (cartButton.isEmpty()) {
      getDriver().navigate().refresh();
      cartButton =
          getDriver()
              .findElements(
                  By.xpath("//a[@class='product-card__add-basket j-add-to-basket btn-main']"));
    }
  }

  public WildberriesStartPageModel(WebDriver driver) {
    super(driver);
  }
}
