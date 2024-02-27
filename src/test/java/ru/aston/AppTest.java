package ru.aston;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.aston.Base.BaseTest;
import ru.aston.Model.*;

import java.util.*;

public class AppTest extends BaseTest {
  MainPage mainPage = new MainPage();
  private void enterExpression(String expression) {
    String[] ex = expression.split(" ");
    for (int i = 0; i < ex.length; i++) {
      System.out.println(ex[i]);
      if (i % 2 == 0) mainPage.digitClick(ex[i]);
      else mainPage.operationClick(ex[i]);
    }
  }

  @DataProvider
  public String[][] Expressions() {
    return new String[][] {
            {"1 + 1", "2"},
            {"5 / 5 + 6", "7"},
            {"2 * 3", "6"},
            {"9 / 3", "3"},
    };
  }

  @Test(dataProvider = "Expressions")
  public void checkBaseOperations(String expression, String expectedResult) {
    enterExpression(expression);
    Assert.assertEquals(expectedResult, mainPage.getResult());
  }
}
