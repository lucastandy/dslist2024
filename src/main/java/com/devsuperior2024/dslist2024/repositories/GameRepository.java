package com.devsuperior2024.dslist2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior2024.dslist2024.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	

}
