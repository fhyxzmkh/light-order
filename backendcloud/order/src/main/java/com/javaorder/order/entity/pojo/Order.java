package com.javaorder.order.entity.pojo;

import com.javaorder.common.openapi.model.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    String id;

    String customerID;

    String status;

    List<Item> Items;

    String paymentLink;
}
