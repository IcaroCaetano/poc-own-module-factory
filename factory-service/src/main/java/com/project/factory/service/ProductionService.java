package com.project.factory.service;

import module factory.domain;

public class ProductionService {

    public void processOrder() {

        var product = new Product(
                "PRD-001",
                "Notebook"
        );

        var order = new ProductionOrder(
                product,
                50
        );

        System.out.printf("Produzindo %d unidades de %s%n",
                order.quantity(), order.product().name()
        );
    }
}