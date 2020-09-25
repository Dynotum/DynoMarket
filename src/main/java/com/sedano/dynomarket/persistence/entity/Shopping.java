package com.sedano.dynomarket.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Shopping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idShopping;

    @Column(name = "id_cliente")
    private String idClient;

    @Column(name = "fecha")
    private LocalDateTime dateTime;

    @Column(name = "medio_pago")
    private String paymentMethod;

    @Column(name = "comentario")
    private String comment;

    @Column(name = "estado")
    private String state;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = true)
    private Client client;

    @OneToMany(mappedBy = "product")
    private List<ShoppingProduct> products;

    public Integer getIdShopping() {
        return idShopping;
    }

    public void setIdShopping(Integer idShopping) {
        this.idShopping = idShopping;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
