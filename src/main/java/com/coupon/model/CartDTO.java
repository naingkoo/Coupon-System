package com.coupon.model;

import lombok.Data;

@Data
public class CartDTO {

    private Integer id;

    private Integer user_id;

    private Integer totalItems;

    private Double totalPrice;
}
