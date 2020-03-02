package com.app.service.impl;

import com.app.model.CoronaAllInfo;
import com.app.model.CoronaLatest;
import com.app.model.CoronaTracker;
import com.app.service.CoronaService;
import com.app.uri.CoronaUri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@Service
public class CoronaServiceImpl implements CoronaService {

    @Autowired
    private WebClient webClient;

//    public CoronaServiceImpl(){
//        webClient = WebClient.builder().baseUrl(CoronaUri.BASEURL).build();
//    }

    @Override
    public Mono<CoronaTracker> getConfirmed() {
        return  webClient.get().uri(CoronaUri.CONFIRMED)
                .retrieve()
                .bodyToMono(CoronaTracker.class);
    }

    @Override
    public Mono<CoronaTracker> getDeaths() {
        return  webClient.get().uri(CoronaUri.DEATHS)
                .retrieve()
                .bodyToMono(CoronaTracker.class);
    }

    @Override
    public Mono<CoronaTracker> getRecovered() {
        return  webClient.get().uri(CoronaUri.RECOVERED)
                .retrieve()
                .bodyToMono(CoronaTracker.class);
    }

    @Override
    public Mono<CoronaAllInfo> getAllInfo() {
        return  webClient.get().uri(CoronaUri.ALL)
                .retrieve()
                .bodyToMono(CoronaAllInfo.class);
    }

    @Override
    public Mono<CoronaLatest> getLatest() {
        return  webClient.get().uri(CoronaUri.ALL)
                .retrieve()
                .bodyToMono(CoronaAllInfo.class)
                .map(map-> new CoronaLatest(
                            map.getLatest().getConfirmed(),
                            map.getLatest().getDeaths(),
                            map.getLatest().getRecovered())
                );
    }
}
