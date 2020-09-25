package com.sedano.dynomarket.persistence.crud;

import com.sedano.dynomarket.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    //    @Query(value = "SELECT * FROM PRODUCTOS WHERE ID_CATEGORIA = ?", nativeQuery = true)
    List<Product> findByIdCategoryOrderNameAsc(int idCategory);

    Optional<List<Product>> findByIdStockLessThanAndState(int stock, boolean state);
}
