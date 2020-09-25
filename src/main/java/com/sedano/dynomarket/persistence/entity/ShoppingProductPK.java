package com.sedano.dynomarket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ShoppingProductPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idShopping;

    @Column(name = "id_producto")
    private Integer idProduct;


}
