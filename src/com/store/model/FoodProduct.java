package com.store.model;

public class FoodProduct extends Product {

  private final String expirationDate;

  public FoodProduct(String code, String name, double price, String expirationDate) {
    super(code, name, price);
    this.expirationDate = expirationDate;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  @Override
  public String toString() {
    return super.toString()
        + " | Fecha de caducidad: " + expirationDate;
  }
}