package com.univlittoral.philippe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.philippe.entity.AuteurEntity;
import com.univlittoral.philippe.repository.AuteurRepository;

@Service
public class AuteurService {
	@Autowired
	private AuteurRepository repo;
	
	public List<AuteurEntity> findAll(){
		return repo.findAll();
	}
	public AuteurEntity findById(Long id) {
		return repo.findById(id).orElse(null);
	}
}
