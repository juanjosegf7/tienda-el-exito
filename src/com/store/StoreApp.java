package com.store;

import com.store.model.ElectronicProduct;
import com.store.model.FoodProduct;
import com.store.model.Product;

public class StoreApp {

  public static void main(String[] args) {

    Product milk = new FoodProduct(
        "A001",
        "Leche entera",
        4500.0,
        "2026-12-15");

    Product rice = new FoodProduct(
        "A002",
        "Arroz blanco",
        3200.0,
        "2027-06-20");

    Product television = new ElectronicProduct(
        "E001",
        "Televisor LED",
        1250000.0,
        110);

    System.out.println("=== TIENDA EL ÉXITO ===");
    System.out.println("Productos registrados para la prueba:");
    System.out.println();

    System.out.println(milk);
    System.out.println(rice);
    System.out.println(television);
  }
}