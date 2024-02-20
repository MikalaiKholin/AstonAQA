package ru.aston;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.aston.Base.BaseTest;
import ru.aston.Model.*;

import java.util.*;

public class AppTest extends BaseTest {
  private List<Product> productsOnStartPage = new ArrayList<>();
  private List<Product> productsInCart = new ArrayList<>();

  public void addProductsToTheCart() {
    WildberriesStartPageModel wildberriesStartPageModel =
        new WildberriesStartPageModel(getDriver());
    for (int i = 1; i <= 3; i++) {
      wildberriesStartPageModel.productAddToCart(i * 2);
      try {
        wildberriesStartPageModel.clickSizesButton();
      } catch (Exception ignored) {
      }
      String priceWB =
          wildberriesStartPageModel
              .getPrice(wildberriesStartPageModel.getId(i * 2))
              .replace(" ₽", "")
              .replace(" ", "");
      String brand = wildberriesStartPageModel.getBrand(wildberriesStartPageModel.getId(i * 2));
      String productName =
          wildberriesStartPageModel
              .getProductName(wildberriesStartPageModel.getId(i * 2))
              .replace("/ ", "");
      productsOnStartPage.add(
          new Product(0, (int) (Integer.parseInt(priceWB)), brand, productName));
    }
  }

  public void readProductsFromTheCart() throws InterruptedException {
    WildberriesCartPageModel wildberriesCartPageModel = new WildberriesCartPageModel(getDriver());
    Thread.sleep(2000);
    for (int i = 1; i <= 3; i++) {
      String priceWB =
          wildberriesCartPageModel
              .getProductsInCartPricesWB()
              .get(i - 1)
              .getText()
              .replace(" ₽", "")
              .replace(" ", "");
      String price =
          wildberriesCartPageModel
              .getProductsInCartPrices()
              .get(i - 1)
              .getText()
              .replace(" ₽", "")
              .replace(" ", "");
      String brand =
          wildberriesCartPageModel.getProductsInCartBrands().get(i - 1).getText().replace(", ", "");
      String productName = wildberriesCartPageModel.getProductsInCartNames().get(i - 1).getText();
      productsInCart.add(
          new Product(Integer.parseInt(price), Integer.parseInt(priceWB), brand, productName));
    }
  }

  @Test
  public void comparisonOfProductsTest() throws InterruptedException {
    addProductsToTheCart();
    new WildberriesStartPageModel(getDriver()).clickOpenCartButton();
    readProductsFromTheCart();
    Collections.sort(productsOnStartPage);
    Collections.sort(productsInCart);
    System.out.println(Arrays.toString(productsOnStartPage.toArray()));
    System.out.println(Arrays.toString(productsInCart.toArray()));
    Assert.assertEquals(productsOnStartPage, productsInCart);
  }

  @Test(dependsOnMethods = "comparisonOfProductsTest")
  public void priceSummTest() {
    Assert.assertTrue(
        Integer.parseInt(
                new WildberriesCartPageModel(getDriver())
                    .getPriceSumm()
                    .replace(" ₽", "")
                    .replace(" ", ""))
            == productsInCart.stream().mapToInt(Product::getPrice).sum());
  }
}
