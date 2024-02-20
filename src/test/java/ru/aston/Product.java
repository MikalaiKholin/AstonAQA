package ru.aston;

import java.util.Objects;

public class Product implements Comparable<Product> {
  private final int price;
  private final int priceWB;
  private final String brand;
  private final String name;

  public Product(int price, int priceWB, String brand, String name) {
    this.price = price;
    this.priceWB = priceWB;
    this.brand = brand;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Product{" +
            "price=" + price +
            ", priceWB=" + priceWB +
            ", brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

  public int getPrice() {
    return price;
  }

  public int getPriceWB() {
    return priceWB;
  }

  public String getBrand() {
    return brand;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return priceWB == product.getPriceWB()
        && brand.equals(product.getBrand())
        && name.equals(product.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceWB, brand, name);
  }

  @Override
  public int compareTo(Product o) {
    return this.getBrand().compareTo(o.getBrand());
  }
}
