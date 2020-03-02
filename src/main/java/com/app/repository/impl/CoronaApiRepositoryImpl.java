package com.app.repository.impl;

import com.app.repository.CoronaApiRepository;
import com.app.uri.CoronaUri;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@Component
public class CoronaApiRepositoryImpl implements CoronaApiRepository {

    @Override
    public WebClient getConfirmed()
    {
        WebClient webClient = WebClient.builder().baseUrl(CoronaUri.CONFIRMED).build();
        return webClient;
    }

    @Override
    public WebClient getDeaths() {
        WebClient webClient = WebClient.builder().baseUrl(CoronaUri.DEATHS).build();
        return webClient;
    }

    @Override
    public WebClient getRecovered() {
        WebClient webClient = WebClient.builder().baseUrl(CoronaUri.RECOVERED).build();
        return webClient;
    }

    @Override
    public WebClient getAllInfo() {
        WebClient webClient = WebClient.builder().baseUrl(CoronaUri.ALL).build();
        return webClient;
    }
}
