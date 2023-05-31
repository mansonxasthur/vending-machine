package com.flapkap.manson.vendingmachine.modules.product.http.controllers;

import com.flapkap.manson.vendingmachine.modules.product.core.services.CreateProductService;
import com.flapkap.manson.vendingmachine.modules.product.entities.models.Product;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateProductController {
    @Autowired
    private CreateProductService service;

    @PostMapping("/products")
    public Product store(@RequestBody @Valid Product product) {
        return service.create(product);
    }
}
