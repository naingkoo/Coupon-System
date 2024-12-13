package com.coupon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_photo")
public class UserPhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "photo_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserEntity user;
}