package com.devsuperior2024.dslist2024.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior2024.dslist2024.dto.GameListDTO;
import com.devsuperior2024.dslist2024.services.GameListService;

@RestController
@RequestMapping(value= "/lists") // Configurando o recurso. Criando uma rota "/games"
public class GameListController {
	
	@Autowired
	private GameListService gameListService; // Injetando um GameListService
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	
	}
}
