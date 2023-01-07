package com.example.server.reserve.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeatDto {
    private String showSeatId;
    private String showId;
    private String seatId;
    private String seatNum;
    private String seatState;
}
