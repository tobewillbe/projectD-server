package com.example.server.reserve.entity;

import com.example.server.reserve.dto.ReserveInDto;
import lombok.*;

import java.util.UUID;

@Getter @Setter @ToString
@AllArgsConstructor
public class Reserve {
    private String reserveId;
    private String customerId;
    private String showId;

    public Reserve(){this.reserveId = UUID.randomUUID().toString();}
    public Reserve(ReserveInDto reserveIn){
        this.reserveId = reserveIn.getReserveId();
        this.customerId = reserveIn.getCustomerId();
        this.showId = reserveIn.getShowId();
    }
}
