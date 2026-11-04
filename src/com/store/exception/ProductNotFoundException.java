package com.store.exception;

public class ProductNotFoundException extends Exception {

  public ProductNotFoundException(String code) {
    super("El producto con código " + code + " no fue encontrado.");
  }
}