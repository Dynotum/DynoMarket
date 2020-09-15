package com.sedano.dynomarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    // TODO add name
    // Set my laptop
    // todo install java 11
    // test 2
}
