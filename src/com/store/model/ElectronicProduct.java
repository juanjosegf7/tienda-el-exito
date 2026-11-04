package com.store.model;

public class ElectronicProduct extends Product {

  private final int voltage;

  public ElectronicProduct(String code, String name, double price, int voltage) {
    super(code, name, price);
    this.voltage = voltage;
  }

  public int getVoltage() {
    return voltage;
  }

  @Override
  public String toString() {
    return super.toString()
        + " | Voltaje: " + voltage + " V";
  }
}