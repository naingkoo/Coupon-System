package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Business_Category")
public class BusinessCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private BusinessEntity business;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryEntity category;
}
