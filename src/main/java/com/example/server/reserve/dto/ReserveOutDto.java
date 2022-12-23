package com.example.server.reserve.dto;

import lombok.*;

import java.sql.Date;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReserveOutDto {
    private String reserveId;
    private String username;
    private String theaterNm;
    private String screenNm;
    private String movieNm;
    private Date showtime;
    private int totalTicket;
    private String SeatNM1;
    private String showSeatNm2;
    private String showSeatNm3;
    private String showSeatNm4;
    private String showSeatNm5;
    private String showSeatNm6;
    private String showSeatNm7;
    private String showSeatNm8;
}
