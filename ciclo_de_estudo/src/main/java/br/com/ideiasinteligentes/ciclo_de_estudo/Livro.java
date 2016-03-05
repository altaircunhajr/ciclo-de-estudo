package br.com.ideiasinteligentes.ciclo_de_estudo;

public class Livro extends Material {

	private Long tamanhoEmPaginas;
	
	@Override
	public Long getTamanho() {
		return this.tamanhoEmPaginas;
	}

}
