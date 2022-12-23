package com.example.server.reserve.service;

import com.example.server.reserve.dto.ReserveOutDto;
import com.example.server.reserve.entity.Reserve;
import com.example.server.reserve.repository.ReserveRepository;
import com.example.server.show.dto.ShowOutDto;
import com.example.server.show.entity.Show;
import com.example.server.show.repository.ShowRepository;
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

    public boolean createServ(final Reserve reserve){
        if(reserve == null){
            log.warn("new show cannot be null!");
        }
        boolean flag = repository.create(reserve);
        if(flag) log.info("새로운 reserve id:{} 이 저장되었습니다.", reserve);
        return flag;
    }

    public List<Reserve> showListServ(){
        return new ArrayList<>(repository.listAll());
    }

    public List<ReserveOutDto> showOutDtoListServ() {return new ArrayList<>(repository.listOutDtos());}
}
