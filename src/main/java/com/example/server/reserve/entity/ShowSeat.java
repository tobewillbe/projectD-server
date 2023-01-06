package com.example.server.reserve.entity;

import com.example.server.reserve.dto.ReserveInDto;
import com.example.server.seat.entity.Seat;
import com.example.server.show.entity.Show;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter @Setter @ToString
@AllArgsConstructor
public class ShowSeat {
    private String showSeatId;
    private String showId;
    private String seatId;
    private String reserveId;
    private String setState;

    public ShowSeat() {this.showSeatId = UUID.randomUUID().toString();}
    public ShowSeat(ReserveInDto reserveDTO, String seatId, String setState){
        this();
        this.showId = reserveDTO.getShowId();
        this.reserveId = reserveDTO.getReserveId();
        this.seatId = seatId;
        this.setState = setState;
    }
    public ShowSeat(Seat seat, Show show){
        this();
        this.showId = show.getShowId();
        this.seatId = seat.getSeatID();
        this.reserveId = null;
        this.setState = seat.getSeatState();
    }
}
