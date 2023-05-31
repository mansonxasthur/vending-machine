package com.flapkap.manson.vendingmachine.modules.product.core.services;

import com.flapkap.manson.vendingmachine.modules.product.entities.models.Product;
import com.flapkap.manson.vendingmachine.modules.product.entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService {
    @Autowired
    private ProductRepository repository;

    public Product create(Product product) {
        return repository.save(product);
    }
}
