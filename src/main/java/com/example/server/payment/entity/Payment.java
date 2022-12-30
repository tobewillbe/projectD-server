package com.example.server.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter @Setter @ToString
@AllArgsConstructor
public class Payment {
    private String paymentId;
    private String reserveId;
    private String payMethod;
    private String CurrentStatus;
    private String payTime;

    public Payment(){this.paymentId = UUID.randomUUID().toString();}
}
