package com.app.repository;

import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

public interface CoronaApiRepository {

    public WebClient getConfirmed();

    public WebClient getDeaths();

    public WebClient getRecovered();

    public WebClient getAllInfo();

}
