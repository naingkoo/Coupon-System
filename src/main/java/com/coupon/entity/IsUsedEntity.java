package com.coupon.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Is_Used")
public class IsUsedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="used_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date used_date;

    @OneToOne
    @JoinColumn(name = "coupon_id",nullable = false)
    private CouponEntity coupon;
}
