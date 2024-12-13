package com.coupon.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Coupon")
public class CouponEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="expired_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date expired_date;

    @Column(name="code")
    public  String code;

    @Column(name="used_status",nullable = false)
    private Boolean status = true;

    @Column(name="transfer_status",nullable = false)
    public  Boolean transfer_status = true;

    @ManyToOne
    @JoinColumn(name = "purchase_id",nullable = false)
    private PurchaseEntity purchase;

    @ManyToOne
    @JoinColumn(name = "package_id",nullable = false)
    private PackageEntity packageEntity;
}
