package com.coupon.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name="Notification")
public class NotificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "noti_date")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date noti_date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "used_id", nullable = false)
    private IsUsedEntity isUsed;

    @Column(name="status", nullable = false)
    private Boolean status = true;

    @OneToOne
    @JoinColumn(name = "transfer_id", nullable = false)
    private TransferEntity transfer;

}