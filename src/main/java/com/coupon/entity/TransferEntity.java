package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Transfer")
public class TransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="transfer_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date transfer_date;

    @Column(name="status", nullable = false)
    private Boolean status = true;

    @ManyToOne
    @JoinColumn(name = "receiver_id",nullable = false)
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "coupon_id",nullable = false)
    private CouponEntity coupon;


}
