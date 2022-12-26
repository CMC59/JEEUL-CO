package com.univlittoral.philippe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.philippe.entity.LivreEntity;
import com.univlittoral.philippe.enums.TypeEnum;
import com.univlittoral.philippe.repository.LivreRepository;
import com.univlittoral.philippe.service.LivreService;

@Service
public class LivreService {
	@Autowired
	private LivreRepository repo; 
	
	public List<LivreEntity> listeLivres(){
		return repo.findAll();
	}
	public LivreEntity findById(Long id) {
		return repo.findById(id).orElse(null);
	}
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	public void addLivre(LivreEntity livre) {
		repo.save(livre);
	}
	public List<LivreEntity> findAll() {
		return repo.findAll();
	}
	public LivreEntity updatelivre(LivreEntity livre, Long id) {
		LivreEntity livreupdate = repo.findById(id).orElse(null);
		livreupdate.setId(livre.getId());
		livreupdate.setNom(livre.getNom());
		livreupdate.setDateParution(livre.getDateParution());
		livreupdate.setLieuParution(livre.getLieuParution());
		livreupdate.setNombredepages(livre.getnbPages());
		livreupdate.setGenre(livre.getGenre());
	
		return repo.saveAndFlush(livreupdate);
	}
	public List<LivreEntity> findbytype(TypeEnum genre){
		return repo.findByType(genre);
	}
}
