package com.JavaLesson.shoppingCart.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super (message);
    }
}
