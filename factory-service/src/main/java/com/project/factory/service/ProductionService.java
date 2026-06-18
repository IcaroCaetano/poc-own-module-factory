package com.project.factory.service;

public class ProductionService {

    public void execute() {

        var product =
                new Product(
                        "001",
                        "Notebook"
                );

        System.out.println(product);
    }
}