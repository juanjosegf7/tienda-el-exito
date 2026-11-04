package com.store;

import com.store.exception.ProductNotFoundException;
import com.store.model.ElectronicProduct;
import com.store.model.FoodProduct;
import com.store.model.Product;
import com.store.service.Inventory;

public class StoreApp {

  public static void main(String[] args) {

    System.out.println("=== SISTEMA DE INVENTARIO - TIENDA EL ÉXITO ===");
    System.out.println();

    Inventory inventory = new Inventory();

    System.out.println("=== PRUEBA 1: INVENTARIO VACÍO ===");
    inventory.displayInventory();
    System.out.println();

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

    System.out.println("=== PRUEBA 2: REGISTRO DE PRODUCTOS ===");

    inventory.addProduct(milk);
    inventory.addProduct(rice);
    inventory.addProduct(television);

    System.out.println("Se registraron tres productos correctamente.");
    System.out.println();

    System.out.println("=== PRUEBA 3: BÚSQUEDA EXITOSA ===");

    try {
      Product foundProduct = inventory.findProduct("A001");
      System.out.println("Producto encontrado:");
      System.out.println(foundProduct);
    } catch (ProductNotFoundException exception) {
      System.out.println(exception.getMessage());
    }

    System.out.println();

    System.out.println("=== PRUEBA 4: BÚSQUEDA FALLIDA ===");

    try {
      Product foundProduct = inventory.findProduct("A999");
      System.out.println("Producto encontrado:");
      System.out.println(foundProduct);
    } catch (ProductNotFoundException exception) {
      System.out.println(exception.getMessage());
    }

    System.out.println();

    System.out.println("=== PRUEBA 5: INVENTARIO COMPLETO ===");
    inventory.displayInventory();
    System.out.println();

    System.out.println("=== FIN DE LAS PRUEBAS ===");
  }
}