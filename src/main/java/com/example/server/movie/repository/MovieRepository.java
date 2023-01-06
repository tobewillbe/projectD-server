package com.example.server.movie.repository;

import com.example.server.movie.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
// 역할: 영화상세정보 데이터를 CRUD한다(생성, 조회, 수정, 삭제)
public interface MovieRepository {

    boolean save(Movie movie);

    List<Movie> findAll();

    Movie findOne(String movieCd);

    boolean remove(String movieCd);

    boolean modify(Movie movie);


}
