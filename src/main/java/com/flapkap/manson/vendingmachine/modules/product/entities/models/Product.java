package com.flapkap.manson.vendingmachine.modules.product.entities.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.NumberFormat;

@Table("PRODUCTS")
public class Product {

    @Id
    private Integer id;

    @NotEmpty
    private String sellerId;
    @NotEmpty
    private String productName;
    @NumberFormat
    @Min(0)
    @Max(10)
    private Integer amountAvailable;
    @NotEmpty
    private String cost;

    public Integer getId() {
        return id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getAmountAvailable() {
        return amountAvailable;
    }

    public Float getCost() {
        return Float.valueOf(cost);
    }
}
