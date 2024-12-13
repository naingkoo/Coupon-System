package com.coupon.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Category")
    private String name;
}
