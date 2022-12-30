package com.example.server.reserve.service;

import com.example.server.reserve.dto.ReserveInDto;
import com.example.server.reserve.dto.ReserveOutDto;
import com.example.server.reserve.entity.Reserve;
import com.example.server.reserve.entity.ShowSeat;
import com.example.server.reserve.repository.ReserveRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ReserveService {

    private final ReserveRepository repository;

    public boolean createServ(final ReserveInDto reserveDTO){
        if(reserveDTO == null){
            log.warn("new show cannot be null!");
        }

        Reserve reserve = new Reserve(reserveDTO);

        boolean flag = repository.create(reserve);
        if(flag) log.info("새로운 reserve id:{} 이 저장되었습니다.", reserve);
        for(String showSeat : reserveDTO.getSeatlist()){
            ShowSeat seat = new ShowSeat(reserveDTO, showSeat, "reserved");
            boolean test =repository.createSeat(seat);
        }
        return flag;
    }

    public List<Reserve> listAllServ(){
        return new ArrayList<>(repository.listAll());
    }

    public List<ReserveOutDto> listDtoServ() {return new ArrayList<>(repository.listDTO());}
}
