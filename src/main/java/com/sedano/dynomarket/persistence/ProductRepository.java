package com.sedano.dynomarket.persistence;

import com.sedano.dynomarket.persistence.crud.ProductCrudRepository;
import com.sedano.dynomarket.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory) {
        return productCrudRepository.findByIdCategoryOrderNameAsc(idCategory);
    }

    public Optional<List<Product>> getScarceProducts(int stock) {
        return productCrudRepository.findByIdStockLessThanAndState(stock, true);
    }
}
