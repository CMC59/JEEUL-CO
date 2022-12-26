package com.univlittoral.philippe.dto;

public class IndicateursDto {
	private Integer nbAuteurs;
	private Integer nbGenres;
	private Integer nbLivres;
	
	public Integer getNbLivres() {
		return nbLivres;
	}
	public void setNbLivres(Integer nbLivres) {
		this.nbLivres = nbLivres;
	}
	public Integer getNbAuteurs() {
		return nbAuteurs;
	}
	public void setNbAuteurs(Integer nbAuteurs) {
		this.nbAuteurs = nbAuteurs;
	}
	public Integer getNbGenres() {
		return nbGenres;
	}
	public void setNbGenres(Integer nbGenres) {
		this.nbGenres = nbGenres;
	}
}
