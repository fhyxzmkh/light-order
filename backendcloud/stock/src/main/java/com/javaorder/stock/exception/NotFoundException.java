package com.javaorder.stock.exception;

import java.util.List;

public class NotFoundException extends RuntimeException {
    private final List<String> missingIds;

    public NotFoundException(List<String> missingIds) {
        super("These items not found in stock: " + String.join(", ", missingIds));
        this.missingIds = missingIds;
    }

    public List<String> getMissingIds() {
        return missingIds;
    }
}