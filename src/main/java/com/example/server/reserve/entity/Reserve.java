package com.example.server.reserve.entity;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reserve {
    private String reserveId;
    private String customerId;
    private String showId;
}
