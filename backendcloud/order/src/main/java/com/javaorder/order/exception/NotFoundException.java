package com.javaorder.order.exception;

public class NotFoundException extends RuntimeException {
    private final String orderId;

    public NotFoundException(String orderId) {
        super(String.format("order '%s' not found", orderId));
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}