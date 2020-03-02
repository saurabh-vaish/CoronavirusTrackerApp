package com.app.config;

import com.app.uri.CoronaUri;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@Configuration
public class WebClientConfiguration {

    @Bean
    public WebClient webClient(){

        ExchangeStrategies exchangeStrategies = ExchangeStrategies.builder()
                .codecs(configurer -> configurer.defaultCodecs()
                        .maxInMemorySize(-1))
                .build();

        return  WebClient.builder().baseUrl(CoronaUri.BASEURL)
                .exchangeStrategies(exchangeStrategies).build();

    }

}
