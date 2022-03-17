package com.system.concerts.controller;

import com.system.concerts.entity.Concert;
import com.system.concerts.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConcertController {

    @Autowired
    private ConcertService service;

    @PostMapping("/addConcert")
    public Concert addConcert(@RequestBody Concert concert){
        return service.saveConcert(concert);
    }

    @PostMapping("/addConcerts")
    public List<Concert> addConcerts(@RequestBody List<Concert> concerts){
        return service.saveConcerts(concerts);
    }

    @GetMapping("/concerts")
    public List<Concert> findAllConcerts() {
        return  service.getConcerts();
    }

    @GetMapping("/concertById/{id}")
    public Concert findConcertById(@PathVariable int id) {
        return  service.getConcertById(id);
    }

    @GetMapping("/concert/{title}")
    public Concert findConcertByTitle(@PathVariable String title) {
        return  service.getConcertByTitle(title);
    }

    @PutMapping("/updateCon")
    public  Concert updateConcert(@RequestBody Concert concert){ return  service.updateConcert(concert);}

    @DeleteMapping("/deleteCon/{id}")
    public  String deleteConcert(@PathVariable int id){ return  service.deleteConcert(id);}
}