package com.store.service;

import com.store.exception.ProductNotFoundException;
import com.store.model.Product;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

  private final Map<String, Product> products;

  public Inventory() {
    this.products = new HashMap<>();
  }

  public void addProduct(Product product) {
    products.put(product.getCode(), product);
  }

  public Product findProduct(String code) throws ProductNotFoundException {
    Product product = products.get(code);

    if (product == null) {
      throw new ProductNotFoundException(code);
    }

    return product;
  }

  public void displayInventory() {
    System.out.println("=== INVENTARIO DE PRODUCTOS ===");

    if (products.isEmpty()) {
      System.out.println("No hay productos registrados.");
      return;
    }

    for (Product product : products.values()) {
      System.out.println(product);
    }
  }
}