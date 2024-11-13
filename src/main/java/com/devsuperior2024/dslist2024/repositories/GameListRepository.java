package com.devsuperior2024.dslist2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior2024.dslist2024.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	

}
