package br.com.ideiasinteligentes.ciclo_de_estudo.core;

import javax.persistence.DiscriminatorValue;

import br.com.ideiasinteligentes.ciclo_de_estudo.core.material.Material;

@DiscriminatorValue(value = "livro")
public class Livro extends Material {

	private Long tamanhoEmPaginas;
	
	@Override
	public Long getTamanho() {
		return this.tamanhoEmPaginas;
	}

}
