package org.clarke.sweetshop.cart.entity;

import jakarta.persistence.*;

@Entity(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;
}
