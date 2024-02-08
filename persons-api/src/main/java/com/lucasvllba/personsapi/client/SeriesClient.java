package com.lucasvllba.personsapi.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lucasvllba.personsapi.dto.SeriesDto;

@FeignClient(name = "mvsc-series", url = "localhost:8010/api/v1/series")
public interface SeriesClient {
    @GetMapping("/by-director/{directorId}")
    public List<SeriesDto> getAllByDirectorId(@PathVariable Long directorId);
    @GetMapping("/by-actor/{actorId}")
    public List<SeriesDto> getAllByActorId(@PathVariable Long actorId);
}
