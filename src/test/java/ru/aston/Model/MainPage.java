package ru.aston.Model;

import ru.aston.Base.BaseTest;

public class MainPage extends BasePage {
  private static final String digitsPref = "com.google.android.calculator:id/digit_";

  private static final String operationPref = "com.google.android.calculator:id/";

  public void digitClick(String digit) {
    System.out.println(String.format("%s%s", digitsPref, digit));
    driver.findElementById(String.format("%s%s", digitsPref, digit));
  }

  public void operationClick(String operation) {
    System.out.println("operation");
    switch (operation) {
      case "+":
        driver.findElementById(String.format("%s%s", operationPref, "op_add"));
        break;
      case "-":
        driver.findElementById(String.format("%s%s", operationPref, "op_sub"));
        break;
      case "*":
        driver.findElementById(String.format("%s%s", operationPref, "op_mul"));
        break;
      case "/":
        driver.findElementById(String.format("%s%s", operationPref, "op_div"));
        break;
      case "=":
        driver.findElementById(String.format("%s%s", operationPref, "eq"));
        break;
    }
  }

  public String getResult(){
      return driver.findElementById(String.format("%s%s", operationPref, "result_final")).getText();
  }
}
