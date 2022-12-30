package com.example.server.reserve.repository;

import com.example.server.reserve.dto.ReserveOutDto;
import com.example.server.reserve.entity.Reserve;
import com.example.server.reserve.entity.ShowSeat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReserveRepository {

    boolean create(Reserve reserve);
    boolean createSeat(ShowSeat showseat);
    List<Reserve> listAll();
    List<ReserveOutDto> listDTO();
}
