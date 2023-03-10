package com.example.server.screen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor
public class Screen {

    private String ScreenID; // 영화관 ID
    private String ScreenCD; // 영화관 코드
    private String ScreenNm; // 영화관 이름
    private int ScreenSeat; // 영화관 좌석수
    private String TheaterID; //지점 ID(fk)

}