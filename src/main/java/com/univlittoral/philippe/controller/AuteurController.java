package com.univlittoral.philippe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.univlittoral.philippe.dto.AuteurDto;
import com.univlittoral.philippe.mapper.AuteurMapper;
import com.univlittoral.philippe.service.AuteurService;


@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "rest/bd/auteurs") //=> l’URL d’accès à votre controller.
public class AuteurController {
	@Autowired
	private AuteurService service;
	
	@GetMapping
	public List<AuteurDto> listeAuteurs(){
		return AuteurMapper.map(service.findAll());
	}
	@GetMapping(value="{id}")
	public AuteurDto findOneAuteur(@PathVariable Long id) {
		return AuteurMapper.map(service.findById(id));
	}
}
