package com.example.server.reserve.entity;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reserve {
    private String reserveId;
    private String customerId;
    private String showId;
    private int totalTicket;
    private String seatNum1;
    private String showSeatId2;
    private String showSeatId3;
    private String showSeatId4;
    private String showSeatId5;
    private String showSeatId6;
    private String showSeatId7;
    private String showSeatId8;
}
