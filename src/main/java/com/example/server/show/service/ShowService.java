package com.example.server.show.service;

import com.example.server.reserve.entity.ShowSeat;
import com.example.server.seat.entity.Seat;
import com.example.server.show.dto.ShowOutDto;
import com.example.server.show.entity.Show;
import com.example.server.show.repository.ShowRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ShowService {

    private final ShowRepository repository;

    public boolean createServ(final Show show){
        if(show == null){
            log.warn("new show cannot be null!");
        }
        boolean flag = repository.create(show);
        if(flag) log.info("새로운 show id:{} 이 저장되었습니다.", show);
        List<Seat> seats = repository.showSeatList(show.getScreenId());
        for (Seat seat : seats) {
            boolean newflag = repository.createSeats(new ShowSeat(seat, show));
        }
        return flag;
    }

    public List<Show> showListServ(String date) {
        String startStr = date+" 00:00:00";
        String endStr = date+" 23:59:59";
        log.info("{},{}",startStr,endStr);
        Timestamp start = Timestamp.valueOf(startStr);
        Timestamp end = Timestamp.valueOf(endStr);

        return new ArrayList<>(repository.showList(start, end));}

    public List<ShowOutDto> showOutDtoListServ(String date,String movie, String theater) {
        String startStr = date+" 00:00:00";
        String endStr = date+" 23:59:59";
        log.info("{},{}",startStr,endStr);
        Timestamp start = Timestamp.valueOf(startStr);
        Timestamp end = Timestamp.valueOf(endStr);

        return new ArrayList<>(repository.showOutDtoList(start, end, movie, theater));}
}
