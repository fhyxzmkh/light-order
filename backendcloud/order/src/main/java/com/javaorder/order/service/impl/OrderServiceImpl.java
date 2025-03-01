package com.javaorder.order.service.impl;


import com.javaorder.order.entity.pojo.Order;
import com.javaorder.order.exception.NotFoundException;
import com.javaorder.order.service.OrderService;
import org.slf4j.Logger;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

public class OrderServiceImpl implements OrderService {

    private final Logger logger = org.slf4j.LoggerFactory.getLogger(OrderServiceImpl.class);

    private final static Map<String, Order> store = new ConcurrentHashMap<>();
    private final static ReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public Order create(Order order) {
        lock.writeLock().lock();

        try {
            String orderId = String.valueOf(System.currentTimeMillis());

            Order newOrder = new Order(
                    orderId,
                    order.getCustomerID(),
                    order.getStatus(),
                    order.getItems(),
                    order.getPaymentLink()
            );

            store.put(orderId, newOrder);

            logger.atDebug().log("input_order: {}\nstore_after_create {}\n", newOrder, store);

            return newOrder;
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    public Order get(String orderId, String customerID) {
        lock.readLock().lock();

        try {
            for (Order order : store.values()) {
                if (order.getId().equals(orderId) && order.getCustomerID().equals(customerID)) {
                    logger.atDebug().log("get_order: {}\n", order);
                    return order;
                }
            }
            throw new NotFoundException("OrderID: " + orderId);
        } finally {
            lock.readLock().unlock();
        }
    }

    @Override
    public void update(Order order, Function<Order, Order> updateFn) {
        lock.writeLock().lock();

        try {
            boolean isFound = false;

            for (Order o : store.values()) {
                if (Objects.equals(o.getId(), order.getId()) && Objects.equals(o.getCustomerID(), order.getCustomerID())) {
                    isFound = true;

                    Order updateOrder = updateFn.apply(o);

                    store.put(updateOrder.getId(), updateOrder);

                    break;
                }
            }

            if (!isFound) {
                throw new NotFoundException("OrderID: " + order.getId());
            }
        } finally {
            lock.writeLock().unlock();
        }
    }
}
