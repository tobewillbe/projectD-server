package com.example.server.reserve.dto;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter @Setter @ToString
@AllArgsConstructor
public class ReserveInDto {
    private String reserveId;
    private String customerId;
    private String showId;
    private List<String> seatlist;

    public ReserveInDto(){this.reserveId = UUID.randomUUID().toString();}
}
