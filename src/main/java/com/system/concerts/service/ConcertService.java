package com.system.concerts.service;

import com.system.concerts.entity.Concert;
import com.system.concerts.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertService {

    @Autowired
    private ConcertRepository repository;

    public Concert saveConcert(Concert concert){return repository.save(concert);}

    public List<Concert> saveConcerts(List<Concert> concerts){return repository.saveAll(concerts);}

    public List<Concert> getConcerts(){return repository.findAll();}

    public Concert getConcertById(int id){return repository.findById(id).orElse(null);}

    public Concert getConcertByTitle(String title){return repository.findByTitle(title);}

    public String deleteConcert(int id){
        repository.deleteById(id);
        return "concert removed !!!" +id;
    }

    public  Concert updateConcert(Concert concert){
        Concert existingConcert = repository.findById(concert.getId()).orElse(null);
        existingConcert.setTitle(concert.getTitle());
        existingConcert.setDate(concert.getDate());
        existingConcert.setArtistname(concert.getArtistname());
        existingConcert.setCategory(concert.getCategory());
        return repository.save(existingConcert);
    }
}