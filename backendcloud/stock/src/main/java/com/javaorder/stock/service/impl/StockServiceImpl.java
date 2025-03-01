package com.javaorder.stock.service.impl;

import com.javaorder.common.openapi.model.Item;
import com.javaorder.stock.exception.NotFoundException;
import com.javaorder.stock.service.StockService;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class StockServiceImpl implements StockService {

    private final Logger logger = org.slf4j.LoggerFactory.getLogger(StockServiceImpl.class);

    private final static Map<String, Item> store = new ConcurrentHashMap<>();
    private final static ReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public List<Item> getItems(List<String> ids) {
        lock.readLock().lock();
        try {
            List<Item> result = new ArrayList<>();
            List<String> missingIds = new ArrayList<>();

            for (String id : ids) {
                Item item = store.get(id);
                if (item != null) {
                    result.add(item);
                } else {
                    missingIds.add(id);
                }
            }

            if (!missingIds.isEmpty()) {
                throw new NotFoundException(missingIds);
            }

            return result;
        } finally {
            lock.readLock().unlock();
        }
    }

}
