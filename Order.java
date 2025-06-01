
package com.mycompany.prblm_4;

// Order.java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private User user;
    private List<OrderItem> items;
    private Date orderDate;
    private double totalAmount;
    private OrderStatus status;
    private Payment payment;
    private Shipment shipment;

    public Order(String orderId, User user, List<OrderItem> items) {
        this.orderId = orderId;
        this.user = user;
        this.items = new ArrayList<>(items);
        this.orderDate = new Date();
        this.totalAmount = calculateTotal();
        this.status = OrderStatus.PENDING;
    }

    private double calculateTotal() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public String getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
