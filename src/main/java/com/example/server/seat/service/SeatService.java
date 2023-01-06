package com.example.server.seat.service;

import com.example.server.seat.dto.FindAllDTO;
import com.example.server.seat.dto.SeatDTO;
import com.example.server.seat.dto.SeatMassInputDTO;
import com.example.server.seat.entity.Seat;
import com.example.server.seat.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository repository;

    public FindAllDTO findAllServ(String ScreenID) {
        return new FindAllDTO(repository.findAll(ScreenID));
    }

    public SeatDTO findOneServ(String id) {
        Seat seat = repository.findOne(id);
        log.info("findOneServ return data - {}", seat);
        return seat != null ? new SeatDTO(seat) : null;
    }

    public FindAllDTO createServ(final Seat newSeat) {
        if (newSeat == null) {
            log.warn("newSeat cannot be null!");
            throw  new RuntimeException("newSeat cannot be null!");
        }

        boolean flag = repository.save(newSeat);
        if (flag) log.info("새로운 좌석 [Id: {}]이 저장되었습니다.", newSeat.getSeatID());
        return flag ? findAllServ(newSeat.getScreenID()) : null;
    }

    public FindAllDTO update(Seat seat) {
        boolean flag = repository.modify(seat);
        return flag ? findAllServ(seat.getScreenID()) : new FindAllDTO();
    }

    public FindAllDTO deleteServ(String id, String ScreenID) {
        boolean flag = repository.remove(id);

        if (!flag) {
            log.warn("delete fail!! not found id [{}]", id);
            throw new RuntimeException("delete fail!");
        }
        return findAllServ(ScreenID);
    }

    public FindAllDTO massCreateServ(SeatMassInputDTO newSeats) {
        if (newSeats == null) {
            log.warn("newSeat cannot be null!");
            throw  new RuntimeException("newSeat cannot be null!");
        }

        boolean flag = false;
        for (int i=1 ; i <= Integer.parseInt(newSeats.getRow()) ; i++ ){
            for (int j=0; j < Integer.parseInt(newSeats.getColumn()); j++){
                Seat seat = new Seat(newSeats, i, j);
                flag = repository.save(seat);
                if (flag) log.info("새로운 좌석 [Id: {}]이 저장되었습니다.", seat.getSeatID());
            }
        }
        return flag ? findAllServ(newSeats.getScreenID()) : null;
    }
}