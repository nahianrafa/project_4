
package com.mycompany.prblm_4;

// CartItem.java
public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
        }
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
}

