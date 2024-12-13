package com.coupon.model;

import lombok.Data;

import java.util.Date;

@Data
public class NotificationDTO {

    private Integer id;

    private Date noti_date;

    private Integer user_id;

    private Integer isUsed_id;

    private Boolean status;

    private Integer transfer_id;
}
