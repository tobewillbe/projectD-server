package com.example.server.show.dto;

import lombok.*;

import java.sql.Date;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShowOutDto {
    private String theaterName;
    private String MovieNm;
    private String ScreenNm;
    private Date ShowTime;
}
