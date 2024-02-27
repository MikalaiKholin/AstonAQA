package ru.aston.Model;

public class MainPage extends BasePage {
  private static final String digitsPref = "com.google.android.calculator:id/digit_";

  private static final String operationPref = "com.google.android.calculator:id/";

  public void digitClick(String digit) {
    driver.findElementById(String.format("%s%s", digitsPref, digit)).click();
  }

  public void operationClick(String operation) {
    switch (operation) {
      case "+":
        driver.findElementById(String.format("%s%s", operationPref, "op_add")).click();
        break;
      case "-":
        driver.findElementById(String.format("%s%s", operationPref, "op_sub")).click();
        break;
      case "*":
        driver.findElementById(String.format("%s%s", operationPref, "op_mul")).click();
        break;
      case "/":
        driver.findElementById(String.format("%s%s", operationPref, "op_div")).click();
        break;
      case "=":
        driver.findElementById(String.format("%s%s", operationPref, "eq")).click();
        break;
    }
  }

  public String getResult() {
    return driver.findElementById(String.format("%s%s", operationPref, "result_final")).getText();
  }
}
