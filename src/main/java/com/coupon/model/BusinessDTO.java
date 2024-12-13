package com.coupon.model;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessDTO {

    private Integer id;

    private  String  type;

    private Date business_date;

    private String country;

    private String city;

    private String street;

    private String address;

    private Boolean status;

    private Integer user_id;
}
