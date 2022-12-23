package com.example.server.show.service;

import com.example.server.show.dto.ShowOutDto;
import com.example.server.show.entity.Show;
import com.example.server.show.repository.ShowRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
        return flag;
    }

    public List<Show> showListServ(){
        return new ArrayList<>(repository.showList());
    }

    public List<ShowOutDto> showOutDtoListServ() {return new ArrayList<>(repository.showOutDtoList());}
}
