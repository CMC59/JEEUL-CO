package com.univlittoral.philippe.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.philippe.dto.LivreDto;
import com.univlittoral.philippe.entity.LivreEntity;

public class LivreMapper {
public static LivreDto map(LivreEntity entity) {
		LivreDto livre = new LivreDto();
		//HomeDto home = new HomeDto();
		
		livre.setId(entity.getId());
		livre.setNom(entity.getNom());
		livre.setEditeur(entity.getEditeur());
		livre.setNbPages(entity.getnbPages());
		livre.setDateParution(entity.getDateParution());
		livre.setLieuParution(entity.getLieuParution());
		livre.setGenre(entity.getGenre());
		livre.setIdauteur(entity.getIdauteur());
		
		
		return livre;
	}
public static List<LivreDto> map(List<LivreEntity> entities){
	if(null == entities) {
		return null;
	}
	List<LivreDto> result = new ArrayList<LivreDto>();
	for(final LivreEntity livre : entities) {
		result.add(LivreMapper.map(livre));
	}
	return result;
	}
}
