package com.devrs.dsmovie.repositories;

import com.devrs.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long>{


    
}
