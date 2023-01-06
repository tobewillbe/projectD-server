package com.example.server.seat.dto;

import lombok.*;
@Setter @Getter @ToString @NoArgsConstructor
@AllArgsConstructor
public class SeatMassInputDTO { //wbtb

    private String screenID; // 영화관 ID
    private String row;//가로
    private String column; //세로
}
