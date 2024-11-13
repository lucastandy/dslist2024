package com.devsuperior2024.dslist2024.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior2024.dslist2024.dto.GameListDTO;
import com.devsuperior2024.dslist2024.dto.GameMinDTO;
import com.devsuperior2024.dslist2024.entities.GameList;
import com.devsuperior2024.dslist2024.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository; // Injetando uma instância do GameListRepository na classe GameService.
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}

}
