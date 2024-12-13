package com.coupon.model;

import lombok.Data;

import java.util.Date;

@Data
public class IsUsedDTO {

    private Integer id;

    private Date used_date;

    private Integer coupon_id;
}
