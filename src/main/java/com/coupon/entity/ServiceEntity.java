package com.coupon.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Service")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Service")
    private String name;
}
