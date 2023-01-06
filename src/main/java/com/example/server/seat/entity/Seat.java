package com.example.server.seat.entity;

import com.example.server.seat.dto.SeatMassInputDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Setter @Getter @ToString
@AllArgsConstructor
public class Seat {

    private String SeatID; // 좌석 ID
    private String SeatNum; // 좌석번호
    private String SeatState; // 좌석상태(default- 0, 예약완료-1)
    private String ScreenID; //영화관 코드(fk)

    public Seat(SeatMassInputDTO dto, int row, int column){
        this.SeatID = UUID.randomUUID().toString();
        this.SeatNum = (char)(column + 65) +Integer.toString(row);
        this.SeatState = "0";
        this.ScreenID = dto.getScreenID();
    }

}