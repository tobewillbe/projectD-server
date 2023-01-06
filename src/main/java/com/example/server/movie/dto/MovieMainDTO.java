package com.example.server.movie.dto;

import com.example.server.movie.entity.Movie;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class MovieMainDTO {

    private String movieCd;         // 영화코드
    private String movieNm;         // 영화명(국문)

    public MovieMainDTO(Movie movie) {
        movieCd = movie.getMovieCd();
        movieNm = movie.getMovieNm();
    }
}
