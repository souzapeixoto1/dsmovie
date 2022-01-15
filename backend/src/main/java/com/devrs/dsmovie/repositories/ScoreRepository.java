package com.devrs.dsmovie.repositories;

import com.devrs.dsmovie.entities.Score;
import com.devrs.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository <Score, ScorePK>{


    
}
