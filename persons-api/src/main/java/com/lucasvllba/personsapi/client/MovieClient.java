package com.lucasvllba.personsapi.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lucasvllba.personsapi.dto.MovieDto;

@FeignClient(name = "mvsc-movies", url = "localhost:8010/api/v1/movies")
public interface MovieClient {
    @GetMapping("/by-director/{directorId}")
    public List<MovieDto> getAllByDirectorId(@PathVariable Long directorId);
}
