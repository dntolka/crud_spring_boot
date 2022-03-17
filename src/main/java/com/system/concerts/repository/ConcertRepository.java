package com.system.concerts.repository;

import com.system.concerts.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Integer> {
    public Concert findByTitle(String title);
}