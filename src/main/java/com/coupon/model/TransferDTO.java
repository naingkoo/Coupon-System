package com.coupon.model;

import lombok.Data;

import java.util.Date;


@Data
public class TransferDTO {

    private Integer id;

    private Date transfer_date;

    private Boolean status;

    private Integer user_id;

    private Integer coupon_id;
}
