
package com.mycompany.prblm_4;

// Payment.java
import java.util.Date;

public class Payment {
    private String paymentId;
    private Order order;
    private double amount;
    private PaymentMethod method;
    private Date paymentDate;

    public Payment(String paymentId, Order order, double amount, PaymentMethod method) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
        this.method = method;
        this.paymentDate = new Date();
        this.order.setPayment(this);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public Order getOrder() {
        return order;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}

