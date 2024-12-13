package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "business_photo")
public class BusinessPhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "photo_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "business_id",nullable = false)
    private BusinessEntity business;
}