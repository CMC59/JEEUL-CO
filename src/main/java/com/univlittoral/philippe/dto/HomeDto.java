package com.univlittoral.philippe.dto;

import java.util.List;

public class HomeDto {
	private List<LivreDto> livres;
	private IndicateursDto indicateurs;

	public List<LivreDto> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDto> livres) {
		this.livres = livres;
	}
	public IndicateursDto getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateursDto indicateurs) {
		this.indicateurs = indicateurs;
	}
}
