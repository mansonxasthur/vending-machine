package com.flapkap.manson.vendingmachine.modules.product.http.controllers;

import com.flapkap.manson.vendingmachine.modules.product.core.services.ListProductsService;
import com.flapkap.manson.vendingmachine.modules.product.entities.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListProductsController {
    @Autowired
    private ListProductsService service;

    @GetMapping("/products")
    public Iterable<Product> index() {
        return service.list();
    }
}
