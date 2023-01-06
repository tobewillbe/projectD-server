package com.example.server.movie.dto;

import com.example.server.movie.entity.Movie;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindAllDTO {

    private int count; // 할 일 목록의 개수
    private List<MovieMainDTO> movies; // userId가 빠진 할일 목록

    public FindAllDTO(List<Movie> movieList) {
        this.count = movieList.size();
        this.convertDtoList(movieList);
    }

    // List<Movie>를 받으면 List<MovieMainDTO>로 변환하는 메서드
    public void convertDtoList(List<Movie> movieList) {
        List<MovieMainDTO> dtos = new ArrayList<>();

        for (Movie movie : movieList) {
            dtos.add(new MovieMainDTO(movie));
        }
        this.movies = dtos;
    }
}
