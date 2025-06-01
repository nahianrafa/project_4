
package com.mycompany.prblm_4;

// OrderProcessor.java
import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    public Order createOrder(String orderId, User user, ShoppingCart cart) {
        List<OrderItem> orderItems = new ArrayList<>();
        for (CartItem cartItem : cart.getItems()) {
            Product product = cartItem.getProduct();
            int quantity = cartItem.getQuantity();
            if (product.isInStock(quantity)) {
                product.reduceStock(quantity);
                orderItems.add(new OrderItem(product, quantity));
            }
        }
        Order order = new Order(orderId, user, orderItems);
        cart.clearCart();
        return order;
    }

    public void processPayment(Order order, String paymentId, PaymentMethod method) {
        Payment payment = new Payment(paymentId, order, order.getTotalAmount(), method);
        order.setStatus(OrderStatus.CONFIRMED);
    }

    public void arrangeShipment(Order order, String shipmentId, String trackingNumber) {
        Shipment shipment = new Shipment(shipmentId, order, order.getUser().getAddress(), trackingNumber);
        order.setStatus(OrderStatus.SHIPPED);
    }
}
