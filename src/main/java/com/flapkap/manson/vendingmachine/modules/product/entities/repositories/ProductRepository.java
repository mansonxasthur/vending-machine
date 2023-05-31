package com.flapkap.manson.vendingmachine.modules.product.entities.repositories;

import com.flapkap.manson.vendingmachine.modules.product.entities.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
