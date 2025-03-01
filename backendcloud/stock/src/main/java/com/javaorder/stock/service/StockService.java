package com.javaorder.stock.service;

import com.javaorder.common.openapi.model.Item;

import java.util.List;

public interface StockService {

    List<Item> getItems(List<String> ids);

}
