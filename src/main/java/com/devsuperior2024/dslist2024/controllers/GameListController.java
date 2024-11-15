package com.devsuperior2024.dslist2024.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior2024.dslist2024.dto.GameListDTO;
import com.devsuperior2024.dslist2024.dto.GameMinDTO;
import com.devsuperior2024.dslist2024.services.GameListService;
import com.devsuperior2024.dslist2024.services.GameService;

@RestController
@RequestMapping(value= "/lists") // Configurando o recurso. Criando uma rota "/games"
public class GameListController {
	
	@Autowired
	private GameListService gameListService; // Injetando um GameListService
	
	@Autowired
	private GameService gameService; // Injetando um GameService
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value="/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}