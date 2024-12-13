package com.coupon.model;
import lombok.Data;
import java.util.Date;

@Data
public class PurchaseDTO {

    private Integer id;

    private Double total_amount;

    private Integer total_quantity;

    private Date purchase_date;

    private Integer user_id;
}
