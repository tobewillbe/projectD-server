package com.example.server.reserve.dto;

import lombok.*;

import java.sql.Date;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReserveOutDto {
    private String reserveId;
    private String username;
    private String theaterName;
    private String screenNm;
    private String movieNm;
    private Date showtime;
    private int count;
    private String SeatNum;

}
