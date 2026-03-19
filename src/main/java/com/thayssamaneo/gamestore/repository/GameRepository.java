package com.thayssamaneo.gamestore.repository;

import org.springframework.data.repository.CrudRepository;
import com.thayssamaneo.gamestore.model.Game;


public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
