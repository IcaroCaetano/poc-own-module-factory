package com.project.factory.domain;

public record ProductionOrder(
        Product product,
        int quantity
) {
}