package com.javaorder.order;

import com.javaorder.order.entity.pojo.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);

        Order order = new Order();
        System.out.println(order + "test");
    }
}
