package com.app.controller.rest;

import com.app.model.ApiResponse;
import com.app.service.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@RestController
@RequestMapping("/api")
public class CoronaRestController {

    @Autowired
    private CoronaService service;

    @GetMapping(value = "/confirmed",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<ApiResponse> getConfirmed(){

        return service.getConfirmed().map(data->new ApiResponse(data, HttpStatus.OK));
    }

    @GetMapping(value = "/all",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<ApiResponse> getAll(){

        return service.getAllInfo().map(data->new ApiResponse(data, HttpStatus.OK));
    }

}
