package com.coupon.model;
import lombok.Data;

import java.util.Date;

@Data
public class PackageDTO {

    private Integer id;

    private String name;

    private Double unit_price;

    private Integer quantity;

    private Date package_date;

    private Integer business_id;
}
