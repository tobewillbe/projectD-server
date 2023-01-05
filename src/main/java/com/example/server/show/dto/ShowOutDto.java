package com.example.server.show.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShowOutDto {
    private String showId;
    private String theaterNm;
    private String MovieNm;
    private String ScreenNm;
    private Date ShowDate;
    private Time ShowTime;
}
