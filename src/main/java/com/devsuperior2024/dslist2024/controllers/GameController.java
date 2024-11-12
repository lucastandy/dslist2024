package com.devsuperior2024.dslist2024.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior2024.dslist2024.dto.GameDTO;
import com.devsuperior2024.dslist2024.dto.GameMinDTO;
import com.devsuperior2024.dslist2024.services.GameService;

@RestController
@RequestMapping(value= "/games") // Configurando o recurso. Criando uma rota "/games"
public class GameController {
	
	@Autowired
	private GameService gameService; // Injetando um GameService
	
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	
	}
}
