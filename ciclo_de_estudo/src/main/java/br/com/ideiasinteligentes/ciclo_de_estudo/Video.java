package br.com.ideiasinteligentes.ciclo_de_estudo;

public class Video extends Material {

	private Long tamanhoEmSegundos;
	
	@Override
	public Long getTamanho() {
		return this.tamanhoEmSegundos;
	}

}
