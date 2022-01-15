package com.devrs.dsmovie.repositories;

import com.devrs.dsmovie.entities.Movie;
import com.devrs.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

    User findByEmail(String email);

}
