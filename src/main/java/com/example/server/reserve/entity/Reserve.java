package com.example.server.reserve.entity;

import lombok.*;

import java.util.UUID;

@Getter @Setter @ToString
@AllArgsConstructor
public class Reserve {
    private String reserveId;
    private String customerId;
    private String showId;

    public Reserve(){this.reserveId = UUID.randomUUID().toString();}
}
