package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Business")
public class BusinessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private  String  type;

    @Column(name="created_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date business_date;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "address")
    private String address;

    @Column(name="status", nullable = false)
    private Boolean status = true;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserEntity user;


}
