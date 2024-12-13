package com.coupon.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true, nullable = false)
    private UserEntity user;

    @Column(name = "total_items")
    private Integer totalItems;

    @Column(name = "total_price")
    private Double totalPrice;

}
