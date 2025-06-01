
package com.mycompany.prblm_4;

// Shipment.java
import java.util.Date;

public class Shipment {
    private String shipmentId;
    private Order order;
    private Address shippingAddress;
    private String trackingNumber;
    private ShipmentStatus status;
    private Date shipmentDate;

    public Shipment(String shipmentId, Order order, Address shippingAddress, String trackingNumber) {
        this.shipmentId = shipmentId;
        this.order = order;
        this.shippingAddress = shippingAddress;
        this.trackingNumber = trackingNumber;
        this.status = ShipmentStatus.PENDING;
        this.shipmentDate = new Date();
        this.order.setShipment(this);
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public Order getOrder() {
        return order;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }
}
