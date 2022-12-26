package com.univlittoral.philippe.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.philippe.dto.AuteurDto;
import com.univlittoral.philippe.entity.AuteurEntity;

public class AuteurMapper {
	public static AuteurDto map(AuteurEntity entity) {
		AuteurDto auteur = new AuteurDto();
		auteur.setId(entity.getId());
		auteur.setNom(entity.getNom());
		auteur.setPrenom(entity.getPrenom());
		auteur.setDateNaissance(entity.getDateNaissance());
		
		return auteur;
	}
	
	public static List<AuteurDto> map(List<AuteurEntity> entities){
		if(null == entities) {
			return null;
		}
		List<AuteurDto> result = new ArrayList<AuteurDto>();
		for(final AuteurEntity auteur : entities) {
			result.add(AuteurMapper.map(auteur));
		}
		return result;
		}
}
