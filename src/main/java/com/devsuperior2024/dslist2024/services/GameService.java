package com.devsuperior2024.dslist2024.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior2024.dslist2024.dto.GameDTO;
import com.devsuperior2024.dslist2024.dto.GameMinDTO;
import com.devsuperior2024.dslist2024.entities.Game;
import com.devsuperior2024.dslist2024.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; // Injetando uma instância do GameRepository na classe GameService.
	
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
