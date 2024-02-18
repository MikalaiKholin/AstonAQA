package ru.aston;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.aston.Base.BaseTest;
import ru.aston.Model.*;

public class AppTest extends BaseTest {
  @Test
  public void addProductsToTheCart() {
    WildberriesStartPageModel wildberriesStartPageModel = new WildberriesStartPageModel(getDriver());
    wildberriesStartPageModel.productAddToCart(0);
    String price1 = wildberriesStartPageModel.getPrice(wildberriesStartPageModel.getId(0));
    System.out.println(price1);
    String brand1 = wildberriesStartPageModel.getBrand(wildberriesStartPageModel.getId(0));
    System.out.println(brand1);
    String productName1 = wildberriesStartPageModel.getProductName(wildberriesStartPageModel.getId(0)).replace("/ ","");
    System.out.println(productName1);
    wildberriesStartPageModel.clickOpenCartButton();

    SoftAssert softAssert = new SoftAssert();
  }
}
