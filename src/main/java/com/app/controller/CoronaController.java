package com.app.controller;

import com.app.model.Locations;
import com.app.service.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

import java.util.Comparator;
import java.util.List;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 01-Mar-20
 */

@Controller
public class CoronaController {

    @Autowired
    private CoronaService service;


    @GetMapping("/")
    public String getHome(Model map){
        map.addAttribute("active", "all");
        map.addAttribute("corona", service.getAllInfo());
        return "index";
    }

    @GetMapping(value = "/all")
    public String getAll(Model map){
        map.addAttribute("active", "all");
        map.addAttribute("corona", service.getAllInfo());
        return "index";
    }

    @GetMapping(value = "/confirmed")
    public String getConfirmed(Model map){
        map.addAttribute("active", "confirmed");
        map.addAttribute("corona", service.getConfirmed());
        return "confirmed";
    }

    @GetMapping(value = "/deaths")
    public String getDeaths(Model map){
        map.addAttribute("active", "deaths");
        map.addAttribute("corona", service.getDeaths());
        return "deaths";
    }

    @GetMapping(value = "/recovered")
    public String getRecovered(Model map){
        map.addAttribute("active", "recovered");
        map.addAttribute("corona", service.getDeaths());
        return "recovered";
    }

    @GetMapping(value = {"/history/country/{country}"})
    public String getHistory(@PathVariable String country, Model map){
        map.addAttribute("active", "");

        Locations locations = new Locations();

        Mono<List<Locations>> loc = service.getConfirmed().map(info->info.getLocations());

       Mono<Locations> mono = loc.doOnNext(l->{
                Locations loca  = l.stream().filter(lc->lc.getCountry().equalsIgnoreCase(country)).findFirst().get();
                locations.setCoordinates(loca.getCoordinates());
                locations.setCountry(loca.getCountry());
                locations.setHistory(loca.getHistory());
                locations.setProvince(loca.getProvince());
                locations.setLatest(loca.getLatest());
       }).map(l->l.get(0));

        map.addAttribute("corona", locations);
        map.addAttribute("mono",mono );
        return "history";
    }


    @GetMapping(value = {"/history/state/{state}"})
    public String getHistoryState(@PathVariable String state, Model map){
        map.addAttribute("active", "");

        Locations locations = new Locations();

        Mono<List<Locations>> loc = service.getConfirmed().map(info->info.getLocations());

        Mono<Locations> mono = loc.doOnNext(l->{
            Locations loca  = l.stream().filter(lc->lc.getProvince().equalsIgnoreCase(state)).findFirst().get();
            locations.setCoordinates(loca.getCoordinates());
            locations.setCountry(loca.getCountry());
            locations.setHistory(loca.getHistory());
            locations.setProvince(loca.getProvince());
            locations.setLatest(loca.getLatest());
        }).map(l->l.get(0));

        map.addAttribute("corona", locations);
        map.addAttribute("mono",mono );
        return "history";
    }



}
