package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Package")
public class PackageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="unit_price")
    private Double unit_price;

    @Column(name="unit_quantity")
    private Integer quantity;

    @Column(name="created_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date created_date;

    @Column(name = "package_photo")
    private String package_photo;

    @ManyToOne
    @JoinColumn(name = "business_id",nullable = false)
    private BusinessEntity business;
}
