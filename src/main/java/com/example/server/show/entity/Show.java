package com.example.server.show.entity;

import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Getter @Setter @ToString
@AllArgsConstructor
public class Show {
    private String showId; // 상영정보를 식별하는 번호
    private String movieCd; // 영화정보를 불러오는 ID
    private String screenId; // 상영관 정보를 불러오는 ID
    private Timestamp showTime; // 상영시간을 저장하는 값

    public Show(){this.showId = UUID.randomUUID().toString();}


}
