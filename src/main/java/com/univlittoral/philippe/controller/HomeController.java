package com.univlittoral.philippe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.philippe.dto.HomeDto;
import com.univlittoral.philippe.dto.IndicateursDto;
import com.univlittoral.philippe.entity.AuteurEntity;
import com.univlittoral.philippe.entity.LivreEntity;
import com.univlittoral.philippe.mapper.LivreMapper;
import com.univlittoral.philippe.service.AuteurService;
import com.univlittoral.philippe.service.LivreService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "rest/bd") //=> l’URL d’accès à votre controller.
public class HomeController {
	@Autowired
	private LivreService service;
	@Autowired
	private AuteurService auteurservice;
	
	@GetMapping(value="/home")
	public HomeDto getHome() {
		
		final List<LivreEntity> livresEntities = service.findAll();
		final List<AuteurEntity> auteursEntities = auteurservice.findAll();


		
		final HomeDto homeDto = new HomeDto();
		final IndicateursDto indicateursDto = new IndicateursDto();
		
		indicateursDto.setNbAuteurs(auteursEntities.size());
		indicateursDto.setNbLivres(livresEntities.size());
		indicateursDto.setNbGenres(4);

		homeDto.setIndicateurs(indicateursDto);
		homeDto.setLivres(LivreMapper.map(livresEntities));

		
		return homeDto;
	}
}
