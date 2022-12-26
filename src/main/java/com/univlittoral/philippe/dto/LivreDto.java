package com.univlittoral.philippe.dto;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.philippe.enums.TypeEnum;

public class LivreDto {
	private Long id;
	private String nom;
	private String editeur;
	private Integer nbPages;
	private Date dateParution;
	private String lieuParution;
	@Enumerated(EnumType.STRING)
	private TypeEnum genre;
	private Long idauteur;
	private AuteurDto infosAuteurs;
	
	
	public Long getIdauteur() {
		return idauteur;
	}
	public void setIdauteur(Long idauteur) {
		this.idauteur = idauteur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public String getLieuParution() {
		return lieuParution;
	}
	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	public TypeEnum getGenre() {
		return genre;
	}
	public void setGenre(TypeEnum genre) {
		this.genre = genre;
	}
	public AuteurDto getInfosAuteurs() {
		return infosAuteurs;
	}
	public void setInfosAuteurs(AuteurDto infosAuteurs) {
		this.infosAuteurs = infosAuteurs;
	}

	

}
