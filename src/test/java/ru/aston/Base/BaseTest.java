package ru.aston.Base;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseTest {

  public static final int SUCCESS = 200;
  private final RequestSpecification pageLink = given().log().body().baseUri("https://postman-echo.com");

  public RequestSpecification getPageLink() {
    return pageLink;
  }
}
