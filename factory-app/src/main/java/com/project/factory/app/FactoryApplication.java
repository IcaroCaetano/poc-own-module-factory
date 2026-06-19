package com.project.factory.app;

import module factory.service;

public class FactoryApplication {

    public static void main(String[] args) {

        var productionService = new ProductionService();

        productionService.processOrder();
    }
}