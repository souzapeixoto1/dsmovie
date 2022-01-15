package com.devrs.dsmovie.services;

import com.devrs.dsmovie.dto.MovieDTO;
import com.devrs.dsmovie.entities.Movie;
import com.devrs.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional
    public Page<MovieDTO> findAll(Pageable pageable){    //esse método faz com que retorne os filmes em páginas e não busque o banc
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    public MovieDTO findById(Long id){    //esse método faz com que retorne os filmes em páginas e não busque o banc
        Movie result = repository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;

    }

}
