package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Purchase")
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="total_amount")
    private Double total_amount;

    @Column(name="total_quantity")
    private Integer total_quantity;

    @Column(name="purchase_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date purchase_date;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserEntity user;
}
