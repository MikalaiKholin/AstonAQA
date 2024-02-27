package ru.aston;

import org.testng.annotations.Test;
import ru.aston.Base.BaseTest;

import static org.hamcrest.Matchers.equalTo;

public class AppTest extends BaseTest {
  private final Fruit apple = new Fruit("Apple", 1);

  @Test
  public void getMethodTest() {
    getPageLink()
        .when()
        .get(String.format("get?%s=%d", apple.getName(), apple.getWeight()))
        .then()
        .body(
            "url",
            equalTo(
                String.format(
                    "https://postman-echo.com/get?%s=%d", apple.getName(), apple.getWeight())))
        .statusCode(SUCCESS);
  }

  @Test
  public void postMethodTest() {
    getPageLink()
        .contentType("application/json")
        .body(apple)
        .when()
        .post("/post")
        .then()
        .body("json.name", equalTo(apple.getName()))
        .and()
        .body("json.weight", equalTo(apple.getWeight()))
        .statusCode(SUCCESS);
  }

  @Test
  public void putMethodTest() {
    getPageLink()
        .contentType("application/json")
        .body(apple.toJson())
        .when()
        .put("/put")
        .then()
        .body("json.name", equalTo(apple.getName()))
        .and()
        .body("json.weight", equalTo(apple.getWeight()))
        .statusCode(SUCCESS);
  }

  @Test
  public void patchMethodTest() {
    getPageLink()
        .contentType("application/json")
        .body(apple.toJson())
        .when()
        .patch("/patch")
        .then()
        .body("json.name", equalTo(apple.getName()))
        .and()
        .body("json.weight", equalTo(apple.getWeight()))
        .statusCode(SUCCESS);
  }

  @Test
  public void deleteMethodTest() {
    getPageLink()
        .contentType("application/json")
        .body(apple.toJson())
        .when()
        .delete("/delete")
        .then()
        .body("json.name", equalTo(apple.getName()))
        .and()
        .body("json.weight", equalTo(apple.getWeight()))
        .statusCode(SUCCESS);
  }
}
