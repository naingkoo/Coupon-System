package com.coupon.model;

import lombok.Data;

@Data
public class CartPackageDTO {

    private Integer id;

    private Integer cart_id;

    private Integer package_id;

    private Integer unit_quantity;

    private Double unit_price;
}
