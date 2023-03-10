package com.example.server.seat.dto;

import com.example.server.seat.entity.Seat;
import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class SeatDTO {

    private String SeatID;
    private String SeatNum;
    private String SeatState;
    private String ScreenID;

    public SeatDTO(Seat seat) {
        this.SeatID = seat.getSeatID();
        this.SeatNum = seat.getSeatNum();
        this.SeatState = seat.getSeatState();
        this.ScreenID = seat.getScreenID();
    }

}