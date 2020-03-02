package com.app.service;

import com.app.model.CoronaAllInfo;
import com.app.model.CoronaLatest;
import com.app.model.CoronaTracker;
import reactor.core.publisher.Mono;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */
public interface CoronaService {

    public Mono<CoronaTracker> getConfirmed();

    public Mono<CoronaTracker> getDeaths();

    public Mono<CoronaTracker> getRecovered();

    public Mono<CoronaLatest> getLatest();

    public Mono<CoronaAllInfo> getAllInfo();

}
