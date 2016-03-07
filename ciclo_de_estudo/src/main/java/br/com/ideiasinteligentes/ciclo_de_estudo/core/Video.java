package br.com.ideiasinteligentes.ciclo_de_estudo.core;

import javax.persistence.DiscriminatorValue;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.material.Material;

@DiscriminatorValue(value = "video")
public class Video extends Material {

	private Long tamanhoEmSegundos;
	
	@Override
	public Long getTamanho() {
		return this.tamanhoEmSegundos;
	}

}
