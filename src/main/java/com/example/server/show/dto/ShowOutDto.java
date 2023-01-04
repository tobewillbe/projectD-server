package com.example.server.show.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShowOutDto {
    private String showId;
    private String theaterName;
    private String MovieNm;
    private String ScreenNm;
    private Date ShowDate;
    private Time ShowTime;
}
