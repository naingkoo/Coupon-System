package com.coupon.model;

import lombok.Data;

import java.util.Date;

@Data
public class CouponDTO {

    private Integer id;

    private Date expired_date;

    public  String code;

    private Boolean status;

    public  Boolean transfer_status;

    private Integer purchase_id;

    private Integer package_id;
}
