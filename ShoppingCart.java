
package com.mycompany.prblm_4;

// ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private String cartId;
    private User user;
    private List<CartItem> items;

    public ShoppingCart(String cartId, User user) {
        this.cartId = cartId;
        this.user = user;
        this.items = new ArrayList<>();
    }

    public String getCartId() {
        return cartId;
    }

    public User getUser() {
        return user;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getProductId().equals(product.getProductId())) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeItem(String productId) {
        items.removeIf(item -> item.getProduct().getProductId().equals(productId));
    }

    public double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }
}

