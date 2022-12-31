package com.example.server.show.repository;

import com.example.server.show.dto.ShowOutDto;
import com.example.server.show.entity.Show;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface ShowRepository {

    // 상영목록생성
    /*
     * @param show - 상영데이터의 집합
     * @return - 저장성공시 true, 실패시 false 반환
     */
    boolean create(Show show);

    List<Show> showList(Timestamp start, Timestamp end);

    List<ShowOutDto> showOutDtoList(Timestamp start, Timestamp end);

    boolean update(Show show);
}
