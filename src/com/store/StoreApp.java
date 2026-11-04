package com.store;

import com.store.model.ElectronicProduct;
import com.store.model.FoodProduct;
import com.store.model.Product;
import com.store.service.Inventory;

public class StoreApp {

  public static void main(String[] args) {

    Inventory inventory = new Inventory();

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

    inventory.addProduct(milk);
    inventory.addProduct(rice);
    inventory.addProduct(television);

    System.out.println("=== TIENDA EL ÉXITO ===");
    System.out.println();

    Product foundProduct = inventory.findProduct("A001");

    if (foundProduct != null) {
      System.out.println("Producto encontrado:");
      System.out.println(foundProduct);
    } else {
      System.out.println("El producto no fue encontrado.");
    }

    System.out.println();

    inventory.displayInventory();
  }
}