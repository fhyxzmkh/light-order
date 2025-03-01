package com.javaorder.order.service;


import com.javaorder.order.entity.pojo.Order;
import java.util.function.Function;

public interface OrderService {

    Order create(Order order);

    Order get(String orderId, String customerID);

    void update(Order order, Function<Order, Order> updateFn);

}
