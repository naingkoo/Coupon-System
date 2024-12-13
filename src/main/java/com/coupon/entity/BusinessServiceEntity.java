package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Business_Service")
public class BusinessServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    private BusinessEntity business;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private ServiceEntity service;
}
